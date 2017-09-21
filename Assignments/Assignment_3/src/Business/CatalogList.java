/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author Malick
 */
public class CatalogList {
    private ArrayList<Catalog> mainCatalogList;

    public CatalogList() {
        this.mainCatalogList = new ArrayList<Catalog>();
    }

    public ArrayList<Catalog> getMainCatalogList() {
        return mainCatalogList;
    }

    public void setMainCatalogList(ArrayList<Catalog> mainCatalogList) {
        this.mainCatalogList = mainCatalogList;
    }


}
