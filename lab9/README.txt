Implemented Strategy Pattern Example using Functional and Traditional approach.

Sorting Algorithm defines a way to organize elements of a collection in a defined order. Various algorithms exist to sort a collection and vary in their approach and space/time complexity. 
Choosing a sorting algorithm dynamically at runtime demonstrates the Strategy Pattern as the approach changes dynamically to accomplish the end result, i.e, Sorted list

In the traditional approach, a common Interface "SortingStrategy" is defined which declares the "sort" method. Each Sorting strategy is defined as a class implementing this interface. Strategies are changed at runtime by passing an object of the Sorting Strategy class to the "changeStrategy" method.

In the functional approach, a functional Interface "SortingStrategy" is defined which contains the abstract method "sort". Strategies are defined as lambda functions. Strategies are changed at runtime by passing the respective sorting lambda function to the "changeStrategy" method. Instead of binding it to a class, this method is bound to a Lambda function.  
