package inheritance

// This class can be inherited from:
open class Parent

class Child : Parent()

// This class can't be inherited from:
final class Single

// The same as using 'final':
class AnotherSingle
