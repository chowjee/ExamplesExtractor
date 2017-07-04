import org.junit.Test;

public class TestExamples {
    private final String[] args = new String[] {};

    @Test
    public void testEmptyProgram() {
        helloworld.EmptyProgramKt.main(args);
    }

    @Test
    public void testHelloWorld() {
        helloworld.HelloWorldKt.main(args);
    }

    @Test
    public void testVars() {
        variables.VarsKt.main(args);
    }

    @Test
    public void testMutableVariable() {
        variables.MutableVariableKt.main(args);
    }

    @Test
    public void testVals() {
        variables.ValsKt.main(args);
    }

    @Test
    public void testStringPlusNumber() {
        datatypes.StringPlusNumberKt.main(args);
    }

    @Test
    public void testTypes() {
        datatypes.TypesKt.main(args);
    }

    @Test
    public void testInference() {
        datatypes.InferenceKt.main(args);
    }

    @Test
    public void testMultiplyByTwo() {
        functions.MultiplyByTwoKt.main(args);
    }

    @Test
    public void testSayHello() {
        functions.SayHelloKt.main(args);
    }

    @Test
    public void testMultiplyByThree() {
        functions.MultiplyByThreeKt.main(args);
    }

    @Test
    public void testMultiplyByFour() {
        functions.MultiplyByFourKt.main(args);
    }

    @Test
    public void testIf1() {
        ifexpressions.If1Kt.main(args);
    }

    @Test
    public void testIf2() {
        ifexpressions.If2Kt.main(args);
    }

    @Test
    public void testIf3() {
        ifexpressions.If3Kt.main(args);
    }

    @Test
    public void testIf4() {
        ifexpressions.If4Kt.main(args);
    }

    @Test
    public void testIf5() {
        ifexpressions.If5Kt.main(args);
    }

    @Test
    public void testIf6() {
        ifexpressions.If6Kt.main(args);
    }

    @Test
    public void testTrueOrFalse() {
        ifexpressions.TrueOrFalseKt.main(args);
    }

    @Test
    public void testOneOrTheOther() {
        ifexpressions.OneOrTheOtherKt.main(args);
    }

    @Test
    public void testStringTemplates() {
        stringtemplates.StringTemplatesKt.main(args);
    }

    @Test
    public void testStringConcatenation() {
        stringtemplates.StringConcatenationKt.main(args);
    }

    @Test
    public void testExpressionInStringTemplate() {
        stringtemplates.ExpressionInStringTemplateKt.main(args);
    }

    @Test
    public void testTripleQuotes() {
        stringtemplates.TripleQuotesKt.main(args);
    }

    @Test
    public void testInferInt() {
        numbertypes.InferIntKt.main(args);
    }

    @Test
    public void testModulus() {
        numbertypes.ModulusKt.main(args);
    }

    @Test
    public void testIntDivisionTruncates() {
        numbertypes.IntDivisionTruncatesKt.main(args);
    }

    @Test
    public void testBMI() {
        numbertypes.BMIKt.main(args);
    }

    @Test
    public void testIntegerMath() {
        numbertypes.IntegerMathKt.main(args);
    }

    @Test
    public void testIntegerOverflow() {
        numbertypes.IntegerOverflowKt.main(args);
    }

    @Test
    public void testUsingLongs() {
        numbertypes.UsingLongsKt.main(args);
    }

    @Test
    public void testBiggestLong() {
        numbertypes.BiggestLongKt.main(args);
    }

    @Test
    public void testBooleans1() {
        booleans.Booleans1Kt.main(args);
    }

    @Test
    public void testBooleans2() {
        booleans.Booleans2Kt.main(args);
    }

    @Test
    public void testBooleans3() {
        booleans.Booleans3Kt.main(args);
    }

    @Test
    public void testEvaluationOrder() {
        booleans.EvaluationOrderKt.main(args);
    }

    @Test
    public void testWhileLoop() {
        whilerepetition1.WhileLoopKt.main(args);
    }

    @Test
    public void testDoWhileLoop() {
        whilerepetition2.DoWhileLoopKt.main(args);
    }

    @Test
    public void testDefiningRanges() {
        rangesandfor.DefiningRangesKt.main(args);
    }

    @Test
    public void testRangeMembership() {
        rangesandfor.RangeMembershipKt.main(args);
    }

    @Test
    public void testFloatingPointRange() {
        rangesandfor.FloatingPointRangeKt.main(args);
    }

    @Test
    public void testForWithRanges() {
        rangesandfor.ForWithRangesKt.main(args);
    }

    @Test
    public void testRepeatThreeTimes() {
        rangesandfor.RepeatThreeTimesKt.main(args);
    }

    @Test
    public void testSumUsingRange() {
        rangesandfor.SumUsingRangeKt.main(args);
    }

    @Test
    public void testIndexIntoString() {
        rangesandfor.IndexIntoStringKt.main(args);
    }

    @Test
    public void testAddingIntToChar() {
        rangesandfor.AddingIntToCharKt.main(args);
    }

    @Test
    public void testIterateOverString() {
        rangesandfor.IterateOverStringKt.main(args);
    }

    @Test
    public void testContainsChar() {
        rangesandfor.ContainsCharKt.main(args);
    }

    @Test
    public void testForLoopIsAStatement() {
        expressionsandstatements.ForLoopIsAStatementKt.main(args);
    }

    @Test
    public void testPrintlnReturnsUnit() {
        expressionsandstatements.PrintlnReturnsUnitKt.main(args);
    }

    @Test
    public void testBasicFunctions() {
        summary1.BasicFunctionsKt.main(args);
    }

    @Test
    public void testBooleans() {
        summary1.BooleansKt.main(args);
    }

    @Test
    public void testIfResult() {
        summary1.IfResultKt.main(args);
    }

    @Test
    public void testIfExpression() {
        summary1.IfExpressionKt.main(args);
    }

    @Test
    public void testStringTemplates1() {
        summary1.StringTemplatesKt.main(args);
    }

    @Test
    public void testTripleQuotes1() {
        summary1.TripleQuotesKt.main(args);
    }

    @Test
    public void testNumberTypes() {
        summary1.NumberTypesKt.main(args);
    }

    @Test
    public void testOverflow() {
        summary1.OverflowKt.main(args);
    }

    @Test
    public void testTruncation() {
        summary1.TruncationKt.main(args);
    }

    @Test
    public void testIterateThroughString() {
        summary1.IterateThroughStringKt.main(args);
    }

    @Test
    public void testIntRange() {
        summary1.IntRangeKt.main(args);
    }

    @Test
    public void testRangeMembership1() {
        summary1.RangeMembershipKt.main(args);
    }

    @Test
    public void testIntRanges() {
        classesandobjects.IntRangesKt.main(args);
    }

    @Test
    public void testRangeSum() {
        classesandobjects.RangeSumKt.main(args);
    }

    @Test
    public void testAnimals() {
        creatingclasses.AnimalsKt.main(args);
    }

    @Test
    public void testCat() {
        methodsinclasses.CatKt.main(args);
    }

    @Test
    public void testHamster() {
        methodsinclasses.HamsterKt.main(args);
    }

    @Test
    public void testImportClass() {
        importsandpackages.ImportClassKt.main(args);
    }

    @Test
    public void testImportMultiple() {
        importsandpackages.ImportMultipleKt.main(args);
    }

    @Test
    public void testImportEverything() {
        importsandpackages.ImportEverythingKt.main(args);
    }

    @Test
    public void testFullyQualify() {
        importsandpackages.FullyQualifyKt.main(args);
    }

    @Test
    public void testImportPythagorean() {
        importsandpackages.ImportPythagoreanKt.main(args);
    }

    @Test
    public void testTestingExample() {
        testing.TestingExampleKt.main(args);
    }

    @Test
    public void testTDDFail() {
        testing.TDDFailKt.main(args);
    }

    @Test
    public void testTDDStillFails() {
        testing2.TDDStillFailsKt.main(args);
    }

    @Test
    public void testTDDWorks() {
        testing3.TDDWorksKt.main(args);
    }

    @Test
    public void testCup() {
        properties.CupKt.main(args);
    }

    @Test
    public void testCup2() {
        properties.Cup2Kt.main(args);
    }

    @Test
    public void testLists() {
        lists.ListsKt.main(args);
    }

    @Test
    public void testUseALibrary() {
        summary2.UseALibraryKt.main(args);
    }

    @Test
    public void testUsingAtomicTest() {
        summary2.UsingAtomicTestKt.main(args);
    }

    @Test
    public void testListCollection() {
        summary2.ListCollectionKt.main(args);
    }

    @Test
    public void testClassBodies() {
        summary2.ClassBodiesKt.main(args);
    }

    @Test
    public void testTemperature() {
        summary2.TemperatureKt.main(args);
    }

    @Test
    public void testTicTacToe() {
        summary2.TicTacToeKt.main(args);
    }

    @Test
    public void testWhenExpressions() {
        whenexpressions.WhenExpressionsKt.main(args);
    }

    @Test
    public void testWhenExpressionAndSmartCasts() {
        whenexpressionscasts.WhenExpressionAndSmartCastsKt.main(args);
    }

    @Test
    public void testNamedArguments() {
        namedanddefault.NamedArgumentsKt.main(args);
    }

    @Test
    public void testNamedArgumentsOrder() {
        namedanddefault.NamedArgumentsOrderKt.main(args);
    }

    @Test
    public void testNamedAndDefaultArgs() {
        namedanddefault.NamedAndDefaultArgsKt.main(args);
    }

    @Test
    public void testFamily() {
        namedanddefault.FamilyKt.main(args);
    }

    @Test
    public void testFamily2() {
        namedanddefault.Family2Kt.main(args);
    }

    @Test
    public void testOverloading() {
        overloading.OverloadingKt.main(args);
    }

    @Test
    public void testOverloadingAdd() {
        overloading.OverloadingAddKt.main(args);
    }

    @Test
    public void testClassArg() {
        classarguments.ClassArgKt.main(args);
    }

    @Test
    public void testVisibleClassArgs() {
        classarguments.VisibleClassArgsKt.main(args);
    }

    @Test
    public void testMultipleClassArgs() {
        classarguments.MultipleClassArgsKt.main(args);
    }

    @Test
    public void testVariableClassArgs() {
        classarguments.VariableClassArgsKt.main(args);
    }

    @Test
    public void testCoffee() {
        constructors.CoffeeKt.main(args);
    }

    @Test
    public void testGardenGnome() {
        secondaryconstructors.GardenGnomeKt.main(args);
    }

    @Test
    public void testDataClasses() {
        dataclasses.DataClassesKt.main(args);
    }

    @Test
    public void testBicycle() {
        automaticstring.BicycleKt.main(args);
    }

    @Test
    public void testSurrey() {
        automaticstring.SurreyKt.main(args);
    }

    @Test
    public void testSurreyWithToString() {
        automaticstring.SurreyWithToStringKt.main(args);
    }

    @Test
    public void testParameterizedTypes() {
        parameterizedtypes.ParameterizedTypesKt.main(args);
    }

    @Test
    public void testParameterizedReturnTypes() {
        parameterizedtypes.ParameterizedReturnTypesKt.main(args);
    }

    @Test
    public void testDisplayList() {
        lambdas.DisplayListKt.main(args);
    }

    @Test
    public void testDisplayListWithLambda() {
        lambdas.DisplayListWithLambdaKt.main(args);
    }

    @Test
    public void testDisplayDuck() {
        lambdas.DisplayDuckKt.main(args);
    }

    @Test
    public void testDisplayDuckTestable() {
        lambdas.DisplayDuckTestableKt.main(args);
    }

    @Test
    public void testTwoArgAnonymous() {
        lambdas.TwoArgAnonymousKt.main(args);
    }

    @Test
    public void testCallLater() {
        lambdas.CallLaterKt.main(args);
    }

    @Test
    public void testAssignAnonymous() {
        lambdas.AssignAnonymousKt.main(args);
    }

    @Test
    public void testSimpleMap() {
        mapandreduce.SimpleMapKt.main(args);
    }

    @Test
    public void testSum() {
        mapandreduce.SumKt.main(args);
    }

    @Test
    public void testReduce() {
        mapandreduce.ReduceKt.main(args);
    }

    @Test
    public void testMoreReduce() {
        mapandreduce.MoreReduceKt.main(args);
    }

    @Test
    public void testZipper() {
        combininglists.ZipperKt.main(args);
    }

    @Test
    public void testIndexWithZip() {
        combininglists.IndexWithZipKt.main(args);
    }

    @Test
    public void testZipMap() {
        combininglists.ZipMapKt.main(args);
    }

    @Test
    public void testSets() {
        sets.SetsKt.main(args);
    }

    @Test
    public void testRemoveDuplicates() {
        sets.RemoveDuplicatesKt.main(args);
    }

    @Test
    public void testChangingAVal() {
        referencesmutability.ChangingAValKt.main(args);
    }

    @Test
    public void testAnUnchangingVar() {
        referencesmutability.AnUnchangingVarKt.main(args);
    }

    @Test
    public void testReferences() {
        referencesmutability.ReferencesKt.main(args);
    }

    @Test
    public void testImmutableMaps() {
        referencesmutability.ImmutableMapsKt.main(args);
    }

    @Test
    public void testMutableMaps() {
        referencesmutability.MutableMapsKt.main(args);
    }

    @Test
    public void testGreatApe() {
        inheritance.GreatApeKt.main(args);
    }

    @Test
    public void testGreatApe2() {
        baseclassinit.GreatApe2Kt.main(args);
    }

    @Test
    public void testAuxiliaryInitialization() {
        baseclassinit.AuxiliaryInitializationKt.main(args);
    }

    @Test
    public void testGreatApe3() {
        overridingmethods.GreatApe3Kt.main(args);
    }

    @Test
    public void testAbstractClasses() {
        abstractclasses.AbstractClassesKt.main(args);
    }

    @Test
    public void testLevel() {
        enumerations.LevelKt.main(args);
    }

    @Test
    public void testColorBlendTest() {
        colorblend.ColorBlendTestKt.main(args);
    }

    @Test
    public void testColorBlendMap() {
        colorblendmap.ColorBlendMapKt.main(args);
    }

    @Test
    public void testWhenExpressionAndDataClasses() {
        whenexpressionsdata.WhenExpressionAndDataClassesKt.main(args);
    }

    @Test
    public void testObjectsAndMethods() {
        companionobjects.ObjectsAndMethodsKt.main(args);
    }

    @Test
    public void testThisKeyword() {
        companionobjects1.ThisKeywordKt.main(args);
    }

    @Test
    public void testObjectKeyword() {
        companionobjects2.ObjectKeywordKt.main(args);
    }

    @Test
    public void testObjectProperty() {
        companionobjects4.ObjectPropertyKt.main(args);
    }

    @Test
    public void testObjectMethods() {
        companionobjects5.ObjectMethodsKt.main(args);
    }

    @Test
    public void testObjCounter() {
        companionobjects.ObjCounterKt.main(args);
    }
}