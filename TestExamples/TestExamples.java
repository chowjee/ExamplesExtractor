import org.junit.Test;

public class TestExamples extends AbstractTestExamples {

    @Test
    public void testEmptyProgram() {
        testExample("Examples/06_Hello_World/Examples/EmptyProgram.kt", helloworld.EmptyProgramKt::main);
    }

    @Test
    public void testHelloWorld() {
        testExample("Examples/06_Hello_World/Examples/HelloWorld.kt", helloworld.HelloWorldKt::main);
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
        testExample("Examples/08_Data_Types/Examples/StringPlusNumber.kt", datatypes.StringPlusNumberKt::main);
    }

    @Test
    public void testTypes() {
        testExample("Examples/08_Data_Types/Examples/Types.kt", datatypes.TypesKt::main);
    }

    @Test
    public void testInference() {
        testExample("Examples/08_Data_Types/Examples/Inference.kt", datatypes.InferenceKt::main);
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
        testExample("Examples/10_If_Expressions/Examples/If1.kt", ifexpressions.If1Kt::main);
    }

    @Test
    public void testIf2() {
        testExample("Examples/10_If_Expressions/Examples/If2.kt", ifexpressions.If2Kt::main);
    }

    @Test
    public void testIf3() {
        testExample("Examples/10_If_Expressions/Examples/If3.kt", ifexpressions.If3Kt::main);
    }

    @Test
    public void testIf4() {
        testExample("Examples/10_If_Expressions/Examples/If4.kt", ifexpressions.If4Kt::main);
    }

    @Test
    public void testIf5() {
        testExample("Examples/10_If_Expressions/Examples/If5.kt", ifexpressions.If5Kt::main);
    }

    @Test
    public void testIf6() {
        testExample("Examples/10_If_Expressions/Examples/If6.kt", ifexpressions.If6Kt::main);
    }

    @Test
    public void testTrueOrFalse() {
        testExample("Examples/10_If_Expressions/Examples/TrueOrFalse.kt", ifexpressions.TrueOrFalseKt::main);
    }

    @Test
    public void testOneOrTheOther() {
        testExample("Examples/10_If_Expressions/Examples/OneOrTheOther.kt", ifexpressions.OneOrTheOtherKt::main);
    }

    @Test
    public void testStringTemplates() {
        testExample("Examples/11_String_Templates/Examples/StringTemplates.kt", stringtemplates.StringTemplatesKt::main);
    }

    @Test
    public void testStringConcatenation() {
        testExample("Examples/11_String_Templates/Examples/StringConcatenation.kt", stringtemplates.StringConcatenationKt::main);
    }

    @Test
    public void testExpressionInStringTemplate() {
        testExample("Examples/11_String_Templates/Examples/ExpressionInStringTemplate.kt", stringtemplates.ExpressionInStringTemplateKt::main);
    }

    @Test
    public void testTripleQuotes() {
        testExample("Examples/11_String_Templates/Examples/TripleQuotes.kt", stringtemplates.TripleQuotesKt::main);
    }

    @Test
    public void testInferInt() {
        testExample("Examples/12_Number_Types/Examples/InferInt.kt", numbertypes.InferIntKt::main);
    }

    @Test
    public void testModulus() {
        testExample("Examples/12_Number_Types/Examples/Modulus.kt", numbertypes.ModulusKt::main);
    }

    @Test
    public void testIntDivisionTruncates() {
        testExample("Examples/12_Number_Types/Examples/IntDivisionTruncates.kt", numbertypes.IntDivisionTruncatesKt::main);
    }

    @Test
    public void testBMI() {
        testExample("Examples/12_Number_Types/Examples/BMI.kt", numbertypes.BMIKt::main);
    }

    @Test
    public void testIntegerMath() {
        testExample("Examples/12_Number_Types/Examples/IntegerMath.kt", numbertypes.IntegerMathKt::main);
    }

    @Test
    public void testIntegerOverflow() {
        testExample("Examples/12_Number_Types/Examples/IntegerOverflow.kt", numbertypes.IntegerOverflowKt::main);
    }

    @Test
    public void testUsingLongs() {
        testExample("Examples/12_Number_Types/Examples/UsingLongs.kt", numbertypes.UsingLongsKt::main);
    }

    @Test
    public void testBiggestLong() {
        testExample("Examples/12_Number_Types/Examples/BiggestLong.kt", numbertypes.BiggestLongKt::main);
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
        testExample("Examples/14_Repetition_with_while/Examples/WhileLoop.kt", whilerepetition1.WhileLoopKt::main);
    }

    @Test
    public void testDoWhileLoop() {
        testExample("Examples/14_Repetition_with_while/Examples/DoWhileLoop.kt", whilerepetition2.DoWhileLoopKt::main);
    }

    @Test
    public void testRepeatThreeTimes() {
        testExample("Examples/15_For_and_Ranges/Examples/RepeatThreeTimes.kt", forandranges.RepeatThreeTimesKt::main);
    }

    @Test
    public void testDefiningRanges() {
        testExample("Examples/15_For_and_Ranges/Examples/DefiningRanges.kt", forandranges.DefiningRangesKt::main);
    }

    @Test
    public void testSumUsingRange() {
        testExample("Examples/15_For_and_Ranges/Examples/SumUsingRange.kt", forandranges.SumUsingRangeKt::main);
    }

    @Test
    public void testForWithRanges() {
        testExample("Examples/15_For_and_Ranges/Examples/ForWithRanges.kt", forandranges.ForWithRangesKt::main);
    }

    @Test
    public void testCharRange() {
        testExample("Examples/15_For_and_Ranges/Examples/CharRange.kt", forandranges.CharRangeKt::main);
    }

    @Test
    public void testIndexIntoString() {
        testExample("Examples/15_For_and_Ranges/Examples/IndexIntoString.kt", forandranges.IndexIntoStringKt::main);
    }

    @Test
    public void testAddingIntToChar() {
        testExample("Examples/15_For_and_Ranges/Examples/AddingIntToChar.kt", forandranges.AddingIntToCharKt::main);
    }

    @Test
    public void testIterateOverString() {
        testExample("Examples/15_For_and_Ranges/Examples/IterateOverString.kt", forandranges.IterateOverStringKt::main);
    }

    @Test
    public void testContainsChar() {
        testExample("Examples/15_For_and_Ranges/Examples/ContainsChar.kt", forandranges.ContainsCharKt::main);
    }

    @Test
    public void testRangeMembership() {
        testExample("Examples/16_More_About_Ranges/Examples/RangeMembership.kt", moreaboutranges.RangeMembershipKt::main);
    }

    @Test
    public void testInString() {
        testExample("Examples/16_More_About_Ranges/Examples/InString.kt", moreaboutranges.InStringKt::main);
    }

    @Test
    public void testCharRange1() {
        testExample("Examples/16_More_About_Ranges/Examples/CharRange.kt", moreaboutranges.CharRangeKt::main);
    }

    @Test
    public void testFloatingPointRange() {
        testExample("Examples/16_More_About_Ranges/Examples/FloatingPointRange.kt", moreaboutranges.FloatingPointRangeKt::main);
    }

    @Test
    public void testStringRange() {
        testExample("Examples/16_More_About_Ranges/Examples/StringRange.kt", moreaboutranges.StringRangeKt::main);
    }

    @Test
    public void testForLoopIsAStatement() {
        testExample("Examples/17_Expressions_and_Statements/Examples/ForLoopIsAStatement.kt", expressionsandstatements.ForLoopIsAStatementKt::main);
    }

    @Test
    public void testUnitReturnType() {
        testExample("Examples/17_Expressions_and_Statements/Examples/UnitReturnType.kt", expressionsandstatements.UnitReturnTypeKt::main);
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
        testExample("Examples/19_Classes_and_Objects/Examples/IntRanges.kt", classesandobjects.IntRangesKt::main);
    }

    @Test
    public void testRangeSum() {
        testExample("Examples/19_Classes_and_Objects/Examples/RangeSum.kt", classesandobjects.RangeSumKt::main);
    }

    @Test
    public void testAnimals() {
        testExample("Examples/20_Creating_Classes/Examples/Animals.kt", creatingclasses.AnimalsKt::main);
    }

    @Test
    public void testCat() {
        testExample("Examples/22_Methods_In_Classes/Examples/Cat.kt", methodsinclasses.CatKt::main);
    }

    @Test
    public void testHamster() {
        testExample("Examples/22_Methods_In_Classes/Examples/Hamster.kt", methodsinclasses.HamsterKt::main);
    }

    @Test
    public void testImportClass() {
        testExample("Examples/23_Imports_and_Packages/Examples/ImportClass.kt", importsandpackages.ImportClassKt::main);
    }

    @Test
    public void testImportMultiple() {
        testExample("Examples/23_Imports_and_Packages/Examples/ImportMultiple.kt", importsandpackages.ImportMultipleKt::main);
    }

    @Test
    public void testImportEverything() {
        testExample("Examples/23_Imports_and_Packages/Examples/ImportEverything.kt", importsandpackages.ImportEverythingKt::main);
    }

    @Test
    public void testFullyQualify() {
        testExample("Examples/23_Imports_and_Packages/Examples/FullyQualify.kt", importsandpackages.FullyQualifyKt::main);
    }

    @Test
    public void testImportPythagorean() {
        testExample("Examples/23_Imports_and_Packages/Examples/ImportPythagorean.kt", importsandpackages.ImportPythagoreanKt::main);
    }

    @Test
    public void testTestingExample() {
        testExample("Examples/24_Testing/Examples/TestingExample.kt", testing.TestingExampleKt::main);
    }

    @Test
    public void testTDDFail() {
        testExample("Examples/24_Testing/Examples/TDDFail.kt", testing.TDDFailKt::main);
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
    public void testLists() {
        testExample("Examples/26_Lists/Examples/Lists.kt", lists.ListsKt::main);
    }

    @Test
    public void testUseALibrary() {
        testExample("Examples/27_Summary_2/Examples/UseALibrary.kt", summary2.UseALibraryKt::main);
    }

    @Test
    public void testUsingAtomicTest() {
        testExample("Examples/27_Summary_2/Examples/UsingAtomicTest.kt", summary2.UsingAtomicTestKt::main);
    }

    @Test
    public void testListCollection() {
        testExample("Examples/27_Summary_2/Examples/ListCollection.kt", summary2.ListCollectionKt::main);
    }

    @Test
    public void testClassBodies() {
        testExample("Examples/27_Summary_2/Examples/ClassBodies.kt", summary2.ClassBodiesKt::main);
    }

    @Test
    public void testTemperature() {
        testExample("Examples/27_Summary_2/Examples/Temperature.kt", summary2.TemperatureKt::main);
    }

    @Test
    public void testTicTacToe() {
        testExample("Examples/27_Summary_2/Examples/TicTacToe.kt", summary2.TicTacToeKt::main);
    }

    @Test
    public void testWhenExpressions() {
        testExample("Examples/28_When_Expressions/Examples/WhenExpressions.kt", whenexpressions.WhenExpressionsKt::main);
    }

    @Test
    public void testWhenExpressionAndSmartCasts() {
        testExample("Examples/29_When_Expressions_and_Smart_Casts/Examples/WhenExpressionAndSmartCasts.kt", whenexpressionscasts.WhenExpressionAndSmartCastsKt::main);
    }

    @Test
    public void testNamedArguments() {
        testExample("Examples/30_Named_and_Default_Arguments/Examples/NamedArguments.kt", namedanddefault.NamedArgumentsKt::main);
    }

    @Test
    public void testNamedArgumentsOrder() {
        testExample("Examples/30_Named_and_Default_Arguments/Examples/NamedArgumentsOrder.kt", namedanddefault.NamedArgumentsOrderKt::main);
    }

    @Test
    public void testNamedAndDefaultArgs() {
        testExample("Examples/30_Named_and_Default_Arguments/Examples/NamedAndDefaultArgs.kt", namedanddefault1.NamedAndDefaultArgsKt::main);
    }

    @Test
    public void testOverloading() {
        testExample("Examples/31_Overloading/Examples/Overloading.kt", overloading.OverloadingKt::main);
    }

    @Test
    public void testOverloadingAdd() {
        testExample("Examples/31_Overloading/Examples/OverloadingAdd.kt", overloading.OverloadingAddKt::main);
    }

    @Test
    public void testClassArg() {
        testExample("Examples/32_Class_Arguments/Examples/ClassArg.kt", classarguments.ClassArgKt::main);
    }

    @Test
    public void testVisibleClassArgs() {
        testExample("Examples/32_Class_Arguments/Examples/VisibleClassArgs.kt", classarguments.VisibleClassArgsKt::main);
    }

    @Test
    public void testMultipleClassArgs() {
        testExample("Examples/32_Class_Arguments/Examples/MultipleClassArgs.kt", classarguments.MultipleClassArgsKt::main);
    }

    @Test
    public void testInitSection() {
        testExample("Examples/33_Constructors/Examples/InitSection.kt", constructors.InitSectionKt::main);
    }

    @Test
    public void testCoffee() {
        testExample("Examples/33_Constructors/Examples/Coffee.kt", constructors.CoffeeKt::main);
    }

    @Test
    public void testGardenGnome() {
        testExample("Examples/34_Secondary_Constructors/Examples/GardenGnome.kt", secondaryconstructors.GardenGnomeKt::main);
    }

    @Test
    public void testDataClasses() {
        testExample("Examples/35_Data_Classes/Examples/DataClasses.kt", dataclasses.DataClassesKt::main);
    }

    @Test
    public void testBicycle() {
        testExample("Examples/36_Automatic_String_Conversion/Examples/Bicycle.kt", automaticstring.BicycleKt::main);
    }

    @Test
    public void testSurrey() {
        testExample("Examples/36_Automatic_String_Conversion/Examples/Surrey.kt", automaticstring.SurreyKt::main);
    }

    @Test
    public void testSurreyWithToString() {
        testExample("Examples/36_Automatic_String_Conversion/Examples/SurreyWithToString.kt", automaticstring.SurreyWithToStringKt::main);
    }

    @Test
    public void testParameterizedTypes() {
        testExample("Examples/39_Parameterized_Types/Examples/ParameterizedTypes.kt", parameterizedtypes.ParameterizedTypesKt::main);
    }

    @Test
    public void testParameterizedReturnTypes() {
        testExample("Examples/39_Parameterized_Types/Examples/ParameterizedReturnTypes.kt", parameterizedtypes.ParameterizedReturnTypesKt::main);
    }

    @Test
    public void testDisplayList() {
        testExample("Examples/44_Lambdas/Examples/DisplayList.kt", lambdas.DisplayListKt::main);
    }

    @Test
    public void testDisplayListWithLambda() {
        testExample("Examples/44_Lambdas/Examples/DisplayListWithLambda.kt", lambdas.DisplayListWithLambdaKt::main);
    }

    @Test
    public void testDisplayDuck() {
        testExample("Examples/44_Lambdas/Examples/DisplayDuck.kt", lambdas.DisplayDuckKt::main);
    }

    @Test
    public void testDisplayDuckTestable() {
        testExample("Examples/44_Lambdas/Examples/DisplayDuckTestable.kt", lambdas.DisplayDuckTestableKt::main);
    }

    @Test
    public void testTwoArgAnonymous() {
        testExample("Examples/44_Lambdas/Examples/TwoArgAnonymous.kt", lambdas.TwoArgAnonymousKt::main);
    }

    @Test
    public void testCallLater() {
        testExample("Examples/44_Lambdas/Examples/CallLater.kt", lambdas.CallLaterKt::main);
    }

    @Test
    public void testAssignAnonymous() {
        testExample("Examples/44_Lambdas/Examples/AssignAnonymous.kt", lambdas.AssignAnonymousKt::main);
    }

    @Test
    public void testSimpleMap() {
        testExample("Examples/45_Operations_on_Lists/Examples/SimpleMap.kt", mapandreduce.SimpleMapKt::main);
    }

    @Test
    public void testSum() {
        testExample("Examples/45_Operations_on_Lists/Examples/Sum.kt", mapandreduce.SumKt::main);
    }

    @Test
    public void testReduce() {
        testExample("Examples/45_Operations_on_Lists/Examples/Reduce.kt", mapandreduce.ReduceKt::main);
    }

    @Test
    public void testMoreReduce() {
        testExample("Examples/45_Operations_on_Lists/Examples/MoreReduce.kt", mapandreduce.MoreReduceKt::main);
    }

    @Test
    public void testZipper() {
        testExample("Examples/46_Combining_Lists_with_zip/Examples/Zipper.kt", combininglists.ZipperKt::main);
    }

    @Test
    public void testIndexWithZip() {
        testExample("Examples/46_Combining_Lists_with_zip/Examples/IndexWithZip.kt", combininglists.IndexWithZipKt::main);
    }

    @Test
    public void testZipMap() {
        testExample("Examples/46_Combining_Lists_with_zip/Examples/ZipMap.kt", combininglists.ZipMapKt::main);
    }

    @Test
    public void testSets() {
        testExample("Examples/47_Sets/Examples/Sets.kt", sets.SetsKt::main);
    }

    @Test
    public void testRemoveDuplicates() {
        testExample("Examples/47_Sets/Examples/RemoveDuplicates.kt", sets.RemoveDuplicatesKt::main);
    }

    @Test
    public void testMaps() {
        testExample("Examples/48_Maps/Examples/Maps.kt", maps.MapsKt::main);
    }

    @Test
    public void testPetMap() {
        testExample("Examples/48_Maps/Examples/PetMap.kt", maps.PetMapKt::main);
    }

    @Test
    public void testListOf() {
        testExample("Examples/49_Varargs_and_Arrays/Examples/ListOf.kt", varargs.ListOfKt::main);
    }

    @Test
    public void testVariableArgLists() {
        testExample("Examples/49_Varargs_and_Arrays/Examples/VariableArgLists.kt", varargs.VariableArgListsKt::main);
    }

    @Test
    public void testVarargSum() {
        testExample("Examples/49_Varargs_and_Arrays/Examples/VarargSum.kt", varargs.VarargSumKt::main);
    }

    @Test
    public void testSpreadOperator() {
        testExample("Examples/49_Varargs_and_Arrays/Examples/SpreadOperator.kt", varargs.SpreadOperatorKt::main);
    }

    @Test
    public void testTwoFunctionsWithVarargs() {
        testExample("Examples/49_Varargs_and_Arrays/Examples/TwoFunctionsWithVarargs.kt", varargs.TwoFunctionsWithVarargsKt::main);
    }

    @Test
    public void testChangingAVal() {
        testExample("Examples/50_References_and_Mutability/Examples/ChangingAVal.kt", referencesmutability.ChangingAValKt::main);
    }

    @Test
    public void testAnUnchangingVar() {
        testExample("Examples/50_References_and_Mutability/Examples/AnUnchangingVar.kt", referencesmutability.AnUnchangingVarKt::main);
    }

    @Test
    public void testReferences() {
        testExample("Examples/50_References_and_Mutability/Examples/References.kt", referencesmutability.ReferencesKt::main);
    }

    @Test
    public void testImmutableMaps() {
        testExample("Examples/50_References_and_Mutability/Examples/ImmutableMaps.kt", referencesmutability.ImmutableMapsKt::main);
    }

    @Test
    public void testMutableMaps() {
        testExample("Examples/50_References_and_Mutability/Examples/MutableMaps.kt", referencesmutability.MutableMapsKt::main);
    }

    @Test
    public void testGreatApe() {
        testExample("Examples/51_Inheritance/Examples/GreatApe.kt", inheritance.GreatApeKt::main);
    }

    @Test
    public void testGreatApe2() {
        testExample("Examples/52_Base_Class_Initialization/Examples/GreatApe2.kt", baseclassinit.GreatApe2Kt::main);
    }

    @Test
    public void testAuxiliaryInitialization() {
        testExample("Examples/52_Base_Class_Initialization/Examples/AuxiliaryInitialization.kt", baseclassinit.AuxiliaryInitializationKt::main);
    }

    @Test
    public void testGreatApe3() {
        testExample("Examples/53_Overriding_Methods/Examples/GreatApe3.kt", overridingmethods.GreatApe3Kt::main);
    }

    @Test
    public void testAbstractClasses() {
        testExample("Examples/55_Abstract_Classes/Examples/AbstractClasses.kt", abstractclasses.AbstractClassesKt::main);
    }

    @Test
    public void testLevel() {
        testExample("Examples/57_Enumerations/Examples/Level.kt", enumerations.LevelKt::main);
    }

    @Test
    public void testColorBlendTest() {
        testExample("Examples/58_More_About_When_Expressions/Examples/ColorBlendTest.kt", colorblend.ColorBlendTestKt::main);
    }

    @Test
    public void testColorBlendMap() {
        testExample("Examples/58_More_About_When_Expressions/Examples/ColorBlendMap.kt", colorblendmap.ColorBlendMapKt::main);
    }

    @Test
    public void testWhenExpressionAndDataClasses() {
        testExample("Examples/59_Sealed_Classes/Examples/WhenExpressionAndDataClasses.kt", whenexpressionsdata.WhenExpressionAndDataClassesKt::main);
    }

    @Test
    public void testObjectsAndMethods() {
        testExample("Examples/61_Companion_Objects/Examples/ObjectsAndMethods.kt", companionobjects.ObjectsAndMethodsKt::main);
    }

    @Test
    public void testThisKeyword() {
        testExample("Examples/61_Companion_Objects/Examples/ThisKeyword.kt", companionobjects1.ThisKeywordKt::main);
    }

    @Test
    public void testObjectKeyword() {
        testExample("Examples/61_Companion_Objects/Examples/ObjectKeyword.kt", companionobjects2.ObjectKeywordKt::main);
    }

    @Test
    public void testObjectProperty() {
        testExample("Examples/61_Companion_Objects/Examples/ObjectProperty.kt", companionobjects4.ObjectPropertyKt::main);
    }

    @Test
    public void testObjectMethods() {
        testExample("Examples/61_Companion_Objects/Examples/ObjectMethods.kt", companionobjects5.ObjectMethodsKt::main);
    }

    @Test
    public void testObjCounter() {
        testExample("Examples/61_Companion_Objects/Examples/ObjCounter.kt", companionobjects.ObjCounterKt::main);
    }
}