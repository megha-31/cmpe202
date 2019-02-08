
/**
 * Write a description of class GumballMachine2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GumballMachine2
{
    private int num_gumballs;
    private boolean has_quarters;
    private boolean has_first_quarter;
    private boolean has_second_quarter;

    public GumballMachine2( int size )
    {
        // initialise instance variables
        this.num_gumballs = size;
        this.has_first_quarter = false;
        this.has_second_quarter = false;
        this.has_quarters = false;
    }

    public void insertQuarter(int coin)
    {
        if ( coin == 25 ) {
            if (!this.has_first_quarter)
                this.has_first_quarter = true;
            else if (!this.has_second_quarter) {
                this.has_second_quarter = true;
                this.has_quarters = true;
            }
        }
        //else 
          //  this.has_quarter = false ;
    }
    
    public void turnCrank()
    {
        if ( this.has_quarters )
        {
            if ( this.num_gumballs > 0 )
            {
                this.num_gumballs-- ;
                this.has_quarters = false ;
                this.has_first_quarter = false;
                this.has_second_quarter = false;
                System.out.println( "Thanks for your quarter.  Gumball Ejected!" ) ;
            }
            else
            {
                System.out.println( "No More Gumballs!  Sorry, can't return your quarter." ) ;
            }
        }
        else 
        {
            System.out.println( "Please insert a quarter" ) ;
        }        
    }
    
}
