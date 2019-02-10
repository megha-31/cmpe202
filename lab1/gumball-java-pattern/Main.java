import java.util.*;

public class Main {

	public static void main(String[] args) {
		GumballMachine gumballMachine = new GumballMachine(5, 70, new ArrayList<Integer>( Arrays.asList(5, 10, 25)));
		
		gumballMachine.insertCoin(25);
		gumballMachine.turnCrank();
		gumballMachine.insertCoin(25);
		gumballMachine.turnCrank();
		gumballMachine.insertCoin(25);
		gumballMachine.turnCrank();
		
		GumballMachine gumballMachine2 = new GumballMachine(5, 25, new ArrayList<Integer>( Arrays.asList(25)));
		gumballMachine2.insertCoin(10);
		gumballMachine2.turnCrank();

	}
}
