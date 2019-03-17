
/**
 * Write a description of class Toppings here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Toppings extends Composite
{
   public String description;
   public Double price;
   public String type;
   
   Toppings(String d) {
       super(d);
       
    }
    
    public void print() {
      System.out.println(this.description);
   }
     
   public void printDescription() {
      System.out.println(this.description);
   }
   
   public String getType(){
        return type;
    }
}
