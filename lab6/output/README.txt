The following patterns were used to print the packaging slip and the receipt:

1. Composite pattern
   Burger serves as a container of Toppings, Bun and Meat. Owing to the nested hierarchy, Composite pattern was used to iterate and access properties of all the sub components

2. Strategy pattern
   Created 2 classes PaymentSlip and Receipt, both implementing the print method. Receipt prints the components in the order in which they were added while PaymentSlip prints components in the order to be  prepared. Since both methods offer different views of the same data, Strategy pattern has been implemented
