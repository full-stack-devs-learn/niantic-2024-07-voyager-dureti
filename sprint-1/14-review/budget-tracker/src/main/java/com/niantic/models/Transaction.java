package com.niantic.models;

public class Transaction
{
    private int transaction_id;
    private int user_id;
    private int sub_category_id;
    private int vendor_id;
    private String transaction_date;
    private double amount;
    private String notes;

    public Transaction(){}

    public Transaction(int transaction_id, int user_id, int sub_category_id, int vendor_id, String transaction_date, double amount, String notes) {
        this.transaction_id = transaction_id;
        this.user_id = user_id;
        this.sub_category_id = sub_category_id;
        this.vendor_id = vendor_id;
        this.transaction_date = transaction_date;
        this.amount = amount;
        this.notes = notes;
    }

    public int getTransaction_id() {
        return transaction_id;
    }

    public void setTransaction_id(int transaction_id) {
        this.transaction_id = transaction_id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getSub_category_id() {
        return sub_category_id;
    }

    public void setSub_category_id(int sub_category_id) {
        this.sub_category_id = sub_category_id;
    }

    public int getVendor_id() {
        return vendor_id;
    }

    public void setVendor_id(int vendor_id) {
        this.vendor_id = vendor_id;
    }

    public String getTransaction_date() {
        return transaction_date;
    }

    public void setTransaction_date(String transaction_date) {
        this.transaction_date = transaction_date;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
}
