package com.niantic.services;

import com.niantic.models.Category;
import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import java.util.ArrayList;

public class CategoryDao
{
    private JdbcTemplate jdbcTemplate;

    public CategoryDao()
    {
        // Create a data source

        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setUrl("jdbc:mysql://localhost:3306/budget");
        dataSource.setUsername("root");
        dataSource.setPassword("P@ssw0rd");

        jdbcTemplate = new JdbcTemplate(dataSource);
    }
    public ArrayList<Category> getCategories()
    {
        // create the empty ArrayList
        ArrayList<Category> categories = new ArrayList<>();

        //  build your query
        String sql = """
        SELECT category_id, category_name, description
        FROM categories
        """;

        // execute the query
        SqlRowSet row = jdbcTemplate.queryForRowSet(sql);

        // loop through the rows

        while(row.next())
        {
            int categoryId = row.getInt("category_id");
            String categoryName = row.getString("category_name");
            String description = row.getString("description");

            Category category = new Category(categoryId, categoryName, description);

            categories.add(category);
        }

        // return the ArrayList
        return categories;
    }

    // return category using category_id


    public Category getCategoryById(int categoryId)
    {
        String sql = """
                SELECT category_id
                    , category_name
                    , description
                FROM categories
                WHERE category_id = ?;
                """;
        var row = jdbcTemplate.queryForRowSet(sql, categoryId);

        if(row.next())
        {
            int id = row.getInt("category_id");
            String categoryName = row.getString("category_name");
            String description = row.getString("description");

            return new Category(id, categoryName, description);
        }
        return null;
    }

    // add category

    public void addCategory(Category category)
    {
        String sql = """
                    INSERT INTO categories
                    (category_name
                    , description)
                    VALUES
                    (?, ?);
                """;

        jdbcTemplate.update(sql,
                category.getCategoryName(),
                category.getDescription()
        );
    }

    // update with category_id
    public void updateCategory(Category category) {
        String sql = """
                    UPDATE categories
                    SET category_name = ?
                        , description = ?
                    WHERE category_id = ?;
                """;

        jdbcTemplate.update(sql,
                category.getCategoryName(),
                category.getDescription(),
                category.getCategoryId()
        );
    }

    // delete with category_id
    public void deleteCategory(int categoryId)
    {
        String sql = "DELETE FROM categories WHERE category_id = ?;";

        jdbcTemplate.update(sql, categoryId);
    }



}
