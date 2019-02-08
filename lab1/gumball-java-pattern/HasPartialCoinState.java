
/**
 * Write a description of class HasPartialCoinState here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class HasPartialCoinState implements State
{
    GumballMachine gumballMachine;
 
    public HasPartialCoinState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
 
    public void insertCoin(int coin) {
        System.out.println("You inserted a coin");
        if(!this.gumballMachine.validCoins.contains(coin)) {
            System.out.println("Please enter a valid coin!!");
            return;
        }
        int sum = this.gumballMachine.sum;
        this.gumballMachine.curr_sum += coin;
        this.gumballMachine.last_coin = coin;
        if (this.gumballMachine.curr_sum >= sum)
            gumballMachine.setState(gumballMachine.getHasCoinState());
    }
 
    public void ejectCoin() {
        int last_coin = this.gumballMachine.last_coin;
        this.gumballMachine.curr_sum -= last_coin;
        if (this.gumballMachine.curr_sum == 0)
            gumballMachine.setState(gumballMachine.getNoCoinState());
        else
            gumballMachine.setState(gumballMachine.getHasPartialCoinState());
        System.out.println("Coin returned");
    }
 
    public void turnCrank() {
        System.out.println("Please enter more coins");
     }
 
    public void dispense() {
        System.out.println("You need to pay first");
    } 
 
    public String toString() {
        return "waiting for more coins";
    }
    
}
