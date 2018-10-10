package poly.core.persistence.entity;
// Generated Oct 10, 2018 4:53:13 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Category generated by hbm2java
 */
public class Category  implements java.io.Serializable {


     private int id;
     private String name;
     private int sortOrder;
     private Integer parentId;
     private Set<Product> products = new HashSet<Product>(0);

    public Category() {
    }

	
    public Category(int id, String name, int sortOrder) {
        this.id = id;
        this.name = name;
        this.sortOrder = sortOrder;
    }
    public Category(int id, String name, int sortOrder, Integer parentId, Set<Product> products) {
       this.id = id;
       this.name = name;
       this.sortOrder = sortOrder;
       this.parentId = parentId;
       this.products = products;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public int getSortOrder() {
        return this.sortOrder;
    }
    
    public void setSortOrder(int sortOrder) {
        this.sortOrder = sortOrder;
    }
    public Integer getParentId() {
        return this.parentId;
    }
    
    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }
    public Set<Product> getProducts() {
        return this.products;
    }
    
    public void setProducts(Set<Product> products) {
        this.products = products;
    }




}

