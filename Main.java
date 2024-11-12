import java.util.*;
public class Main {
    public static void main(String[]args){
        Scanner read=new Scanner(System.in);
        ArrayList<Product> products=new ArrayList<>();
        int choice;
        do{
            System.out.println("1.Add Product\n2.Moddify Product\n3.Search Product\n4.Display Products\n5.Remove Product\n6.Exit\nEnter Your Choice:");
            choice=read.nextInt();
            switch(choice){
                case 1:
                    System.out.println("Enter The Name Of The Product ");
                    String name=read.next();
                    System.out.println("Enter The Quantity Of The Product");
                    int quantity=read.nextInt();
                    System.out.println("Enter The Price Of The Product");
                    float price=read.nextFloat();
                    products.add(new Product(name,quantity,price));
                    break;
                case 2:
                    if(products.isEmpty()){
                        System.out.println("The Inventory Is Empty!");
                        break;
                    }
                    else{
                        System.out.println("Enter The Name Of The Product.");
                        String searchName=read.next();
                        for(Product pro:products){
                            if(pro.productName.equals(searchName)){
                                System.out.println("What Do You Want To Modify.?");
                                System.out.println("1.Name\n2.Quantity\n3.Price\n4.Quantity And Price\nEnter Your Choice:");
                                int Choice=read.nextInt();
                                switch(Choice){
                                    case 1:
                                        System.out.println("Enter The Product Name:");
                                        String newName=read.next();
                                        pro.productName=newName;
                                        break;
                                    case 2:
                                        System.out.println("Enter The New Quantity.");
                                        int newQuantity=read.nextInt();
                                        pro.quantity=newQuantity;
                                        break;
                                    case 3:
                                        System.out.println("Enter The New Price.");
                                        float newPrice=read.nextFloat();
                                        pro.price=newPrice;
                                        break;
                                    case 4:
                                        System.out.println("Enter The New Quantity");
                                        int newQuantit=read.nextInt();
                                        pro.quantity=newQuantit;
                                        System.out.println("Enter The New Price.");
                                        float newprice=read.nextFloat();
                                        pro.price=newprice;
                                        break;


                                }

                            }
                        }
                        System.out.println("No Product Named "+searchName+" Was Found In The Inventory");

                    }
                    break;
                case 3:
                    if(products.isEmpty()){
                        System.out.println("The Inventory Is Empty!");
                        break;
                    }
                    else{
                        System.out.println("Enter The product Name You Want To Search;");
                        String search=read.next();
                        for(Product pro:products){
                            if(pro.productName.equals(search)){
                                System.out.println("Product Found!");
                                pro.display();
                                break;
                            }
                        }
                        System.out.println("Product Not Found!");

                    }
                    break;
                case 4:
                    if(products.isEmpty()){
                        System.out.println("The Inventory Is Empty!");
                        break;
                    }
                    else{
                        System.out.println("Producct\tQuantity\tPrice");
                        for(Product pro:products){
                            System.out.println(pro.productName+"\t"+pro.quantity+"\t"+pro.price);

                        }
                    }
                    break;
                case 5:
                    if(products.isEmpty()){
                        System.out.println("The Inventory Is Empty!");
                        break;
                    }
                    else{
                        System.out.println("Enter The Product Name You Want To Remove.");
                        String removeProduct=read.next();
                        for(Product pro:products){
                            if(pro.productName.equals(removeProduct)){
                                products.remove(pro);
                                break;
                            }
                        }

                    }
                    break;




            }

        }while(choice!=6);

    }
}