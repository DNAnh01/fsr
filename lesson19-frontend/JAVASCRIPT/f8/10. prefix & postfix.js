// operator ++ -- 
// prefix & postfix
/**
In JavaScript, prefix and postfix are operators used to increment or decrement the value of a variable by 1.

The prefix operator (++ or --) is applied before the variable, like ++x or --y. It increments or decrements the variable by 1 and then returns the new value. For example:
 */

let x = 5;
let y = ++x;  // y is 6, x is 6

/**
In this example, y is assigned the value of x after it has been incremented by 1.

The postfix operator (++ or --) is applied after the variable, like x++ or y--. It also increments or decrements the variable by 1, but it returns the original value of the variable before it was incremented or decremented. For example:
 */
let x1 = 5;
let y1= x1++;  // y1 is 5, x1 is 6

/**
In this example, y is assigned the original value of x before it was incremented by 1.

It's important to note that using the prefix or postfix operator can have different effects depending on where they are used in an expression. For example, in the expression y = ++x + 1, x is first incremented and then added to 1, while in the expression y = x++ + 1, x is first added to 1 and then incremented.
 */