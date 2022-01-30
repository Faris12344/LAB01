
package javaapplication1;


public class ElectricProduct extends Product{

  private String voltage;

  public ElectricProduct(int id, double price, String name, String voltage){
    super(id, price, name);
    this.voltage = voltage;
  }

  @Override
  public String toString(){
    return super.toString() +"\t Voltage: " + this.voltage;
  }

    @Override
    public void getSellableStatus() {
        System.out.println("This is sellable1");    }

}