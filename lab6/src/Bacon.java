
/**
 * Write a description of class Bacon here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Bacon extends Composite
{
    public String description = "{{{{ BACON }}}}";
    public Double price = 0.75;
     
    Bacon(String d) {
        super("{{{{ " + d + " }}}}");
    }
    
    public void printDescription() {
         System.out.println(this.description);
    };
    
    public void print() {
      System.out.println(this.description);
   }
    
     public Double getPrice() {
         return this.price;
       }
       
       public String getType(){
        return "Meat";
    }
}

