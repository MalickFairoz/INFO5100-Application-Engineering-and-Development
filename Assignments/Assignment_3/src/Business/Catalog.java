/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author Malick
 */
public class Catalog {
    private String name;
    private ProductCatalog productCatalog;
    
    public Catalog(){
        productCatalog = new ProductCatalog();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
 

    public ProductCatalog getProductCatalog() {
        return productCatalog;
    }

    public void setProductCatalog(ProductCatalog productCatalog) {
        this.productCatalog = productCatalog;
    }
    
    

    @Override
    public String toString() {
        return name; //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
