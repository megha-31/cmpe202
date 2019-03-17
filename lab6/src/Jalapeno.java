
/**
 * Write a description of class Tomato here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Jalapeno extends Toppings 
{
    
    public String description;
    public Double price;
    public String type;
    
    public Jalapeno(String description)
    {
        super(description);
        this.price = 0.75;
        this.type = "onMeat";
        this.description = "->|JALA Grilled" ;
    }
    
    public void print() {
      System.out.println(this.description);
   }
    
     public void printDescription() {
      System.out.println(this.description);
   }
   
     public Double getPrice() {
         return this.price;
       }
       
       public String getType(){
        return type;
    }
}
