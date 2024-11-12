public class Product {
    String productName;
    int quantity;
    float price;
    Product(String productName,int quantity,float price){
        this.productName=productName;
        this.quantity=quantity;
        this.price=price;
    }
    void display(){

        System.out.println(productName+"\t"+quantity+"\t"+price);
    }

}
