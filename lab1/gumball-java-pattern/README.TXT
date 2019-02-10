Implemented changes in the States to add support for all the GumballMachines. 

Added a new State: HasPartialCoinState. A gumballMachine would be in this state when the value of coins entered so far is less than the total expected value. 

Modified the following State methods:

insertQuarter() -> insertCoin(int coin)
ejectQuarter() -> ejectCoin()

Added following instance variables to class GumballMachine:

curr_sum = Value of coins inserted so far in the GumballMachine before turning crank
sum = Value accepted by the machine to release a Gumball
validCoins = List of valid coin denominations accepted by the machine 


