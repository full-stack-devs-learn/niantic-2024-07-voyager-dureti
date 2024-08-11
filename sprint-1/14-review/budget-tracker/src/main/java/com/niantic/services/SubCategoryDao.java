package com.niantic.services;

import com.niantic.models.SubCategory;
import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import java.util.ArrayList;

public class SubCategoryDao {
    private JdbcTemplate jdbcTemplate;

    public SubCategoryDao() {
        // Create a data source

        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setUrl("jdbc:mysql://localhost:3306/budget");
        dataSource.setUsername("root");
        dataSource.setPassword("P@ssw0rd");

        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public ArrayList<SubCategory> getSubCategories() {
        // create the empty ArrayList
        ArrayList<SubCategory> subCategories = new ArrayList<>();

        // build the query

        String sql = """
                SELECT sub_category_id
                       , category_id
                       , sub_category_name
                       , description
                """;

        // 2. execute the query
        SqlRowSet row = jdbcTemplate.queryForRowSet(sql);

        // loop through the rows

        while (row.next()) {
            int subCategoryId = row.getInt("sub_category_id");
            int categoryId = row.getInt("category_id");
            String subCategoryName = row.getString("category_name");
            String description = row.getString("description");

            SubCategory subCategory = new SubCategory(subCategoryId, categoryId, subCategoryName, description);

            subCategories.add(subCategory);
        }
        return subCategories;
    }

    public SubCategory getSubCategoryById(int subcategoryId)
    {
        String sql = """
        SELECT sub_category_id
                 , category_id
                 , sub_category_name
                 , description
        """;
        var row = jdbcTemplate.queryForRowSet(sql, subcategoryId);

        if(row.next()){
            int subCategoryId = row.getInt("sub_category_id");
            int id = row.getInt("category_id");
            String subCategoryName = row.getString("category_name");
            String description = row.getString("description");

            return new SubCategory(subCategoryId, id, subCategoryName, description);
        }
        return null;
    }

    public void addSubCategory(SubCategory subCategory)
    {
        String sql = """
        INSERT INTO sub_categories
        (sub_category_id
                 , category_id
                 , sub_category_name
                 , description)
        VALUES
        (?,?,?,?)
        """;

        jdbcTemplate.update(sql
                            , subCategory.getSubCategoryId()
                            , subCategory.getCategoryId()
                            , subCategory.getSubCategoryName()
                            , subCategory.getDescription()
        );
    }

    public void updateSubCategory(SubCategory subCategory)
    {
        String sql = """
        UPDATE sub_categories
        SET sub_category_id = ?
                 , category_id = ?
                 , sub_category_name = ?
                 , description = ?
        """;

        jdbcTemplate.update(sql
                , subCategory.getSubCategoryId()
                , subCategory.getCategoryId()
                , subCategory.getSubCategoryName()
                , subCategory.getDescription()
        );
    }

    public void deleteSubCategory(int subCategoryId)
    {
        String sql = "DELETE FROM sub_categories WHERE sub_category_id = ?;";

        jdbcTemplate.update(sql, subCategoryId);
    }
}