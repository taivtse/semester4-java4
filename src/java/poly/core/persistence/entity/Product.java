package poly.core.persistence.entity;
// Generated Oct 10, 2018 8:57:07 PM by Hibernate Tools 4.3.1



/**
 * Product generated by hbm2java
 */
public class Product  implements java.io.Serializable {


     private int id;
     private Category category;
     private String name;
     private int price;
     private int quantity;
     private String description;
     private String imageUrl;

    public Product() {
    }

    public Product(int id, Category category, String name, int price, int quantity, String description, String imageUrl) {
       this.id = id;
       this.category = category;
       this.name = name;
       this.price = price;
       this.quantity = quantity;
       this.description = description;
       this.imageUrl = imageUrl;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public Category getCategory() {
        return this.category;
    }
    
    public void setCategory(Category category) {
        this.category = category;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public int getPrice() {
        return this.price;
    }
    
    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    public String getImageUrl() {
        return this.imageUrl;
    }
    
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }




}


