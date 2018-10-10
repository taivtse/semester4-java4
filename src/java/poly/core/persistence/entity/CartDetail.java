package poly.core.persistence.entity;
// Generated Oct 10, 2018 4:53:13 PM by Hibernate Tools 4.3.1



/**
 * CartDetail generated by hbm2java
 */
public class CartDetail  implements java.io.Serializable {


     private int id;
     private Cart cart;
     private int productQuantity;
     private int productId;

    public CartDetail() {
    }

    public CartDetail(int id, Cart cart, int productQuantity, int productId) {
       this.id = id;
       this.cart = cart;
       this.productQuantity = productQuantity;
       this.productId = productId;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public Cart getCart() {
        return this.cart;
    }
    
    public void setCart(Cart cart) {
        this.cart = cart;
    }
    public int getProductQuantity() {
        return this.productQuantity;
    }
    
    public void setProductQuantity(int productQuantity) {
        this.productQuantity = productQuantity;
    }
    public int getProductId() {
        return this.productId;
    }
    
    public void setProductId(int productId) {
        this.productId = productId;
    }




}

