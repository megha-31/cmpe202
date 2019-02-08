

import java.util.Random;

public class HasCoinState implements State {
    GumballMachine gumballMachine;
 
    public HasCoinState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
  
    public void insertCoin(int coin) {
        System.out.println("You can't insert another quarter");
    }
 
    public void ejectCoin() {
        int last_coin = this.gumballMachine.last_coin;
        this.gumballMachine.curr_sum -= last_coin;
        if (this.gumballMachine.curr_sum == 0)
            gumballMachine.setState(gumballMachine.getNoCoinState());
            else
        System.out.println("Quarter returned");
    }
 
    public void turnCrank() {
        System.out.println("You turned...");
        gumballMachine.setState(gumballMachine.getSoldState());
    }

    public void dispense() {
        System.out.println("No gumball dispensed");
    }
 
    public String toString() {
        return "waiting for turn of crank";
    }
}
