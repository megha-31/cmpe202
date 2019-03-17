
/**
 * Write a description of class Lettuce here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Lettuce extends Toppings 
{
    public String description;
    public Double price;
    public String type;
    
    public Lettuce(String description)
    {
        super(description);
        this.price = 0.75;
        this.type = "onTop";
        this.description = "LETTUCE";
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
