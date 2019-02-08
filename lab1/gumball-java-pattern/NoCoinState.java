

public class NoCoinState implements State {
    GumballMachine gumballMachine;
 
    public NoCoinState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
 
    public void insertCoin(int coin) {
        System.out.println("You inserted a coin");
        int sum = this.gumballMachine.sum;
        if(!this.gumballMachine.validCoins.contains(coin)) {
            System.out.println("Please enter a valid coin!!");
            return;
        }
        this.gumballMachine.curr_sum += coin;
        this.gumballMachine.last_coin = coin;
        if (this.gumballMachine.curr_sum >= sum) {
            gumballMachine.setState(gumballMachine.getHasCoinState());
        } else {
            gumballMachine.setState(gumballMachine.getHasPartialCoinState());
        }
    }
 
    public void ejectCoin() {
        System.out.println("You haven't inserted a quarter");
    }
 
    public void turnCrank() {
        System.out.println("You turned, but there's no quarter");
     }
 
    public void dispense() {
        System.out.println("You need to pay first");
    } 
 
	public String toString() {
		return "waiting for quarter";
	}
}
