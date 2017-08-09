## `for` and Ranges (#4)

Implement the function `isBalanced` taking as an argument a string consisting 
entirely of parentheses like `()(())` and checking that each opening symbol has 
a corresponding closing symbol and the pairs of parentheses are properly nested. 

Some examples:
`()` is balanced
`(()` is unbalanced
`)(` is unbalanced
`(()())` is balanced

TIP: Iterate over the string and count the number of left braces which are unmatched on each step.
At the end, this number should be 0. If it is less than zero at some point, string is unbalanced.