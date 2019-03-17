import java.util.ArrayList;
import java.text.DecimalFormat;

public class CustomBurger extends Composite
{
    public String decription;
    
    
    CustomBurger(String d) {
        super(d);
    }
    
    
    
    public void printDescription() {
        
        DecimalFormat fmt = new DecimalFormat("0.00");
        Double price = 0.0;
        for (Component obj  : components)
        {   
            price += obj.getPrice();
        }
        System.out.println(this.description + "             " + fmt.format(price));
        
        for (Component obj  : components)
        {
            obj.printDescription();
        }
    }
    public String getType(){
        return "";
    }
    
    public void print() {
        
        DecimalFormat fmt = new DecimalFormat("0.00");
        Double price = 0.0;
        for (Component obj  : components)
        {   
            price += obj.getPrice();
        }
        System.out.println(this.description + "             " + fmt.format(price));
        ArrayList<Component> top = new ArrayList<Component>()  ;
        ArrayList<Component> bottom = new ArrayList<Component>()  ;
        ArrayList<Component> onmeat = new ArrayList<Component>()  ;
        ArrayList<Component> meat = new ArrayList<Component>()  ;
        for (Component obj  : components)
        {
            if (obj.getType() == "onTop")
            top.add(obj);
            else if (obj.getType() == "onMeat")
            onmeat.add(obj);
            else if (obj.getType() == "Meat")
            meat.add(obj);
            else
            bottom.add(obj);
        }
        
        for (Component obj: top) {
            obj.printDescription();
        }
        
        for (Component obj: onmeat) {
            obj.printDescription();
        }
        
        for (Component obj: meat) {
            obj.printDescription();
        }
        
        for (Component obj: bottom) {
            obj.printDescription();
        }
        
        
    }
}

       