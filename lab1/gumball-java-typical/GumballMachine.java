
/**
 * Write a description of class GumballMachine4 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.*;
public class GumballMachine
{   
    private int num_gumballs;
    private boolean has_coins;
    private int sum;
    private int curr_sum;
    private ArrayList<Integer> validCoins;
    
     public GumballMachine( int size, int sum, ArrayList<Integer> coins)
    {
        this.num_gumballs = size;
        this.has_coins = false;
        this.sum = sum;
        this.curr_sum = 0;
        this.validCoins = coins;   
    }
    
    public void insertCoin(int coin) {
        if (!validCoins.contains(coin)) {
            System.out.println("Please insert a valid coin");
            return;
        }
        
        curr_sum += coin;
        if (curr_sum >= sum) {
           this.has_coins = true; 
        }
    }
    
    public void turnCrank()
    {
        if ( this.has_coins )
        {   
            if ( this.num_gumballs > 0 )
            {
                this.num_gumballs-- ;     
                this.has_coins = false ;
                this.curr_sum = 0;
                System.out.println( "Thanks for inserting coins.  Gumball Ejected!" ) ;
            }
            else
            {   
                System.out.println( "No More Gumballs!  Sorry, can't return your coins." ) ;
            }
        }
        else 
        {
            System.out.println( "Please insert more coins" ) ;
        }        
    }
}
