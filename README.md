# The-Hungry-Knight

I did this program as an assignment for CS232: Computer Programming II, a class about learning to code in Java.

The basic concept of this program was to ask a user how many of each 4 dishes they wanted and would then calculate and output the Subtotal, Sales Tax(5%), and Total.

The program outputs a welcome message, welcoming the user to the program and explaining the purpose of the program.
The program then asks the user for a name and characteristic to set the user's knight name as "Sir [name] the [characteristic]" to help give the program a more friendly feel or tone.
Once the name is set, the program outputs it once and begins to ask the user how many of each dishes they want. It asks for each dish, starting with Roast Pheasant, and moving to Beef Stew, then Fine Bread, and finally, Fresh Fruit. For each input, it takes in the next integer, so it will not take a floating or decimal point number.
Once the number of dishes is set, the program calculates the subtotal by multiplying the number of dishes by the dishes price(Roast Pheasant for 15.15, Beef Stew for 3.79, Fine Bread for 5.37, and Fresh Fruit for 1.29) and adding them all together.
After the subtotal is calculated, the tax is calculated by multiplying the subtotal times 5% or 0.05.
Then it will add the subtotal and tax for the actual total.
Once all three are calculated, the program rounds them all up to prevent a floating or decimal point number(It is impossible to pay a decimal of a coin).
After calculation and rounding, the program outputs the subtotal, sales tax, and total.
Once they are outputed, the program ends.

This assignment was more of a refresher, as this exact assignment was used in CS231: Computer Programming I, a class about coding in C++. The main point of this assignment was to act as a refresher and acted as an introduction into moving from coding in C++ to coding in Java. It helped me to find the similarities and differences between C++ and Java. It also helped me learn what I need to do to accuralty code in Java. For example, to use input in a similiar way to C++, we have to create a scanner and use that to get input.
