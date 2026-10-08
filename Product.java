public class Product {
private static String id;
private int quantity;
private double price;
private Date md;
String name;


private static int count= 0;
static private double maxPrice;
static private double minPrice;


Product(String name , double price ,int quantity){
this (name, price , quantity , new Date (1,1,1));
}

Product(String name , double price ,int quantity , Date md ){
this.name = name;
this.price = price;
this.quantity = quantity;
count++;
this.id = String.format ("P%03d " , count);
this.md = md;

if (count == 1){
minPrice = price;
maxPrice = price;
}

if (count > 1 && price>maxPrice){
maxPrice=price;
}

if (count > 1 && price < minPrice){
minPrice=price;
}

}

public void displayProduct (){
System.out.printf("Name:%5s \n" ,name);
System.out.printf("Price: % .2f \n", price);
System.out.printf("Quantity: % 03d \n " , quantity);
System.out.printf("ID: %5s \n" , id);
System.out.printf("Manufacturing Date: %s \n"," " +md.toString());


}
static void displayMaxMin(){
System.out.printf("Maximum price is: % .2f \n", maxPrice);
System.out.printf("Minimum price is: % .2f \n", minPrice);
}
}
