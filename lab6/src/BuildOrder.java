
/**
 * Write a description of class BuildOrder here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BuildOrder
{ 
    public static void getOrder() {
     Composite order = new Composite("Order" ) ;
     CustomBurger b = new CustomBurger("LBB");
     Bacon bacon = new Bacon("BACON");
     b.addChild(bacon);
     Lettuce l = new Lettuce("LETTUCE");
     b.addChild(l);
     Tomato t = new Tomato("TOMATO");
     b.addChild(t);
     Onion o = new Onion("G ONION");
     b.addChild(o);
     Jalapeno j = new Jalapeno("JALA Grilled");
     b.addChild(j);
     order.addChild(b);
     Fries f = new Fries("Fries");
     order.addChild(f);
     System.out.println("   Packaging Slip   ");
     PaymentSlip r = new PaymentSlip();
     r.print(order);
     System.out.println("\n\n");
     System.out.println("   Receipt   ");
     Receipt rr = new Receipt();
     rr.print(order);
    }
     
     
}
