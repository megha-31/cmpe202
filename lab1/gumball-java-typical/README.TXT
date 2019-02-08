Implemented changes in GumballMachine to accept Valid input coins at the time of creation. Following changes have been made to existing interfaces:

1. Added following variables to the class:
    private boolean has_coins = Indicates if the gumball Machine has the valid amount to eject gumballs
    private int sum = The value required by gumball Machine to eject gumball
    private int curr_sum = The current value of coins inserted into the machine so far.
    private ArrayList<Integer> validCoins = List of all valid coins accepted by the machine
    
2. Changed insertQuarter method to insertCoin method so that it can accept any valid coin.

3. Classes GumballMachine1, GumballMachine2 and GumballMachine3 are specific implementations of each of the gumball machines. 
