import org.junit.Test;

public class TestExamples extends AbstractTestExamples {

    @Test
    public void testEmptyProgram() {
        testExample("Examples/06_Hello_World/Examples/EmptyProgram.kt", helloWorld.EmptyProgramKt::main);
    }

    @Test
    public void testHelloWorld() {
        testExample("Examples/06_Hello_World/Examples/HelloWorld.kt", helloWorld.HelloWorldKt::main);
    }

    @Test
    public void testVars() {
        testExample("Examples/07_Variables/Examples/Vars.kt", variables.VarsKt::main);
    }

    @Test
    public void testMutableVariable() {
        testExample("Examples/07_Variables/Examples/MutableVariable.kt", variables.MutableVariableKt::main);
    }

    @Test
    public void testVals() {
        testExample("Examples/07_Variables/Examples/Vals.kt", variables.ValsKt::main);
    }

    @Test
    public void testStringPlusNumber() {
        testExample("Examples/08_Data_Types/Examples/StringPlusNumber.kt", dataTypes.StringPlusNumberKt::main);
    }

    @Test
    public void testTypes() {
        testExample("Examples/08_Data_Types/Examples/Types.kt", dataTypes.TypesKt::main);
    }

    @Test
    public void testInference() {
        testExample("Examples/08_Data_Types/Examples/Inference.kt", dataTypes.InferenceKt::main);
    }

    @Test
    public void testMultiplyByTwo() {
        testExample("Examples/09_Functions/Examples/MultiplyByTwo.kt", functions.MultiplyByTwoKt::main);
    }

    @Test
    public void testSayHello() {
        testExample("Examples/09_Functions/Examples/SayHello.kt", functions.SayHelloKt::main);
    }

    @Test
    public void testMultiplyByThree() {
        testExample("Examples/09_Functions/Examples/MultiplyByThree.kt", functions.MultiplyByThreeKt::main);
    }

    @Test
    public void testMultiplyByFour() {
        testExample("Examples/09_Functions/Examples/MultiplyByFour.kt", functions.MultiplyByFourKt::main);
    }

    @Test
    public void testIf1() {
        testExample("Examples/10_If_Expressions/Examples/If1.kt", ifExpressions.If1Kt::main);
    }

    @Test
    public void testIf2() {
        testExample("Examples/10_If_Expressions/Examples/If2.kt", ifExpressions.If2Kt::main);
    }

    @Test
    public void testIf3() {
        testExample("Examples/10_If_Expressions/Examples/If3.kt", ifExpressions.If3Kt::main);
    }

    @Test
    public void testIf4() {
        testExample("Examples/10_If_Expressions/Examples/If4.kt", ifExpressions.If4Kt::main);
    }

    @Test
    public void testIf5() {
        testExample("Examples/10_If_Expressions/Examples/If5.kt", ifExpressions.If5Kt::main);
    }

    @Test
    public void testIf6() {
        testExample("Examples/10_If_Expressions/Examples/If6.kt", ifExpressions.If6Kt::main);
    }

    @Test
    public void testTrueOrFalse() {
        testExample("Examples/10_If_Expressions/Examples/TrueOrFalse.kt", ifExpressions.TrueOrFalseKt::main);
    }

    @Test
    public void testOneOrTheOther() {
        testExample("Examples/10_If_Expressions/Examples/OneOrTheOther.kt", ifExpressions.OneOrTheOtherKt::main);
    }

    @Test
    public void testStringTemplates() {
        testExample("Examples/11_String_Templates/Examples/StringTemplates.kt", stringTemplates.StringTemplatesKt::main);
    }

    @Test
    public void testStringConcatenation() {
        testExample("Examples/11_String_Templates/Examples/StringConcatenation.kt", stringTemplates.StringConcatenationKt::main);
    }

    @Test
    public void testExpressionInStringTemplate() {
        testExample("Examples/11_String_Templates/Examples/ExpressionInStringTemplate.kt", stringTemplates.ExpressionInStringTemplateKt::main);
    }

    @Test
    public void testTripleQuotes() {
        testExample("Examples/11_String_Templates/Examples/TripleQuotes.kt", stringTemplates.TripleQuotesKt::main);
    }

    @Test
    public void testInferInt() {
        testExample("Examples/12_Number_Types/Examples/InferInt.kt", numberTypes.InferIntKt::main);
    }

    @Test
    public void testModulus() {
        testExample("Examples/12_Number_Types/Examples/Modulus.kt", numberTypes.ModulusKt::main);
    }

    @Test
    public void testIntDivisionTruncates() {
        testExample("Examples/12_Number_Types/Examples/IntDivisionTruncates.kt", numberTypes.IntDivisionTruncatesKt::main);
    }

    @Test
    public void testBMI() {
        testExample("Examples/12_Number_Types/Examples/BMI.kt", numberTypes.BMIKt::main);
    }

    @Test
    public void testIntegerMath() {
        testExample("Examples/12_Number_Types/Examples/IntegerMath.kt", numberTypes.IntegerMathKt::main);
    }

    @Test
    public void testIntegerOverflow() {
        testExample("Examples/12_Number_Types/Examples/IntegerOverflow.kt", numberTypes.IntegerOverflowKt::main);
    }

    @Test
    public void testUsingLongs() {
        testExample("Examples/12_Number_Types/Examples/UsingLongs.kt", numberTypes.UsingLongsKt::main);
    }

    @Test
    public void testBiggestLong() {
        testExample("Examples/12_Number_Types/Examples/BiggestLong.kt", numberTypes.BiggestLongKt::main);
    }

    @Test
    public void testBooleans1() {
        testExample("Examples/13_Booleans/Examples/Booleans1.kt", booleans.Booleans1Kt::main);
    }

    @Test
    public void testBooleans2() {
        testExample("Examples/13_Booleans/Examples/Booleans2.kt", booleans.Booleans2Kt::main);
    }

    @Test
    public void testBooleans3() {
        testExample("Examples/13_Booleans/Examples/Booleans3.kt", booleans.Booleans3Kt::main);
    }

    @Test
    public void testEvaluationOrder() {
        testExample("Examples/13_Booleans/Examples/EvaluationOrder.kt", booleans.EvaluationOrderKt::main);
    }

    @Test
    public void testWhileLoop() {
        testExample("Examples/14_Repetition_with_while/Examples/WhileLoop.kt", repetitionWithWhile.WhileLoopKt::main);
    }

    @Test
    public void testDoWhileLoop() {
        testExample("Examples/14_Repetition_with_while/Examples/DoWhileLoop.kt", repetitionWithWhile.DoWhileLoopKt::main);
    }

    @Test
    public void testRepeatThreeTimes() {
        testExample("Examples/15_for_and_Ranges/Examples/RepeatThreeTimes.kt", forAndRanges.RepeatThreeTimesKt::main);
    }

    @Test
    public void testDefiningRanges() {
        testExample("Examples/15_for_and_Ranges/Examples/DefiningRanges.kt", forAndRanges.DefiningRangesKt::main);
    }

    @Test
    public void testSumUsingRange() {
        testExample("Examples/15_for_and_Ranges/Examples/SumUsingRange.kt", forAndRanges.SumUsingRangeKt::main);
    }

    @Test
    public void testForWithRanges() {
        testExample("Examples/15_for_and_Ranges/Examples/ForWithRanges.kt", forAndRanges.ForWithRangesKt::main);
    }

    @Test
    public void testCharRange() {
        testExample("Examples/15_for_and_Ranges/Examples/CharRange.kt", forAndRanges.CharRangeKt::main);
    }

    @Test
    public void testIndexIntoString() {
        testExample("Examples/15_for_and_Ranges/Examples/IndexIntoString.kt", forAndRanges.IndexIntoStringKt::main);
    }

    @Test
    public void testAddingIntToChar() {
        testExample("Examples/15_for_and_Ranges/Examples/AddingIntToChar.kt", forAndRanges.AddingIntToCharKt::main);
    }

    @Test
    public void testIterateOverString() {
        testExample("Examples/15_for_and_Ranges/Examples/IterateOverString.kt", forAndRanges.IterateOverStringKt::main);
    }

    @Test
    public void testContainsChar() {
        testExample("Examples/15_for_and_Ranges/Examples/ContainsChar.kt", forAndRanges.ContainsCharKt::main);
    }

    @Test
    public void testRangeMembership() {
        testExample("Examples/16_More_About_Ranges/Examples/RangeMembership.kt", moreAboutRanges.RangeMembershipKt::main);
    }

    @Test
    public void testMembershipUsingBounds() {
        testExample("Examples/16_More_About_Ranges/Examples/MembershipUsingBounds.kt", moreAboutRanges.MembershipUsingBoundsKt::main);
    }

    @Test
    public void testIterationVsMembership() {
        testExample("Examples/16_More_About_Ranges/Examples/IterationVsMembership.kt", moreAboutRanges.IterationVsMembershipKt::main);
    }

    @Test
    public void testInString() {
        testExample("Examples/16_More_About_Ranges/Examples/InString.kt", moreAboutRanges.InStringKt::main);
    }

    @Test
    public void testCharRange1() {
        testExample("Examples/16_More_About_Ranges/Examples/CharRange.kt", moreAboutRanges.CharRangeKt::main);
    }

    @Test
    public void testFloatingPointRange() {
        testExample("Examples/16_More_About_Ranges/Examples/FloatingPointRange.kt", moreAboutRanges.FloatingPointRangeKt::main);
    }

    @Test
    public void testStringRange() {
        testExample("Examples/16_More_About_Ranges/Examples/StringRange.kt", moreAboutRanges.StringRangeKt::main);
    }

    @Test
    public void testForLoopIsAStatement() {
        testExample("Examples/17_Expressions_and_Statements/Examples/ForLoopIsAStatement.kt", expressionsAndStatements.ForLoopIsAStatementKt::main);
    }

    @Test
    public void testUnitReturnType() {
        testExample("Examples/17_Expressions_and_Statements/Examples/UnitReturnType.kt", expressionsAndStatements.UnitReturnTypeKt::main);
    }

    @Test
    public void testAssigningAnIf() {
        testExample("Examples/17_Expressions_and_Statements/Examples/AssigningAnIf.kt", expressionsAndStatements.AssigningAnIfKt::main);
    }

    @Test
    public void testBasicFunctions() {
        testExample("Examples/18_Summary_1/Examples/BasicFunctions.kt", summary1.BasicFunctionsKt::main);
    }

    @Test
    public void testBooleans() {
        testExample("Examples/18_Summary_1/Examples/Booleans.kt", summary1.BooleansKt::main);
    }

    @Test
    public void testIfResult() {
        testExample("Examples/18_Summary_1/Examples/IfResult.kt", summary1.IfResultKt::main);
    }

    @Test
    public void testIfExpression() {
        testExample("Examples/18_Summary_1/Examples/IfExpression.kt", summary1.IfExpressionKt::main);
    }

    @Test
    public void testStringTemplates1() {
        testExample("Examples/18_Summary_1/Examples/StringTemplates.kt", summary1.StringTemplatesKt::main);
    }

    @Test
    public void testTripleQuotes1() {
        testExample("Examples/18_Summary_1/Examples/TripleQuotes.kt", summary1.TripleQuotesKt::main);
    }

    @Test
    public void testNumberTypes() {
        testExample("Examples/18_Summary_1/Examples/NumberTypes.kt", summary1.NumberTypesKt::main);
    }

    @Test
    public void testOverflow() {
        testExample("Examples/18_Summary_1/Examples/Overflow.kt", summary1.OverflowKt::main);
    }

    @Test
    public void testTruncation() {
        testExample("Examples/18_Summary_1/Examples/Truncation.kt", summary1.TruncationKt::main);
    }

    @Test
    public void testIterateThroughString() {
        testExample("Examples/18_Summary_1/Examples/IterateThroughString.kt", summary1.IterateThroughStringKt::main);
    }

    @Test
    public void testIntRange() {
        testExample("Examples/18_Summary_1/Examples/IntRange.kt", summary1.IntRangeKt::main);
    }

    @Test
    public void testRangeMembership1() {
        testExample("Examples/18_Summary_1/Examples/RangeMembership.kt", summary1.RangeMembershipKt::main);
    }

    @Test
    public void testIntRanges() {
        testExample("Examples/19_Classes_and_Objects/Examples/IntRanges.kt", classesAndObjects.IntRangesKt::main);
    }

    @Test
    public void testRangeSum() {
        testExample("Examples/19_Classes_and_Objects/Examples/RangeSum.kt", classesAndObjects.RangeSumKt::main);
    }

    @Test
    public void testAnimals() {
        testExample("Examples/20_Creating_Classes/Examples/Animals.kt", creatingClasses.AnimalsKt::main);
    }

    @Test
    public void testDog() {
        testExample("Examples/22_Member_Functions/Examples/Dog.kt", memberFunctions.DogKt::main);
    }

    @Test
    public void testCat() {
        testExample("Examples/22_Member_Functions/Examples/Cat.kt", memberFunctions.CatKt::main);
    }

    @Test
    public void testHamster() {
        testExample("Examples/22_Member_Functions/Examples/Hamster.kt", memberFunctions.HamsterKt::main);
    }

    @Test
    public void testImportClass() {
        testExample("Examples/23_Imports_and_Packages/Examples/ImportClass.kt", importsAndPackages.ImportClassKt::main);
    }

    @Test
    public void testImportMultiple() {
        testExample("Examples/23_Imports_and_Packages/Examples/ImportMultiple.kt", importsAndPackages.ImportMultipleKt::main);
    }

    @Test
    public void testImportNameChange() {
        testExample("Examples/23_Imports_and_Packages/Examples/ImportNameChange.kt", importsAndPackages.ImportNameChangeKt::main);
    }

    @Test
    public void testImportEverything() {
        testExample("Examples/23_Imports_and_Packages/Examples/ImportEverything.kt", importsAndPackages.ImportEverythingKt::main);
    }

    @Test
    public void testFullyQualify() {
        testExample("Examples/23_Imports_and_Packages/Examples/FullyQualify.kt", importsAndPackages.FullyQualifyKt::main);
    }

    @Test
    public void testImportPythagorean() {
        testExample("Examples/23_Imports_and_Packages/Examples/ImportPythagorean.kt", importsAndPackages.ImportPythagoreanKt::main);
    }

    @Test
    public void testTestingExample() {
        testExample("Examples/24_Testing/Examples/TestingExample.kt", testing.TestingExampleKt::main);
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
        testExample("Examples/25_Properties/Examples/Cup.kt", properties.CupKt::main);
    }

    @Test
    public void testCup2() {
        testExample("Examples/25_Properties/Examples/Cup2.kt", properties.Cup2Kt::main);
    }

    @Test
    public void testChangingAVal() {
        testExample("Examples/26_References_and_Mutability/Examples/ChangingAVal.kt", referencesAndMutability.ChangingAValKt::main);
    }

    @Test
    public void testAnUnchangingVar() {
        testExample("Examples/26_References_and_Mutability/Examples/AnUnchangingVar.kt", referencesAndMutability.AnUnchangingVarKt::main);
    }

    @Test
    public void testReferences() {
        testExample("Examples/26_References_and_Mutability/Examples/References.kt", referencesAndMutability.ReferencesKt::main);
    }

    @Test
    public void testLists() {
        testExample("Examples/27_Lists/Examples/Lists.kt", lists.ListsKt::main);
    }

    @Test
    public void testParameterizedTypes() {
        testExample("Examples/28_Parameterized_Types/Examples/ParameterizedTypes.kt", parameterizedTypes.ParameterizedTypesKt::main);
    }

    @Test
    public void testParameterizedReturnTypes() {
        testExample("Examples/28_Parameterized_Types/Examples/ParameterizedReturnTypes.kt", parameterizedTypes.ParameterizedReturnTypesKt::main);
    }

    @Test
    public void testMutableList() {
        testExample("Examples/29_Read_only_and_Mutable_Lists/Examples/MutableList.kt", readOnlyAndMutableLists.MutableListKt::main);
    }

    @Test
    public void testMutableListIsList() {
        testExample("Examples/29_Read_only_and_Mutable_Lists/Examples/MutableListIsList.kt", readOnlyAndMutableLists.MutableListIsListKt::main);
    }

    @Test
    public void testDifferentReferencesToList() {
        testExample("Examples/29_Read_only_and_Mutable_Lists/Examples/DifferentReferencesToList.kt", readOnlyAndMutableLists.DifferentReferencesToListKt::main);
    }

    @Test
    public void testUseALibrary() {
        testExample("Examples/30_Summary_2/Examples/UseALibrary.kt", summary2.UseALibraryKt::main);
    }

    @Test
    public void testUsingAtomicTest() {
        testExample("Examples/30_Summary_2/Examples/UsingAtomicTest.kt", summary2.UsingAtomicTestKt::main);
    }

    @Test
    public void testListCollection() {
        testExample("Examples/30_Summary_2/Examples/ListCollection.kt", summary2.ListCollectionKt::main);
    }

    @Test
    public void testClassBodies() {
        testExample("Examples/30_Summary_2/Examples/ClassBodies.kt", summary2.ClassBodiesKt::main);
    }

    @Test
    public void testTemperature() {
        testExample("Examples/30_Summary_2/Examples/Temperature.kt", summary2.TemperatureKt::main);
    }

    @Test
    public void testTicTacToe() {
        testExample("Examples/30_Summary_2/Examples/TicTacToe.kt", summary2.TicTacToeKt::main);
    }

    @Test
    public void testObserveAnimals() {
        testExample("Examples/31_Visibility_Modifiers/Examples/ObserveAnimals.kt", visibilityModifiers.ObserveAnimalsKt::main);
    }

    @Test
    public void testCookie() {
        testExample("Examples/31_Visibility_Modifiers/Examples/Cookie.kt", visibilityModifiers.CookieKt::main);
    }

    @Test
    public void testWhenExpressions() {
        testExample("Examples/33_when_Expressions/Examples/WhenExpressions.kt", whenExpressions.WhenExpressionsKt::main);
    }

    @Test
    public void testWhenExpressionAndSmartCasts() {
        testExample("Examples/34_when_Expressions_and_Smart_Casts/Examples/WhenExpressionAndSmartCasts.kt", whenExpressionsAndSmartCasts.WhenExpressionAndSmartCastsKt::main);
    }

    @Test
    public void testNamedArguments() {
        testExample("Examples/35_Named_and_Default_Arguments/Examples/NamedArguments.kt", namedAndDefaultArguments.NamedArgumentsKt::main);
    }

    @Test
    public void testNamedArgumentsOrder() {
        testExample("Examples/35_Named_and_Default_Arguments/Examples/NamedArgumentsOrder.kt", namedAndDefaultArguments.NamedArgumentsOrderKt::main);
    }

    @Test
    public void testNamedAndDefaultArgs() {
        testExample("Examples/35_Named_and_Default_Arguments/Examples/NamedAndDefaultArgs.kt", namedAndDefaultArguments.NamedAndDefaultArgsKt::main);
    }

    @Test
    public void testOverloading() {
        testExample("Examples/36_Overloading/Examples/Overloading.kt", overloading.OverloadingKt::main);
    }

    @Test
    public void testOverloadingAdd() {
        testExample("Examples/36_Overloading/Examples/OverloadingAdd.kt", overloading.OverloadingAddKt::main);
    }

    @Test
    public void testWithoutDefaultArguments() {
        testExample("Examples/36_Overloading/Examples/WithoutDefaultArguments.kt", overloading.WithoutDefaultArgumentsKt::main);
    }

    @Test
    public void testWithDefaultArguments() {
        testExample("Examples/36_Overloading/Examples/WithDefaultArguments.kt", overloading.WithDefaultArgumentsKt::main);
    }

    @Test
    public void testClassArg() {
        testExample("Examples/37_Class_Arguments/Examples/ClassArg.kt", classArguments.ClassArgKt::main);
    }

    @Test
    public void testVisibleClassArgs() {
        testExample("Examples/37_Class_Arguments/Examples/VisibleClassArgs.kt", classArguments.VisibleClassArgsKt::main);
    }

    @Test
    public void testMultipleClassArgs() {
        testExample("Examples/37_Class_Arguments/Examples/MultipleClassArgs.kt", classArguments.MultipleClassArgsKt::main);
    }

    @Test
    public void testInitSection() {
        testExample("Examples/38_Constructors/Examples/InitSection.kt", constructors.InitSectionKt::main);
    }

    @Test
    public void testCoffee() {
        testExample("Examples/38_Constructors/Examples/Coffee.kt", constructors.CoffeeKt::main);
    }

    @Test
    public void testGardenGnome() {
        testExample("Examples/39_Secondary_Constructors/Examples/GardenGnome.kt", secondaryConstructors.GardenGnomeKt::main);
    }

    @Test
    public void testDataClasses() {
        testExample("Examples/40_Data_Classes/Examples/DataClasses.kt", dataClasses.DataClassesKt::main);
    }

    @Test
    public void testCopyDataClass() {
        testExample("Examples/40_Data_Classes/Examples/CopyDataClass.kt", dataClasses.CopyDataClassKt::main);
    }

    @Test
    public void testBicycle() {
        testExample("Examples/41_Automatic_String_Conversion/Examples/Bicycle.kt", automaticStringConversion.BicycleKt::main);
    }

    @Test
    public void testSurrey() {
        testExample("Examples/41_Automatic_String_Conversion/Examples/Surrey.kt", automaticStringConversion.SurreyKt::main);
    }

    @Test
    public void testSurreyWithToString() {
        testExample("Examples/41_Automatic_String_Conversion/Examples/SurreyWithToString.kt", automaticStringConversion.SurreyWithToStringKt::main);
    }

    @Test
    public void testSets() {
        testExample("Examples/42_Sets/Examples/Sets.kt", sets.SetsKt::main);
    }

    @Test
    public void testRemoveDuplicates() {
        testExample("Examples/42_Sets/Examples/RemoveDuplicates.kt", sets.RemoveDuplicatesKt::main);
    }

    @Test
    public void testMutableSet() {
        testExample("Examples/42_Sets/Examples/MutableSet.kt", sets.MutableSetKt::main);
    }

    @Test
    public void testMaps() {
        testExample("Examples/43_Maps/Examples/Maps.kt", maps.MapsKt::main);
    }

    @Test
    public void testMutableMaps() {
        testExample("Examples/43_Maps/Examples/MutableMaps.kt", maps.MutableMapsKt::main);
    }

    @Test
    public void testReadOnlyMaps() {
        testExample("Examples/43_Maps/Examples/ReadOnlyMaps.kt", maps.ReadOnlyMapsKt::main);
    }

    @Test
    public void testContactMap() {
        testExample("Examples/43_Maps/Examples/ContactMap.kt", maps.ContactMapKt::main);
    }

    @Test
    public void testPairs() {
        testExample("Examples/44_Destructuring_Declarations/Examples/Pairs.kt", destructuringDeclarations.PairsKt::main);
    }

    @Test
    public void testPairsAndDesctructuring() {
        testExample("Examples/44_Destructuring_Declarations/Examples/PairsAndDesctructuring.kt", destructuringDeclarations.PairsAndDesctructuringKt::main);
    }

    @Test
    public void testComputationResult() {
        testExample("Examples/44_Destructuring_Declarations/Examples/ComputationResult.kt", destructuringDeclarations.ComputationResultKt::main);
    }

    @Test
    public void testTuple() {
        testExample("Examples/44_Destructuring_Declarations/Examples/Tuple.kt", destructuringDeclarations.TupleKt::main);
    }

    @Test
    public void testDestructuringAndForLoop() {
        testExample("Examples/44_Destructuring_Declarations/Examples/DestructuringAndForLoop.kt", destructuringDeclarations.DestructuringAndForLoopKt::main);
    }

    @Test
    public void testQuoting() {
        testExample("Examples/45_Extension_Functions/Examples/Quoting.kt", quoting.QuotingKt::main);
    }

    @Test
    public void testQuote() {
        testExample("Examples/45_Extension_Functions/Examples/Quote.kt", extensionFunctions.QuoteKt::main);
    }

    @Test
    public void testStrangeQuote() {
        testExample("Examples/45_Extension_Functions/Examples/StrangeQuote.kt", extensionFunctions.StrangeQuoteKt::main);
    }

    @Test
    public void testMemberVsExtension() {
        testExample("Examples/45_Extension_Functions/Examples/MemberVsExtension.kt", extensionFunctions.MemberVsExtensionKt::main);
    }

    @Test
    public void testBookExtensions() {
        testExample("Examples/45_Extension_Functions/Examples/BookExtensions.kt", extensionFunctions.BookExtensionsKt::main);
    }

    @Test
    public void testLocalFunctions() {
        testExample("Examples/46_Local_Functions/Examples/LocalFunctions.kt", localFunctions.LocalFunctionsKt::main);
    }

    @Test
    public void testLocalExtensions() {
        testExample("Examples/46_Local_Functions/Examples/LocalExtensions.kt", localFunctions.LocalExtensionsKt::main);
    }

    @Test
    public void testNullInMaps() {
        testExample("Examples/47_Nullable_Types/Examples/NullInMaps.kt", nullableTypes.NullInMapsKt::main);
    }

    @Test
    public void testNullableAndNonnullTypes() {
        testExample("Examples/47_Nullable_Types/Examples/NullableAndNonnullTypes.kt", nullableTypes.NullableAndNonnullTypesKt::main);
    }

    @Test
    public void testDereference() {
        testExample("Examples/47_Nullable_Types/Examples/Dereference.kt", nullableTypes.DereferenceKt::main);
    }

    @Test
    public void testExplicitCheck() {
        testExample("Examples/47_Nullable_Types/Examples/ExplicitCheck.kt", nullableTypes.ExplicitCheckKt::main);
    }

    @Test
    public void testDereference1() {
        testExample("Examples/48_Safe_Calls_and_Elvis_Operator/Examples/Dereference.kt", safeCallsAndElvisOperator.DereferenceKt::main);
    }

    @Test
    public void testSafeCall() {
        testExample("Examples/48_Safe_Calls_and_Elvis_Operator/Examples/SafeCall.kt", safeCallsAndElvisOperator.SafeCallKt::main);
    }

    @Test
    public void testChainedSafeCalls() {
        testExample("Examples/48_Safe_Calls_and_Elvis_Operator/Examples/ChainedSafeCalls.kt", safeCallsAndElvisOperator.ChainedSafeCallsKt::main);
    }

    @Test
    public void testElvisOperator() {
        testExample("Examples/48_Safe_Calls_and_Elvis_Operator/Examples/ElvisOperator.kt", safeCallsAndElvisOperator.ElvisOperatorKt::main);
    }

    @Test
    public void testNonNullAssertedCalls() {
        testExample("Examples/49_Non_null_Asserted_Calls/Examples/NonNullAssertedCalls.kt", nonNullAssertedCalls.NonNullAssertedCallsKt::main);
    }

    @Test
    public void testNonNullAssertion() {
        testExample("Examples/49_Non_null_Asserted_Calls/Examples/NonNullAssertion.kt", nonNullAssertedCalls.NonNullAssertionKt::main);
    }

    @Test
    public void testGettingValueFromMap() {
        testExample("Examples/49_Non_null_Asserted_Calls/Examples/GettingValueFromMap.kt", nonNullAssertedCalls.GettingValueFromMapKt::main);
    }

    @Test
    public void testExtensionsOnNullableString() {
        testExample("Examples/50_Extensions_for_Nullable_Types/Examples/ExtensionsOnNullableString.kt", extensionsForNullableTypes.ExtensionsOnNullableStringKt::main);
    }

    @Test
    public void testDeclarations() {
        testExample("Examples/50_Extensions_for_Nullable_Types/Examples/Declarations.kt", extensionsForNullableTypes.DeclarationsKt::main);
    }

    @Test
    public void testDisplayList() {
        testExample("Examples/51_Lambdas/Examples/DisplayList.kt", lambdas.DisplayListKt::main);
    }

    @Test
    public void testDisplayListWithLambda() {
        testExample("Examples/51_Lambdas/Examples/DisplayListWithLambda.kt", lambdas.DisplayListWithLambdaKt::main);
    }

    @Test
    public void testDisplayDuck() {
        testExample("Examples/51_Lambdas/Examples/DisplayDuck.kt", lambdas.DisplayDuckKt::main);
    }

    @Test
    public void testDisplayDuckTestable() {
        testExample("Examples/51_Lambdas/Examples/DisplayDuckTestable.kt", lambdas.DisplayDuckTestableKt::main);
    }

    @Test
    public void testTwoArgAnonymous() {
        testExample("Examples/51_Lambdas/Examples/TwoArgAnonymous.kt", lambdas.TwoArgAnonymousKt::main);
    }

    @Test
    public void testCallLater() {
        testExample("Examples/51_Lambdas/Examples/CallLater.kt", lambdas.CallLaterKt::main);
    }

    @Test
    public void testAssignAnonymous() {
        testExample("Examples/51_Lambdas/Examples/AssignAnonymous.kt", lambdas.AssignAnonymousKt::main);
    }

    @Test
    public void testSimpleMap() {
        testExample("Examples/52_Operations_on_Lists/Examples/SimpleMap.kt", operationsOnLists.SimpleMapKt::main);
    }

    @Test
    public void testSum() {
        testExample("Examples/52_Operations_on_Lists/Examples/Sum.kt", operationsOnLists.SumKt::main);
    }

    @Test
    public void testReduce() {
        testExample("Examples/52_Operations_on_Lists/Examples/Reduce.kt", operationsOnLists.ReduceKt::main);
    }

    @Test
    public void testMoreReduce() {
        testExample("Examples/52_Operations_on_Lists/Examples/MoreReduce.kt", operationsOnLists.MoreReduceKt::main);
    }

    @Test
    public void testZipper() {
        testExample("Examples/53_Combining_Lists_with_zip/Examples/Zipper.kt", combiningListsWithZip.ZipperKt::main);
    }

    @Test
    public void testIndexWithZip() {
        testExample("Examples/53_Combining_Lists_with_zip/Examples/IndexWithZip.kt", combiningListsWithZip.IndexWithZipKt::main);
    }

    @Test
    public void testZipMap() {
        testExample("Examples/53_Combining_Lists_with_zip/Examples/ZipMap.kt", combiningListsWithZip.ZipMapKt::main);
    }

    @Test
    public void testListOf() {
        testExample("Examples/54_Varargs_and_Arrays/Examples/ListOf.kt", varargsAndArrays.ListOfKt::main);
    }

    @Test
    public void testVariableArgLists() {
        testExample("Examples/54_Varargs_and_Arrays/Examples/VariableArgLists.kt", varargsAndArrays.VariableArgListsKt::main);
    }

    @Test
    public void testVarargSum() {
        testExample("Examples/54_Varargs_and_Arrays/Examples/VarargSum.kt", varargsAndArrays.VarargSumKt::main);
    }

    @Test
    public void testSpreadOperator() {
        testExample("Examples/54_Varargs_and_Arrays/Examples/SpreadOperator.kt", varargsAndArrays.SpreadOperatorKt::main);
    }

    @Test
    public void testTwoFunctionsWithVarargs() {
        testExample("Examples/54_Varargs_and_Arrays/Examples/TwoFunctionsWithVarargs.kt", varargsAndArrays.TwoFunctionsWithVarargsKt::main);
    }

    @Test
    public void testGreatApe() {
        testExample("Examples/55_Inheritance/Examples/GreatApe.kt", inheritance.GreatApeKt::main);
    }

    @Test
    public void testGreatApe2() {
        testExample("Examples/56_Base_Class_Initialization/Examples/GreatApe2.kt", baseClassInitialization.GreatApe2Kt::main);
    }

    @Test
    public void testAuxiliaryInitialization() {
        testExample("Examples/56_Base_Class_Initialization/Examples/AuxiliaryInitialization.kt", baseClassInitialization.AuxiliaryInitializationKt::main);
    }

    @Test
    public void testCallingOtherConstructors() {
        testExample("Examples/56_Base_Class_Initialization/Examples/CallingOtherConstructors.kt", baseClassInitialization.CallingOtherConstructorsKt::main);
    }

    @Test
    public void testGreatApe3() {
        testExample("Examples/57_Overriding_Functions/Examples/GreatApe3.kt", overridingFunctions.GreatApe3Kt::main);
    }

    @Test
    public void testAbstractClasses() {
        testExample("Examples/58_Abstract_Classes/Examples/AbstractClasses.kt", abstractClasses.AbstractClassesKt::main);
    }

    @Test
    public void testStateOfAClass() {
        testExample("Examples/59_Interfaces/Examples/StateOfAClass.kt", interfaces.StateOfAClassKt::main);
    }

    @Test
    public void testInterfaceMemberImplementations() {
        testExample("Examples/59_Interfaces/Examples/InterfaceMemberImplementations.kt", interfaces.InterfaceMemberImplementationsKt::main);
    }

    @Test
    public void testFramework() {
        testExample("Examples/59_Interfaces/Examples/Framework.kt", interfaces.FrameworkKt::main);
    }

    @Test
    public void testInterfaceCollision() {
        testExample("Examples/59_Interfaces/Examples/InterfaceCollision.kt", interfaces.InterfaceCollisionKt::main);
    }

    @Test
    public void testLevel() {
        testExample("Examples/63_Enumerations/Examples/Level.kt", enumerations.LevelKt::main);
    }

    @Test
    public void testImportLevel() {
        testExample("Examples/63_Enumerations/Examples/ImportLevel.kt", enumerations.ImportLevelKt::main);
    }

    @Test
    public void testColorBlendTest() {
        testExample("Examples/64_More_About_when_Expressions/Examples/ColorBlendTest.kt", colorblend.ColorBlendTestKt::main);
    }

    @Test
    public void testColorBlendMap() {
        testExample("Examples/64_More_About_when_Expressions/Examples/ColorBlendMap.kt", colorblendmap.ColorBlendMapKt::main);
    }

    @Test
    public void testRegularClasses() {
        testExample("Examples/65_Sealed_Classes/Examples/RegularClasses.kt", regularClasses.RegularClassesKt::main);
    }

    @Test
    public void testSealedClasses() {
        testExample("Examples/65_Sealed_Classes/Examples/SealedClasses.kt", sealedClasses.SealedClassesKt::main);
    }

    @Test
    public void testObjectsAndFunctions() {
        testExample("Examples/67_Companion_Objects/Examples/ObjectsAndFunctions.kt", companionobjects.ObjectsAndFunctionsKt::main);
    }

    @Test
    public void testThisKeyword() {
        testExample("Examples/67_Companion_Objects/Examples/ThisKeyword.kt", companionobjects1.ThisKeywordKt::main);
    }

    @Test
    public void testObjectKeyword() {
        testExample("Examples/67_Companion_Objects/Examples/ObjectKeyword.kt", companionobjects2.ObjectKeywordKt::main);
    }

    @Test
    public void testObjectProperty() {
        testExample("Examples/67_Companion_Objects/Examples/ObjectProperty.kt", companionobjects4.ObjectPropertyKt::main);
    }

    @Test
    public void testObjectFunctions() {
        testExample("Examples/67_Companion_Objects/Examples/ObjectFunctions.kt", companionobjects5.ObjectFunctionsKt::main);
    }

    @Test
    public void testObjCounter() {
        testExample("Examples/67_Companion_Objects/Examples/ObjCounter.kt", companionobjects.ObjCounterKt::main);
    }

    @Test
    public void testDataClassesWithVars() {
        testExample("Examples/79_Data_Classes_and_Immutability/Examples/DataClassesWithVars.kt", dataclasses3.DataClassesWithVarsKt::main);
    }

    @Test
    public void testDataClassAndHashCode() {
        testExample("Examples/79_Data_Classes_and_Immutability/Examples/DataClassAndHashCode.kt", dataclasses4.DataClassAndHashCodeKt::main);
    }
}