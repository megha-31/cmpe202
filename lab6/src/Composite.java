   

import java.util.ArrayList;

public class Composite implements Component {

    ArrayList<Component> components = new ArrayList<Component>()  ;
    protected String description ;
    
    
    Composite(String d) {
        description = d;
    }
    
    public String getType(){
        return "";
    }
    
    public void printDescription() {
        for (Component obj  : components)
        {
            obj.printDescription();
        }
    }
    
    public void print() {
        for (Component obj  : components)
        {
            obj.print();
        }
    }

    public void addChild(Component c) {
        components.add( c ) ;
    }
     
    public void removeChild(Component c) {
        components.remove(c) ;
    }
     
    public Component getChild(int i) {
        return components.get( i ) ;
    }
    
     public Double getPrice() {
         return 0.0;
       }
     
}
 
