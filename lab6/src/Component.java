
/**
 * Write a description of interface Component here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public interface Component
{
     void printDescription() ;
     void print() ;
     void addChild(Component c);
     void removeChild(Component c);
     Component getChild(int i);
     public Double getPrice();
     public String getType();
      
}
