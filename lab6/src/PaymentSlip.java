import java.util.ArrayList;

public class PaymentSlip
{
    public void print(Composite order) {
        ArrayList<Component> components  = order.components;
        for (Component obj  : components)
        {
            obj.print();
        }
    }
}
