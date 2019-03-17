import java.util.ArrayList;

public class PaymentSlip
{
    public void print(Composite order) {
        ArrayList<Component> components  = order.components;
        Double price = 0.0;
        for (Component obj  : components)
        {
            price += obj.getPrice();
            obj.print();
        }
        
        System.out.println("Price           " + price);
    }
}
