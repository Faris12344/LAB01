
package javaapplication1;
//Q3
 public abstract class Product {
  private int id;
  private double price;
  private String name;
  //Q1
  private static int quantity;
   //Q7
  private double weight;
  public Product(int id, double price, String name){
    this.id = id;
    this.price = price;
    this.name = name;
    this.quantity ++;
  }
  public void applySaleDiscount(double percentage){
    this.price = this.price - ((percentage/100) * this.price);
  }
//Q5
  public final void addToShoppingCart(){
    System.out.println(this.name + " has been added to the shopping cart.");
  }

  public void printTotalQuantity(){
    System.out.println("Total Quantity: " + this.quantity);
  }
  
  public abstract void getSellableStatus();
  public  String toString(){
    return "Product info:\n+Id: " + this.id + "\t" + "name: " + this.name +
      "\tPrice: SR" + this.price;
  }
}
