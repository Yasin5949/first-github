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


            }

        }while(choice!=6);

    }
}