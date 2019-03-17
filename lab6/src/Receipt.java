
import java.util.ArrayList;

public class Receipt
{
    public void print(Composite order) {
        ArrayList<Component> components  = order.components;
        Double price = 0.0;
        for (Component obj  : components)
        {   
            price += obj.getPrice();
            obj.printDescription();
        }
        
        System.out.println("Price           "  + price);
    }
}
