public class Demo{
public static void main (String args[]){
 
Product P1 = new Product("Bread",250 , 1, new Date (8,10,2026));
P1.displayProduct();
Product P2 = new Product("Eggs", 300, 12, new Date (8,10,2026));
P2.displayProduct();
Product P3 = new Product("Chips",200 , 2, new Date (8,10,2026));
P3.displayProduct();
Product P4 = new Product("Juice",300, 2 , new Date (8,10,2026));
P4.displayProduct();


Product.displayMaxMin();
}
}


