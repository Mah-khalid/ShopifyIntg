package com.app.model;

import java.util.List;

import com.app.db.Product;

public class ShopifyProductReponse
{
    private List<Product> products;

    public List<Product> getProducts ()
    {
        return products;
    }

    public void setProducts (List<Product> products)
    {
        this.products = products;
    }
}