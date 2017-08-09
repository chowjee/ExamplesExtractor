## Classes & Objects (#4)

Implement the same `isPalindrome` function taking an instance of `SimpleString`
as an argument. `SimpleString` is a toy class used for these tasks only that has
two members: `length` returning a length of a string 
and `get(Int)` returning a character by its index.
Note that indexing starts with zero, as with regular `String`s.

HINT: Iterate over string indices (they form a range from `0` to `length - 1`)
and for every index `i` make sure the character by the `i` index is the same
as the character by the `length - 1 - i` index.