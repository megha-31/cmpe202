LAB 8

Decorator pattern was used to add spaces in Card Num and / in Card Month.

Decorator pattern was used so that it only affects the display and not the storage of data. In this way if the same data was to be used somewhere else it could be used as it is. To avoid saving formatted data, Decorator pattern was ideal. A decorator class is created which implements the interfaces IDisplayComponent and IKeyEventHandler. It contains the components CreditCardExp and CreditCardNum. 
