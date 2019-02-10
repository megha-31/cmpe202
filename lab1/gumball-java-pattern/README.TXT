Implemented changes in the States to add support for all the GumballMachines. 

Added a new State: HasPartialCoinState. A gumballMachine would be in this state when the value of coins entered so far is less than the total expected value. 

Modified the following State methods:

insertQuarter() -> insertCoin(int coin)
ejectQuarter() -> ejectCoin()




