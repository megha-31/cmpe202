
/**
 * Write a description of class Tomato here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Tomato extends Toppings 
{
    
    public String description;
    public Double price;
    public String type;
    
    public Tomato(String d)
    {
        super(d);
        this.price = 0.75;
        this.type = "onTop";
        this.description = "TOMATO";
    }
       
     public void printDescription() {
      System.out.println(this.description);
   }
   
   public void print() {
      System.out.println(this.description);
   }
   
    public Double getPrice() {
         return this.price;
       }
       
       public String getType(){
        return type;
    }
}
