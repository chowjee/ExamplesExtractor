## Classes & Objects (#3)

Building on the previous exercise, strip out special characters
before palindrome testing. 
"Madam I'm adam" should be considered as a palindrome.

HINT: Build an extra string consisting of letters only, and check whether it's
a palindrome.
Use `in` to check if a character is an alphabetical letter:
`ch in 'a'..'z' || c in 'A'..'Z'`.

#4
Implement the same `isPalindrome` function taking an instance of `SimpleString`
as an argument. `SimpleString` is a toy class used for these tasks only that has
two members: `length` returning a length of a string 
and `get(Int)` returning a character by its index.
Note that indexing starts with zero, as with regular `String`s.

HINT: Iterate over string indices (they form a range from `0` to `length - 1`)
and for every index `i` make sure the character by the `i` index is the same
as the character by the `length - 1 - i` index.

#5
Implement `isPalIgnoreCase` function working with `SimpleString`.

HINT: Use `toLowerCase` member function on `Char` to compare both characters 
in lower case instead.