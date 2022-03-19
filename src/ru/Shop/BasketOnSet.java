package ru.shop;

import ru.Product.Product;
import java.util.Collection;
import java.util.HashSet;

public class BasketOnSet extends Basket {

   private Collection<Product> products = new HashSet<>();
    @Override
    public void addProduct(Product p) {
        products.add(p);
    }

    @Override
    public Object[] getProducts() {
        return products.toArray();
    }

}


