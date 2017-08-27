import org.junit.Test;

public class TestExamples extends AbstractTestExamples {

    @Test
    public void testEmptyProgram() {
        testExample("Examples/06_Hello_World/Examples/EmptyProgram.kt", EmptyProgramKt::main);
    }

    @Test
    public void testHelloWorld() {
        testExample("Examples/06_Hello_World/Examples/HelloWorld.kt", HelloWorldKt::main);
    }

    @Test
    public void testVars() {
        testExample("Examples/07_Variables/Examples/Vars.kt", VarsKt::main);
    }

    @Test
    public void testMutableVariable() {
        testExample("Examples/07_Variables/Examples/MutableVariable.kt", MutableVariableKt::main);
    }

    @Test
    public void testVals() {
        testExample("Examples/07_Variables/Examples/Vals.kt", ValsKt::main);
    }

    @Test
    public void testStringPlusNumber() {
        testExample("Examples/08_Data_Types/Examples/StringPlusNumber.kt", StringPlusNumberKt::main);
    }

    @Test
    public void testTypes() {
        testExample("Examples/08_Data_Types/Examples/Types.kt", TypesKt::main);
    }

    @Test
    public void testInference() {
        testExample("Examples/08_Data_Types/Examples/Inference.kt", InferenceKt::main);
    }

    @Test
    public void testMultiplyByTwo() {
        testExample("Examples/09_Functions/Examples/MultiplyByTwo.kt", MultiplyByTwoKt::main);
    }

    @Test
    public void testSayHello() {
        testExample("Examples/09_Functions/Examples/SayHello.kt", SayHelloKt::main);
    }

    @Test
    public void testMultiplyByThree() {
        testExample("Examples/09_Functions/Examples/MultiplyByThree.kt", MultiplyByThreeKt::main);
    }

    @Test
    public void testMultiplyByFour() {
        testExample("Examples/09_Functions/Examples/MultiplyByFour.kt", MultiplyByFourKt::main);
    }

    @Test
    public void testIf1() {
        testExample("Examples/10_If_Expressions/Examples/If1.kt", If1Kt::main);
    }

    @Test
    public void testIf2() {
        testExample("Examples/10_If_Expressions/Examples/If2.kt", If2Kt::main);
    }

    @Test
    public void testIf3() {
        testExample("Examples/10_If_Expressions/Examples/If3.kt", If3Kt::main);
    }

    @Test
    public void testIf4() {
        testExample("Examples/10_If_Expressions/Examples/If4.kt", If4Kt::main);
    }

    @Test
    public void testIf5() {
        testExample("Examples/10_If_Expressions/Examples/If5.kt", If5Kt::main);
    }

    @Test
    public void testIf6() {
        testExample("Examples/10_If_Expressions/Examples/If6.kt", If6Kt::main);
    }

    @Test
    public void testTrueOrFalse() {
        testExample("Examples/10_If_Expressions/Examples/TrueOrFalse.kt", TrueOrFalseKt::main);
    }

    @Test
    public void testOneOrTheOther() {
        testExample("Examples/10_If_Expressions/Examples/OneOrTheOther.kt", OneOrTheOtherKt::main);
    }

    @Test
    public void testStringTemplates() {
        testExample("Examples/11_String_Templates/Examples/StringTemplates.kt", StringTemplatesKt::main);
    }

    @Test
    public void testStringConcatenation() {
        testExample("Examples/11_String_Templates/Examples/StringConcatenation.kt", StringConcatenationKt::main);
    }

    @Test
    public void testExpressionInStringTemplate() {
        testExample("Examples/11_String_Templates/Examples/ExpressionInStringTemplate.kt", ExpressionInStringTemplateKt::main);
    }

    @Test
    public void testTripleQuotes() {
        testExample("Examples/11_String_Templates/Examples/TripleQuotes.kt", TripleQuotesKt::main);
    }

    @Test
    public void testInferInt() {
        testExample("Examples/12_Number_Types/Examples/InferInt.kt", InferIntKt::main);
    }

    @Test
    public void testModulus() {
        testExample("Examples/12_Number_Types/Examples/Modulus.kt", ModulusKt::main);
    }

    @Test
    public void testIntDivisionTruncates() {
        testExample("Examples/12_Number_Types/Examples/IntDivisionTruncates.kt", IntDivisionTruncatesKt::main);
    }

    @Test
    public void testBMI() {
        testExample("Examples/12_Number_Types/Examples/BMI.kt", BMIKt::main);
    }

    @Test
    public void testIntegerMath() {
        testExample("Examples/12_Number_Types/Examples/IntegerMath.kt", IntegerMathKt::main);
    }

    @Test
    public void testIntegerOverflow() {
        testExample("Examples/12_Number_Types/Examples/IntegerOverflow.kt", IntegerOverflowKt::main);
    }

    @Test
    public void testUsingLongs() {
        testExample("Examples/12_Number_Types/Examples/UsingLongs.kt", UsingLongsKt::main);
    }

    @Test
    public void testBiggestLong() {
        testExample("Examples/12_Number_Types/Examples/BiggestLong.kt", BiggestLongKt::main);
    }

    @Test
    public void testBooleans1() {
        testExample("Examples/13_Booleans/Examples/Booleans1.kt", Booleans1Kt::main);
    }

    @Test
    public void testBooleans2() {
        testExample("Examples/13_Booleans/Examples/Booleans2.kt", Booleans2Kt::main);
    }

    @Test
    public void testBooleans3() {
        testExample("Examples/13_Booleans/Examples/Booleans3.kt", Booleans3Kt::main);
    }

    @Test
    public void testEvaluationOrder() {
        testExample("Examples/13_Booleans/Examples/EvaluationOrder.kt", EvaluationOrderKt::main);
    }

    @Test
    public void testWhileLoop() {
        testExample("Examples/14_Repetition_with_while/Examples/WhileLoop.kt", WhileLoopKt::main);
    }

    @Test
    public void testDoWhileLoop() {
        testExample("Examples/14_Repetition_with_while/Examples/DoWhileLoop.kt", DoWhileLoopKt::main);
    }

    @Test
    public void testRepeatThreeTimes() {
        testExample("Examples/15_for_and_Ranges/Examples/RepeatThreeTimes.kt", RepeatThreeTimesKt::main);
    }

    @Test
    public void testDefiningRanges() {
        testExample("Examples/15_for_and_Ranges/Examples/DefiningRanges.kt", DefiningRangesKt::main);
    }

    @Test
    public void testSumUsingRange() {
        testExample("Examples/15_for_and_Ranges/Examples/SumUsingRange.kt", SumUsingRangeKt::main);
    }

    @Test
    public void testForWithRanges() {
        testExample("Examples/15_for_and_Ranges/Examples/ForWithRanges.kt", ForWithRangesKt::main);
    }

    @Test
    public void testForWithCharRange() {
        testExample("Examples/15_for_and_Ranges/Examples/ForWithCharRange.kt", ForWithCharRangeKt::main);
    }

    @Test
    public void testIndexIntoString() {
        testExample("Examples/15_for_and_Ranges/Examples/IndexIntoString.kt", IndexIntoStringKt::main);
    }

    @Test
    public void testAddingIntToChar() {
        testExample("Examples/15_for_and_Ranges/Examples/AddingIntToChar.kt", AddingIntToCharKt::main);
    }

    @Test
    public void testIterateOverString() {
        testExample("Examples/15_for_and_Ranges/Examples/IterateOverString.kt", IterateOverStringKt::main);
    }

    @Test
    public void testContainsChar() {
        testExample("Examples/15_for_and_Ranges/Examples/ContainsChar.kt", ContainsCharKt::main);
    }

    @Test
    public void testMembershipInRange() {
        testExample("Examples/16_More_About_Ranges/Examples/MembershipInRange.kt", MembershipInRangeKt::main);
    }

    @Test
    public void testMembershipUsingBounds() {
        testExample("Examples/16_More_About_Ranges/Examples/MembershipUsingBounds.kt", MembershipUsingBoundsKt::main);
    }

    @Test
    public void testIterationVsMembership() {
        testExample("Examples/16_More_About_Ranges/Examples/IterationVsMembership.kt", IterationVsMembershipKt::main);
    }

    @Test
    public void testInString() {
        testExample("Examples/16_More_About_Ranges/Examples/InString.kt", InStringKt::main);
    }

    @Test
    public void testCharRange() {
        testExample("Examples/16_More_About_Ranges/Examples/CharRange.kt", CharRangeKt::main);
    }

    @Test
    public void testFloatingPointRange() {
        testExample("Examples/16_More_About_Ranges/Examples/FloatingPointRange.kt", FloatingPointRangeKt::main);
    }

    @Test
    public void testStringRange() {
        testExample("Examples/16_More_About_Ranges/Examples/StringRange.kt", StringRangeKt::main);
    }

    @Test
    public void testForLoopIsAStatement() {
        testExample("Examples/17_Expressions_and_Statements/Examples/ForLoopIsAStatement.kt", ForLoopIsAStatementKt::main);
    }

    @Test
    public void testUnitReturnType() {
        testExample("Examples/17_Expressions_and_Statements/Examples/UnitReturnType.kt", UnitReturnTypeKt::main);
    }

    @Test
    public void testAssigningAnIf() {
        testExample("Examples/17_Expressions_and_Statements/Examples/AssigningAnIf.kt", AssigningAnIfKt::main);
    }

    @Test
    public void testBasicFunctions() {
        testExample("Examples/18_Summary_1/Examples/BasicFunctions.kt", BasicFunctionsKt::main);
    }

    @Test
    public void testBooleans() {
        testExample("Examples/18_Summary_1/Examples/Booleans.kt", BooleansKt::main);
    }

    @Test
    public void testIfResult() {
        testExample("Examples/18_Summary_1/Examples/IfResult.kt", IfResultKt::main);
    }

    @Test
    public void testIfExpression() {
        testExample("Examples/18_Summary_1/Examples/IfExpression.kt", IfExpressionKt::main);
    }

    @Test
    public void testStrTemplates() {
        testExample("Examples/18_Summary_1/Examples/StrTemplates.kt", StrTemplatesKt::main);
    }

    @Test
    public void testThreeQuotes() {
        testExample("Examples/18_Summary_1/Examples/ThreeQuotes.kt", ThreeQuotesKt::main);
    }

    @Test
    public void testNumberTypes() {
        testExample("Examples/18_Summary_1/Examples/NumberTypes.kt", NumberTypesKt::main);
    }

    @Test
    public void testOverflow() {
        testExample("Examples/18_Summary_1/Examples/Overflow.kt", OverflowKt::main);
    }

    @Test
    public void testTruncation() {
        testExample("Examples/18_Summary_1/Examples/Truncation.kt", TruncationKt::main);
    }

    @Test
    public void testIterateThroughString() {
        testExample("Examples/18_Summary_1/Examples/IterateThroughString.kt", IterateThroughStringKt::main);
    }

    @Test
    public void testIntRange() {
        testExample("Examples/18_Summary_1/Examples/IntRange.kt", IntRangeKt::main);
    }

    @Test
    public void testRangeMembership() {
        testExample("Examples/18_Summary_1/Examples/RangeMembership.kt", RangeMembershipKt::main);
    }

    @Test
    public void testIntRanges() {
        testExample("Examples/19_Classes_and_Objects/Examples/IntRanges.kt", IntRangesKt::main);
    }

    @Test
    public void testRangeSum() {
        testExample("Examples/19_Classes_and_Objects/Examples/RangeSum.kt", RangeSumKt::main);
    }

    @Test
    public void testAnimals() {
        testExample("Examples/20_Creating_Classes/Examples/Animals.kt", AnimalsKt::main);
    }

    @Test
    public void testDog() {
        testExample("Examples/22_Member_Functions/Examples/Dog.kt", DogKt::main);
    }

    @Test
    public void testCat() {
        testExample("Examples/22_Member_Functions/Examples/Cat.kt", CatKt::main);
    }

    @Test
    public void testHamster() {
        testExample("Examples/22_Member_Functions/Examples/Hamster.kt", HamsterKt::main);
    }

    @Test
    public void testImportClass() {
        testExample("Examples/23_Imports_and_Packages/Examples/ImportClass.kt", ImportClassKt::main);
    }

    @Test
    public void testImportMultiple() {
        testExample("Examples/23_Imports_and_Packages/Examples/ImportMultiple.kt", ImportMultipleKt::main);
    }

    @Test
    public void testImportNameChange() {
        testExample("Examples/23_Imports_and_Packages/Examples/ImportNameChange.kt", ImportNameChangeKt::main);
    }

    @Test
    public void testImportEverything() {
        testExample("Examples/23_Imports_and_Packages/Examples/ImportEverything.kt", ImportEverythingKt::main);
    }

    @Test
    public void testFullyQualify() {
        testExample("Examples/23_Imports_and_Packages/Examples/FullyQualify.kt", FullyQualifyKt::main);
    }

    @Test
    public void testImportPythagorean() {
        testExample("Examples/23_Imports_and_Packages/Examples/ImportPythagorean.kt", ImportPythagoreanKt::main);
    }

    @Test
    public void testTestingExample() {
        testExample("Examples/24_Testing/Examples/TestingExample.kt", TestingExampleKt::main);
    }

    @Test
    public void testTDDFail() {
        testExample("Examples/24_Testing/Examples/TDDFail.kt", testing1.TDDFailKt::main);
    }

    @Test
    public void testTDDStillFails() {
        testExample("Examples/24_Testing/Examples/TDDStillFails.kt", testing2.TDDStillFailsKt::main);
    }

    @Test
    public void testTDDWorks() {
        testExample("Examples/24_Testing/Examples/TDDWorks.kt", testing3.TDDWorksKt::main);
    }

    @Test
    public void testCup() {
        testExample("Examples/25_Properties/Examples/Cup.kt", CupKt::main);
    }

    @Test
    public void testCup2() {
        testExample("Examples/25_Properties/Examples/Cup2.kt", Cup2Kt::main);
    }

    @Test
    public void testChangingAVal() {
        testExample("Examples/26_References_and_Mutability/Examples/ChangingAVal.kt", ChangingAValKt::main);
    }

    @Test
    public void testAnUnchangingVar() {
        testExample("Examples/26_References_and_Mutability/Examples/AnUnchangingVar.kt", AnUnchangingVarKt::main);
    }

    @Test
    public void testReferences() {
        testExample("Examples/26_References_and_Mutability/Examples/References.kt", ReferencesKt::main);
    }

    @Test
    public void testLists() {
        testExample("Examples/27_Lists/Examples/Lists.kt", ListsKt::main);
    }

    @Test
    public void testParameterizedTypes() {
        testExample("Examples/28_Parameterized_Types/Examples/ParameterizedTypes.kt", ParameterizedTypesKt::main);
    }

    @Test
    public void testParameterizedReturnTypes() {
        testExample("Examples/28_Parameterized_Types/Examples/ParameterizedReturnTypes.kt", ParameterizedReturnTypesKt::main);
    }

    @Test
    public void testMutableList() {
        testExample("Examples/29_Read_only_and_Mutable_Lists/Examples/MutableList.kt", MutableListKt::main);
    }

    @Test
    public void testMutableListIsList() {
        testExample("Examples/29_Read_only_and_Mutable_Lists/Examples/MutableListIsList.kt", MutableListIsListKt::main);
    }

    @Test
    public void testDifferentReferencesToList() {
        testExample("Examples/29_Read_only_and_Mutable_Lists/Examples/DifferentReferencesToList.kt", DifferentReferencesToListKt::main);
    }

    @Test
    public void testUseALibrary() {
        testExample("Examples/30_Summary_2/Examples/UseALibrary.kt", UseALibraryKt::main);
    }

    @Test
    public void testUsingAtomicTest() {
        testExample("Examples/30_Summary_2/Examples/UsingAtomicTest.kt", UsingAtomicTestKt::main);
    }

    @Test
    public void testListCollection() {
        testExample("Examples/30_Summary_2/Examples/ListCollection.kt", ListCollectionKt::main);
    }

    @Test
    public void testClassBodies() {
        testExample("Examples/30_Summary_2/Examples/ClassBodies.kt", ClassBodiesKt::main);
    }

    @Test
    public void testTemperature() {
        testExample("Examples/30_Summary_2/Examples/Temperature.kt", TemperatureKt::main);
    }

    @Test
    public void testTicTacToe() {
        testExample("Examples/30_Summary_2/Examples/TicTacToe.kt", TicTacToeKt::main);
    }

    @Test
    public void testObserveAnimals() {
        testExample("Examples/31_Visibility_Modifiers/Examples/ObserveAnimals.kt", ObserveAnimalsKt::main);
    }

    @Test
    public void testCookie() {
        testExample("Examples/31_Visibility_Modifiers/Examples/Cookie.kt", CookieKt::main);
    }

    @Test
    public void testWhenExpressions() {
        testExample("Examples/33_when_Expressions/Examples/WhenExpressions.kt", WhenExpressionsKt::main);
    }

    @Test
    public void testSmartCasts() {
        testExample("Examples/34_Smart_Casts/Examples/SmartCasts.kt", smartCasts.SmartCastsKt::main);
    }

    @Test
    public void testWhenAndSmartCasts() {
        testExample("Examples/34_Smart_Casts/Examples/WhenAndSmartCasts.kt", smartCasts.WhenAndSmartCastsKt::main);
    }

    @Test
    public void testNamedArguments() {
        testExample("Examples/35_Named_and_Default_Arguments/Examples/NamedArguments.kt", NamedArgumentsKt::main);
    }

    @Test
    public void testArgumentOrder() {
        testExample("Examples/35_Named_and_Default_Arguments/Examples/ArgumentOrder.kt", ArgumentOrderKt::main);
    }

    @Test
    public void testNamedAndDefaultArgs() {
        testExample("Examples/35_Named_and_Default_Arguments/Examples/NamedAndDefaultArgs.kt", NamedAndDefaultArgsKt::main);
    }

    @Test
    public void testOverloading() {
        testExample("Examples/36_Overloading/Examples/Overloading.kt", OverloadingKt::main);
    }

    @Test
    public void testOverloadingAdd() {
        testExample("Examples/36_Overloading/Examples/OverloadingAdd.kt", OverloadingAddKt::main);
    }

    @Test
    public void testWithoutDefaultArguments() {
        testExample("Examples/36_Overloading/Examples/WithoutDefaultArguments.kt", WithoutDefaultArgumentsKt::main);
    }

    @Test
    public void testWithDefaultArguments() {
        testExample("Examples/36_Overloading/Examples/WithDefaultArguments.kt", WithDefaultArgumentsKt::main);
    }

    @Test
    public void testClassArg() {
        testExample("Examples/37_Class_Arguments/Examples/ClassArg.kt", ClassArgKt::main);
    }

    @Test
    public void testVisibleClassArgs() {
        testExample("Examples/37_Class_Arguments/Examples/VisibleClassArgs.kt", VisibleClassArgsKt::main);
    }

    @Test
    public void testMultipleClassArgs() {
        testExample("Examples/37_Class_Arguments/Examples/MultipleClassArgs.kt", MultipleClassArgsKt::main);
    }

    @Test
    public void testInitSection() {
        testExample("Examples/38_Constructors/Examples/InitSection.kt", constructors.InitSectionKt::main);
    }

    @Test
    public void testCoffee() {
        testExample("Examples/38_Constructors/Examples/Coffee.kt", CoffeeKt::main);
    }

    @Test
    public void testGardenGnome() {
        testExample("Examples/39_Secondary_Constructors/Examples/GardenGnome.kt", GardenGnomeKt::main);
    }

    @Test
    public void testSimple() {
        testExample("Examples/40_Data_Classes/Examples/Simple.kt", SimpleKt::main);
    }

    @Test
    public void testDataClasses() {
        testExample("Examples/40_Data_Classes/Examples/DataClasses.kt", dataClasses.DataClassesKt::main);
    }

    @Test
    public void testCopyDataClass() {
        testExample("Examples/40_Data_Classes/Examples/CopyDataClass.kt", CopyDataClassKt::main);
    }

    @Test
    public void testBicycle() {
        testExample("Examples/41_Automatic_String_Conversion/Examples/Bicycle.kt", BicycleKt::main);
    }

    @Test
    public void testSurrey() {
        testExample("Examples/41_Automatic_String_Conversion/Examples/Surrey.kt", SurreyKt::main);
    }

    @Test
    public void testBetterSurrey() {
        testExample("Examples/41_Automatic_String_Conversion/Examples/BetterSurrey.kt", BetterSurreyKt::main);
    }

    @Test
    public void testSets() {
        testExample("Examples/42_Sets/Examples/Sets.kt", SetsKt::main);
    }

    @Test
    public void testRemoveDuplicates() {
        testExample("Examples/42_Sets/Examples/RemoveDuplicates.kt", RemoveDuplicatesKt::main);
    }

    @Test
    public void testMutableSet() {
        testExample("Examples/42_Sets/Examples/MutableSet.kt", MutableSetKt::main);
    }

    @Test
    public void testMaps() {
        testExample("Examples/43_Maps/Examples/Maps.kt", MapsKt::main);
    }

    @Test
    public void testMutableMaps() {
        testExample("Examples/43_Maps/Examples/MutableMaps.kt", MutableMapsKt::main);
    }

    @Test
    public void testReadOnlyMaps() {
        testExample("Examples/43_Maps/Examples/ReadOnlyMaps.kt", ReadOnlyMapsKt::main);
    }

    @Test
    public void testContactMap() {
        testExample("Examples/43_Maps/Examples/ContactMap.kt", ContactMapKt::main);
    }

    @Test
    public void testPairs() {
        testExample("Examples/44_Destructuring_Declarations/Examples/Pairs.kt", PairsKt::main);
    }

    @Test
    public void testPairDestructuring() {
        testExample("Examples/44_Destructuring_Declarations/Examples/PairDestructuring.kt", PairDestructuringKt::main);
    }

    @Test
    public void testComputationResult() {
        testExample("Examples/44_Destructuring_Declarations/Examples/ComputationResult.kt", ComputationResultKt::main);
    }

    @Test
    public void testTuple() {
        testExample("Examples/44_Destructuring_Declarations/Examples/Tuple.kt", TupleKt::main);
    }

    @Test
    public void testForLoop() {
        testExample("Examples/44_Destructuring_Declarations/Examples/ForLoop.kt", ForLoopKt::main);
    }

    @Test
    public void testQuoting() {
        testExample("Examples/45_Extension_Functions/Examples/Quoting.kt", quoting.QuotingKt::main);
    }

    @Test
    public void testQuote() {
        testExample("Examples/45_Extension_Functions/Examples/Quote.kt", other.QuoteKt::main);
    }

    @Test
    public void testStrangeQuote() {
        testExample("Examples/45_Extension_Functions/Examples/StrangeQuote.kt", StrangeQuoteKt::main);
    }

    @Test
    public void testMemberVsExtension() {
        testExample("Examples/45_Extension_Functions/Examples/MemberVsExtension.kt", MemberVsExtensionKt::main);
    }

    @Test
    public void testBookExtensions() {
        testExample("Examples/45_Extension_Functions/Examples/BookExtensions.kt", BookExtensionsKt::main);
    }

    @Test
    public void testLocalFunctions() {
        testExample("Examples/46_Local_Functions/Examples/LocalFunctions.kt", LocalFunctionsKt::main);
    }

    @Test
    public void testLocalExtensions() {
        testExample("Examples/46_Local_Functions/Examples/LocalExtensions.kt", LocalExtensionsKt::main);
    }

    @Test
    public void testNullInMaps() {
        testExample("Examples/47_Nullable_Types/Examples/NullInMaps.kt", NullInMapsKt::main);
    }

    @Test
    public void testNullableTypes() {
        testExample("Examples/47_Nullable_Types/Examples/NullableTypes.kt", NullableTypesKt::main);
    }

    @Test
    public void testDereference() {
        testExample("Examples/47_Nullable_Types/Examples/Dereference.kt", DereferenceKt::main);
    }

    @Test
    public void testExplicitCheck() {
        testExample("Examples/47_Nullable_Types/Examples/ExplicitCheck.kt", ExplicitCheckKt::main);
    }

    @Test
    public void testDereferenceNull() {
        testExample("Examples/48_Safe_Calls/Examples/DereferenceNull.kt", DereferenceNullKt::main);
    }

    @Test
    public void testSafeCall() {
        testExample("Examples/48_Safe_Calls/Examples/SafeCall.kt", SafeCallKt::main);
    }

    @Test
    public void testSafeOperation() {
        testExample("Examples/48_Safe_Calls/Examples/SafeOperation.kt", SafeOperationKt::main);
    }

    @Test
    public void testChainedCalls() {
        testExample("Examples/48_Safe_Calls/Examples/ChainedCalls.kt", ChainedCallsKt::main);
    }

    @Test
    public void testElvisOperator() {
        testExample("Examples/49_The_Elvis_Operator/Examples/ElvisOperator.kt", ElvisOperatorKt::main);
    }

    @Test
    public void testElvisCall() {
        testExample("Examples/49_The_Elvis_Operator/Examples/ElvisCall.kt", ElvisCallKt::main);
    }

    @Test
    public void testNonNullAssert() {
        testExample("Examples/50_The_Non_null_Assertion/Examples/NonNullAssert.kt", NonNullAssertKt::main);
    }

    @Test
    public void testNonNullAssertCall() {
        testExample("Examples/50_The_Non_null_Assertion/Examples/NonNullAssertCall.kt", NonNullAssertCallKt::main);
    }

    @Test
    public void testValueFromMap() {
        testExample("Examples/50_The_Non_null_Assertion/Examples/ValueFromMap.kt", ValueFromMapKt::main);
    }

    @Test
    public void testExtensionsOnNullableString() {
        testExample("Examples/51_Extensions_for_Nullable_Types/Examples/ExtensionsOnNullableString.kt", ExtensionsOnNullableStringKt::main);
    }

    @Test
    public void testDeclarations() {
        testExample("Examples/51_Extensions_for_Nullable_Types/Examples/Declarations.kt", DeclarationsKt::main);
    }

    @Test
    public void testDisplayList() {
        testExample("Examples/52_Lambdas/Examples/DisplayList.kt", DisplayListKt::main);
    }

    @Test
    public void testDisplayListWithLambda() {
        testExample("Examples/52_Lambdas/Examples/DisplayListWithLambda.kt", DisplayListWithLambdaKt::main);
    }

    @Test
    public void testDisplayDuck() {
        testExample("Examples/52_Lambdas/Examples/DisplayDuck.kt", DisplayDuckKt::main);
    }

    @Test
    public void testDisplayDuckTestable() {
        testExample("Examples/52_Lambdas/Examples/DisplayDuckTestable.kt", DisplayDuckTestableKt::main);
    }

    @Test
    public void testTwoArgAnonymous() {
        testExample("Examples/52_Lambdas/Examples/TwoArgAnonymous.kt", TwoArgAnonymousKt::main);
    }

    @Test
    public void testCallLater() {
        testExample("Examples/52_Lambdas/Examples/CallLater.kt", CallLaterKt::main);
    }

    @Test
    public void testAssignAnonymous() {
        testExample("Examples/52_Lambdas/Examples/AssignAnonymous.kt", AssignAnonymousKt::main);
    }

    @Test
    public void testSimpleMap() {
        testExample("Examples/53_Operations_on_Lists/Examples/SimpleMap.kt", SimpleMapKt::main);
    }

    @Test
    public void testSum() {
        testExample("Examples/53_Operations_on_Lists/Examples/Sum.kt", SumKt::main);
    }

    @Test
    public void testReduce() {
        testExample("Examples/53_Operations_on_Lists/Examples/Reduce.kt", ReduceKt::main);
    }

    @Test
    public void testMoreReduce() {
        testExample("Examples/53_Operations_on_Lists/Examples/MoreReduce.kt", MoreReduceKt::main);
    }

    @Test
    public void testZipper() {
        testExample("Examples/54_Combining_Lists_with_zip/Examples/Zipper.kt", ZipperKt::main);
    }

    @Test
    public void testIndexWithZip() {
        testExample("Examples/54_Combining_Lists_with_zip/Examples/IndexWithZip.kt", IndexWithZipKt::main);
    }

    @Test
    public void testZipMap() {
        testExample("Examples/54_Combining_Lists_with_zip/Examples/ZipMap.kt", combiningListsWithZip.ZipMapKt::main);
    }

    @Test
    public void testListOf() {
        testExample("Examples/55_Varargs_and_Arrays/Examples/ListOf.kt", ListOfKt::main);
    }

    @Test
    public void testVariableArgLists() {
        testExample("Examples/55_Varargs_and_Arrays/Examples/VariableArgLists.kt", VariableArgListsKt::main);
    }

    @Test
    public void testVarargSum() {
        testExample("Examples/55_Varargs_and_Arrays/Examples/VarargSum.kt", VarargSumKt::main);
    }

    @Test
    public void testSpreadOperator() {
        testExample("Examples/55_Varargs_and_Arrays/Examples/SpreadOperator.kt", SpreadOperatorKt::main);
    }

    @Test
    public void testTwoFunctionsWithVarargs() {
        testExample("Examples/55_Varargs_and_Arrays/Examples/TwoFunctionsWithVarargs.kt", TwoFunctionsWithVarargsKt::main);
    }

    @Test
    public void testGreatApe() {
        testExample("Examples/56_Inheritance/Examples/GreatApe.kt", inheritance.GreatApeKt::main);
    }

    @Test
    public void testGreatApe2() {
        testExample("Examples/57_Base_Class_Initialization/Examples/GreatApe2.kt", baseClassInit.GreatApe2Kt::main);
    }

    @Test
    public void testAuxiliaryInitialization() {
        testExample("Examples/57_Base_Class_Initialization/Examples/AuxiliaryInitialization.kt", AuxiliaryInitializationKt::main);
    }

    @Test
    public void testCallingOtherConstructors() {
        testExample("Examples/57_Base_Class_Initialization/Examples/CallingOtherConstructors.kt", baseClassInit.CallingOtherConstructorsKt::main);
    }

    @Test
    public void testGreatApe3() {
        testExample("Examples/58_Overriding_Functions/Examples/GreatApe3.kt", GreatApe3Kt::main);
    }

    @Test
    public void testAbstractClasses() {
        testExample("Examples/59_Abstract_Classes/Examples/AbstractClasses.kt", abstractClasses.AbstractClassesKt::main);
    }

    @Test
    public void testStateOfAClass() {
        testExample("Examples/60_Interfaces/Examples/StateOfAClass.kt", StateOfAClassKt::main);
    }

    @Test
    public void testInterfaceMemberImplementations() {
        testExample("Examples/60_Interfaces/Examples/InterfaceMemberImplementations.kt", interfaces3.InterfaceMemberImplementationsKt::main);
    }

    @Test
    public void testFramework() {
        testExample("Examples/60_Interfaces/Examples/Framework.kt", FrameworkKt::main);
    }

    @Test
    public void testInterfaceCollision() {
        testExample("Examples/60_Interfaces/Examples/InterfaceCollision.kt", InterfaceCollisionKt::main);
    }

    @Test
    public void testMyClass() {
        testExample("Examples/61_Property_Accessors/Examples/MyClass.kt", propertyAccessors.MyClassKt::main);
    }

    @Test
    public void testDefaultAccessors() {
        testExample("Examples/61_Property_Accessors/Examples/DefaultAccessors.kt", DefaultAccessorsKt::main);
    }

    @Test
    public void testLoggingChange() {
        testExample("Examples/61_Property_Accessors/Examples/LoggingChange.kt", LoggingChangeKt::main);
    }

    @Test
    public void testHamsters() {
        testExample("Examples/61_Property_Accessors/Examples/Hamsters.kt", propertyAccessors.HamstersKt::main);
    }

    @Test
    public void testPropertyInInterface() {
        testExample("Examples/61_Property_Accessors/Examples/PropertyInInterface.kt", propertyAccessors.PropertyInInterfaceKt::main);
    }

    @Test
    public void testExplicitDelegation() {
        testExample("Examples/63_Class_Delegation/Examples/ExplicitDelegation.kt", ExplicitDelegationKt::main);
    }

    @Test
    public void testAdjustedControls() {
        testExample("Examples/63_Class_Delegation/Examples/AdjustedControls.kt", AdjustedControlsKt::main);
    }

    @Test
    public void testModelingMultipleInheritance() {
        testExample("Examples/63_Class_Delegation/Examples/ModelingMultipleInheritance.kt", ModelingMultipleInheritanceKt::main);
    }

    @Test
    public void testLevel() {
        testExample("Examples/64_Enumerations/Examples/Level.kt", enumerations1.LevelKt::main);
    }

    @Test
    public void testImportLevel() {
        testExample("Examples/64_Enumerations/Examples/ImportLevel.kt", enumerations2.ImportLevelKt::main);
    }

    @Test
    public void testColorBlendTest() {
        testExample("Examples/65_More_About_when_Expressions/Examples/ColorBlendTest.kt", colorBlend.ColorBlendTestKt::main);
    }

    @Test
    public void testColorBlendMap() {
        testExample("Examples/65_More_About_when_Expressions/Examples/ColorBlendMap.kt", colorBlendMap.ColorBlendMapKt::main);
    }

    @Test
    public void testRegularClasses() {
        testExample("Examples/66_Sealed_Classes/Examples/RegularClasses.kt", regularClasses.RegularClassesKt::main);
    }

    @Test
    public void testSealedClasses() {
        testExample("Examples/66_Sealed_Classes/Examples/SealedClasses.kt", SealedClassesKt::main);
    }

    @Test
    public void testObjectKeyword() {
        testExample("Examples/67_Objects_and_Companion_Objects/Examples/ObjectKeyword.kt", objects.ObjectKeywordKt::main);
    }

    @Test
    public void testCompanionObject() {
        testExample("Examples/67_Objects_and_Companion_Objects/Examples/CompanionObject.kt", companionObjects1.CompanionObjectKt::main);
    }

    @Test
    public void testObjectProperty() {
        testExample("Examples/67_Objects_and_Companion_Objects/Examples/ObjectProperty.kt", companionObjects2.ObjectPropertyKt::main);
    }

    @Test
    public void testObjectFunctions() {
        testExample("Examples/67_Objects_and_Companion_Objects/Examples/ObjectFunctions.kt", companionObjects3.ObjectFunctionsKt::main);
    }

    @Test
    public void testObjCounter() {
        testExample("Examples/67_Objects_and_Companion_Objects/Examples/ObjCounter.kt", companionObjects4.ObjCounterKt::main);
    }

    @Test
    public void testCreateInCompanionObject() {
        testExample("Examples/67_Objects_and_Companion_Objects/Examples/CreateInCompanionObject.kt", companionObjects5.CreateInCompanionObjectKt::main);
    }

    @Test
    public void testDataClassesWithVars() {
        testExample("Examples/79_Data_Classes_and_Immutability/Examples/DataClassesWithVars.kt", dataClasses3.DataClassesWithVarsKt::main);
    }

    @Test
    public void testDataClassAndHashCode() {
        testExample("Examples/79_Data_Classes_and_Immutability/Examples/DataClassAndHashCode.kt", dataClasses4.DataClassAndHashCodeKt::main);
    }

    @Test
    public void testExerciseHelloWorld1() {
        testExercise("Exercises/06_Hello_World/Exercise1/output.txt", helloWorld1.SolutionKt::main);
    }

    @Test
    public void testExerciseHelloWorld2() {
        testExercise("Exercises/06_Hello_World/Exercise2/output.txt", helloWorld2.SolutionKt::main);
    }

    @Test
    public void testExerciseVariables1() {
        testExercise("Exercises/07_Variables/Exercise1/output.txt", exercises.variables1.SolutionKt::main);
    }

    @Test
    public void testExerciseVariables2() {
        testExercise("Exercises/07_Variables/Exercise2/output.txt", exercises.variables2.SolutionKt::main);
    }

    @Test
    public void testExerciseStringTemplates1() {
        testExercise("Exercises/11_String_Templates/Exercise1/output.txt", stringTemplates1.SolutionKt::main);
    }

    @Test
    public void testExerciseStringTemplates2() {
        testExercise("Exercises/11_String_Templates/Exercise2/output.txt", stringTemplates2.SolutionKt::main);
    }

    @Test
    public void testExerciseNumberTypes2() {
        testExercise("Exercises/12_Number_Types/Exercise2/output.txt", numberTypes2.SolutionKt::main);
    }

    @Test
    public void testExerciseExpressionsAndStatements1() {
        testExercise("Exercises/17_Expressions_and_Statements/Exercise1/output.txt", expressionsAndStatements1.SolutionKt::main);
    }
}