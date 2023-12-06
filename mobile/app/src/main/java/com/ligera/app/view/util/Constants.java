package com.ligera.app.view.util;

import com.ligera.app.R;
import com.ligera.app.model.entity.Product;

import java.util.ArrayList;

public class Constants {
    public static ArrayList<Product> getProductData() {
        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product("Hoodie", R.drawable.hoodie, "Hello", "200", 2, 1, "Ligera","XL"));
        products.add(new Product("Hoodie", R.drawable.attire, "Hello", "400", 2, 1, "Ligera","XL"));
        products.add(new Product("Hoodie", R.drawable.done, "Hello", "800", 2, 1, "Ligera","XL"));
        products.add(new Product("Hoodie", R.drawable.made, "Hello", "1000", 2, 1, "Ligera","XL"));
        products.add(new Product("Hoodie", R.drawable.shirt, "Hello", "1200", 2, 1, "Ligera","XL"));
        products.add(new Product("Hoodie", R.drawable.sown, "Hello", "1400", 2, 1, "Ligera","XL"));
        products.add(new Product("Hoodie", R.drawable.style, "Hello", "1600", 2, 1, "Ligera","XL"));
        products.add(new Product("Hoodie", R.drawable.tailor, "Hello", "1800", 2, 1, "Ligera","XL"));
        products.add(new Product("Hoodie", R.drawable.worn, "Hello", "1800", 2, 1, "Ligera","XL"));
        return products;
    }
}
