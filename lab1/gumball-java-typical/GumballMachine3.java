
/**
 * Write a description of class GumballMachine3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GumballMachine3
{
    private int num_gumballs;
    private boolean has_quarters;
    private int sum;

    public GumballMachine3( int size )
    {
        // initialise instance variables
        this.num_gumballs = size;
        this.has_quarters = false;
        this.sum = 0;
    }

    public void insertCoin(int coin)
    {
        this.sum += coin;
        if (this.sum >= 50)
            this.has_quarters = true;
    }
    
    public void turnCrank()
    {
        if ( this.has_quarters )
        {
            if ( this.num_gumballs > 0 )
            {
                this.num_gumballs-- ;
                this.has_quarters = false ;
                this.sum = 0;
                System.out.println( "Thanks for your quarter.  Gumball Ejected!" ) ;
            }
            else
            {
                System.out.println( "No More Gumballs!  Sorry, can't return your quarter." ) ;
            }
        }
        else 
        {
            System.out.println( "Please insert more coins" ) ;
        }        
    }
    
   
}
