/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.Comparator;

/**
 *
 * @author Malick
 */
public class Product {

    private String productName;
    private String modelNumber;
    private String vendorName;
    private String productDescribtion;
    private String basePrice;
    private String ceilingPrice;
    private String floorsPrice;
    private String feature;
    private String benifits;

    public static Comparator<Product> ascendingOrder = new Comparator<Product>() {

        public int compare(Product s1, Product s2) {
            double s1v = Double.parseDouble(s1.getCeilingPrice());
            double s2v = Double.parseDouble(s2.getCeilingPrice());
            int a = 0;
            if (s1v > s2v) {
                a = 1;
            } else if (s1v < s2v) {
                a = -1;
            }
            return a;
        }
    };

    public static Comparator<Product> descendingOrder = new Comparator<Product>() {

        public int compare(Product s1, Product s2) {
            double s1v = Double.parseDouble(s1.getCeilingPrice());
            double s2v = Double.parseDouble(s2.getCeilingPrice());
            int a = 0;
            if (s1v > s2v) {
                a = -1;
            } else if (s1v < s2v) {
                a = +1;
            }
            return a;
        }
    };

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getModelNumber() {
        return modelNumber;
    }

    public void setModelNumber(String modelNumber) {
        this.modelNumber = modelNumber;
    }

    public String getVendorName() {
        return vendorName;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    public String getProductDescribtion() {
        return productDescribtion;
    }

    public void setProductDescribtion(String productDescribtion) {
        this.productDescribtion = productDescribtion;
    }

    public String getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(String basePrice) {
        this.basePrice = basePrice;
    }

    public String getCeilingPrice() {
        return ceilingPrice;
    }

    public void setCeilingPrice(String ceilingPrice) {
        this.ceilingPrice = ceilingPrice;
    }

    public String getFloorsPrice() {
        return floorsPrice;
    }

    public void setFloorsPrice(String floorsPrice) {
        this.floorsPrice = floorsPrice;
    }

    public String getFeature() {
        return feature;
    }

    public void setFeature(String feature) {
        this.feature = feature;
    }

    public String getBenifits() {
        return benifits;
    }

    public void setBenifits(String benifits) {
        this.benifits = benifits;
    }

    @Override
    public String toString() {
        return productName;

    }

}
