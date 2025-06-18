package OverRiding;

//Base class
class Order {
 public void processOrder() {
     System.out.println("Processing general order...");
 }
}

//Subclass 1
class OnlineOrder extends Order {
 
 public void processOrder() {
     System.out.println("Processing online order with digital invoice...");
 }
}

//Subclass 2
class InStoreOrder extends Order {
 
 public void processOrder() {
     System.out.println("Processing in-store order with printed receipt...");
 }
}

public class Ordertest {
 public static void main(String[] args) {
     Order o1 = new OnlineOrder();
     Order o2 = new InStoreOrder();

     o1.processOrder();  // OnlineOrder version
     o2.processOrder();  // InStoreOrder version
 }
}