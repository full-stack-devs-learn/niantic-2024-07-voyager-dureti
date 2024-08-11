package com.niantic.services;

import com.niantic.models.Transaction;
import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import java.math.BigDecimal;
import java.util.ArrayList;

public class TransactionDao
{
    private JdbcTemplate jdbcTemplate;

    public TransactionDao()
    {
        // Create a data source

        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setUrl("jdbc:mysql://localhost:3306/budget");
        dataSource.setUsername("root");
        dataSource.setPassword("P@ssw0rd");

        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public void addTransaction(Transaction transaction)
    {
        String sql = """
        SELECT transaction_id
               , user_id;
               , sub_category_id
               , vendor_id
               , transaction_date
               , amount
               , notes
        FROM transactions
        VALUES
        (?,?,?,?,?,?,?)
        """;

        jdbcTemplate.update(sql
                    , transaction.getTransactionId()
                    , transaction.getUserId()
                    , transaction.getSubCategoryId()
                    , transaction.getVendorId()
                    , transaction.getTransactionDate()
                    , transaction.getAmount()
                    , transaction.getNotes()
        );
    }

    // get all transaction by user with userId

    public ArrayList<Transaction> getTransactionByUser(int userId)
    {
        // create empty array list

        ArrayList<Transaction> transactions = new ArrayList<>();

        // build query

        String sql = """
        SELECT transaction_id
               , sub_category_id
               , vendor_id
               , transaction_date
               , amount
               , notes
        FROM transactions
        WHERE user_id = ?;
        """;

        // execute the query

        SqlRowSet row = jdbcTemplate.queryForRowSet(sql, userId);

        // loop through the rows

        while(row.next())
        {
            int transactionId = row.getInt("transaction_id");
            int subCategoryId = row.getInt("subCategory_id");
            int vendorId = row.getInt("vendor_id");
            int transactionDate = row.getInt("transaction_date");
            BigDecimal amount = row.getBigDecimal("amount");

        }

        return null;

    }
}
