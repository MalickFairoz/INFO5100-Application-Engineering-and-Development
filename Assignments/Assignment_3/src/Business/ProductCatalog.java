/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Malick
 */
public class ProductCatalog {

    private ArrayList<Product> productCatalog;

    public ProductCatalog() {
        this.productCatalog = new ArrayList<Product>();
    }

    public ArrayList<Product> getProductCatalog() {
        return productCatalog;
    }

    public void setProductCatalog(ArrayList<Product> productCatalog) {
        this.productCatalog = productCatalog;
    }

    public Product addProduct() {
        Product pc = new Product();
        productCatalog.add(pc);
        return pc;
    }

    public void deleteProduct(Product p) {
        productCatalog.remove(p);

    }

    public Product searchProduct(String modelNumber) {
        for (Product product : productCatalog) {
            if (product.getModelNumber().equals(modelNumber)) {
                return product;
            }
        }
        return null;

    }

}
