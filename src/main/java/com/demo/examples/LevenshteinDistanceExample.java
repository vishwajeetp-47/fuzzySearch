package com.demo.examples;

import Entity.Product;
import org.apache.commons.text.similarity.LevenshteinDistance;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LevenshteinDistanceExample {
    //Threshold = if the result score is below or equal to threshold then it will print result matches
    static double threshold = 5;
    public List<Product> findFuzzyProducts(String query) {
        LevenshteinDistance levenshteinDistance = new LevenshteinDistance();
        List<Product> products = new ArrayList<>();

        // Add products to the list
        products.add(new Product("P001", "BayHome", "Electronics"));
        products.add(new Product("P002", "ShoreHome", "Electronics"));
        products.add(new Product("P003", "Leather Jacket", "Apparel"));
        products.add(new Product("P004", "Running Shoes", "Apparel"));
        products.add(new Product("P005", "Coffee Maker", "Home Appliances"));

        return products.stream()
                .filter(product -> {
                    int distance = levenshteinDistance.apply(product.getName().toLowerCase(), query.toLowerCase());
                    System.out.println(distance);
                    return distance <= threshold;
                })
                .collect(Collectors.toList());
    }
}
