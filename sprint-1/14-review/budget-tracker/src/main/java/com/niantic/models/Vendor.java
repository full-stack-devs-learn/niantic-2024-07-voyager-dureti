package com.niantic.models;

public class Vendor
{
    private int vendor_id;
    private String vendor_name;
    private String website;

    public Vendor(){}

    public Vendor(int vendor_id, String vendor_name, String website) {
        this.vendor_id = vendor_id;
        this.vendor_name = vendor_name;
        this.website = website;
    }

    public int getVendor_id() {
        return vendor_id;
    }

    public void setVendor_id(int vendor_id) {
        this.vendor_id = vendor_id;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getVendor_name() {
        return vendor_name;
    }

    public void setVendor_name(String vendor_name) {
        this.vendor_name = vendor_name;
    }
}
