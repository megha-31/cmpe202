
import java.util.ArrayList;

public class Receipt
{
    public void print(Composite order) {
        ArrayList<Component> components  = order.components;
        for (Component obj  : components)
        {
            obj.printDescription();
        }
    }
}
