import java.util.ArrayList;
import java.text.DecimalFormat;

public class Fries extends Composite
{
    public String decription;
    public Double price = 2.0;
    
    Fries(String d) {
        super(d);  
        description = "FRIES";
    }
    
    public Double getPrice() {
        return price;
    }
    
    
    public void printDescription() {
        
        System.out.println(description + "                  " + price);
    }
    
    public String getType(){
        return "";
    }
    
    public void print() {
        
       
        System.out.println(description + "                  " + price);
        
    }
}

       