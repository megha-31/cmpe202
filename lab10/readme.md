# Lab 10

For Lab1 the accepted coins and cost was set as a parameter in the constructor for Gumball machine. Any changes or additions would have required changing the constructor and modifying all the invocation calls. This would have led to poor code maintainability and violation of SOLID principles if any change was made to the constructor signature for future additions.

In this lab the same problem has been solved using Aspectj and FeatureIDE. Various aspects are created for supporting different types of models and accepted coins. Based on the requirement of a specific Gumballmachine, corresponding aspects can be added without modifying any existing code. The required classes will be added in the main package and other classes will be removed as per the requirement. 

Below are the screenshots of the different gumball machines

Crank Model - Cost 25

![alt text](https://github.com/megha-31/cmpe202/blob/master/lab10/output/crankcost25_1.png)

Crank Model - Cost 50

![alt text](https://github.com/megha-31/cmpe202/blob/master/lab10/output/crankcost50_1.png)
