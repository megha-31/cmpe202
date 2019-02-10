import java.util.*;

public class GumballMachine {
 
    State soldOutState;
    State noCoinState;
    State hasCoinState;
    State hasPartialCoinState;
    State soldState;
 
    State state = soldOutState;
    int count = 0;
    int sum = 0;
    int curr_sum = 0;
    ArrayList<Integer> validCoins;
 
    public GumballMachine(int numberGumballs, int sum, ArrayList<Integer> validCoins) {
        soldOutState = new SoldOutState(this);
        noCoinState = new NoCoinState(this);
        hasCoinState = new HasCoinState(this);
        soldState = new SoldState(this);
        hasPartialCoinState = new HasPartialCoinState(this);
        this.count = numberGumballs;
        this.sum = sum;
        this.validCoins = validCoins;
        if (numberGumballs > 0) {
            state = noCoinState;
        } 
    }
 
    public void insertCoin(int coin) {
        state.insertCoin(coin);
    }
 
    public void ejectQuarter() {
        state.ejectCoin();
    }
 
    public void turnCrank() {
        System.out.println("State " + state);
        state.turnCrank();
        state.dispense();
    }

    void setState(State state) {
        this.state = state;
    }
 
    void releaseBall() {
        System.out.println("A gumball comes rolling out the slot...");
        if (count != 0) {
            count = count - 1;
        }
    }
 
    int getCount() {
        return count;
    }
 
    void refill(int count) {
        this.count = count;
        state = noCoinState;
    }

    public State getState() {
        return state;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getNoCoinState() {
        return noCoinState;
    }

    public State getHasCoinState() {
        return hasCoinState;
    }
    
    public State getHasPartialCoinState() {
        return hasPartialCoinState;
    }

    public State getSoldState() {
        return soldState;
    }
 
    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append("\nMighty Gumball, Inc.");
        result.append("\nJava-enabled Standing Gumball Model #2004");
        result.append("\nInventory: " + count + " gumball");
        if (count != 1) {
            result.append("s");
        }
        result.append("\n");
        result.append("Machine is " + state + "\n");
        return result.toString();
    }
}
