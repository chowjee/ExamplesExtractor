import org.junit.Test;
import helloworld.EmptyProgramKt;
import helloworld.HelloWorldKt;
import variables.VarsKt;
import variables.MutableVariableKt;
import variables.ValsKt;
import datatypes.StringPlusNumberKt;
import datatypes.TypesKt;
import datatypes.InferenceKt;
import functions.MultiplyByTwoKt;
import functions.SayHelloKt;
import functions.MultiplyByThreeKt;
import functions.MultiplyByFourKt;
import ifexpressions.If1Kt;
import ifexpressions.If2Kt;
import ifexpressions.If3Kt;
import ifexpressions.If4Kt;
import ifexpressions.If5Kt;
import ifexpressions.If6Kt;
import ifexpressions.TrueOrFalseKt;
import ifexpressions.OneOrTheOtherKt;
import stringtemplates.StringTemplatesKt;
import stringtemplates.TripleQuotesKt;
import stringtemplates.ExpressionInStringTemplateKt;
import numbertypes.BMIKt;
import numbertypes.IntegerMathKt;
import numbertypes.IntegerOverflowKt;
import numbertypes.ComputingLongsKt;
import booleans.Booleans1Kt;
import booleans.Booleans2Kt;
import booleans.Booleans3Kt;
import booleans.EvaluationOrderKt;
import forandwhile.RepeatThreeTimesKt;
import forandwhile.SimpleSumKt;
import forandwhile.IterateOverString1Kt;
import forandwhile.IterateOverString2Kt;
import forandwhile.IterateOverString3Kt;
import forandwhile.EvalBooleanKt;
import ranges.RangesKt;
import summary1.BasicFunctionsKt;
import summary1.IfExpressionKt;
import summary1.BooleansKt;
import creatingclasses.AnimalsKt;
import methodsinclasses.CatKt;
import methodsinclasses.HamsterKt;
import importsandpackages.ImportClassKt;
import importsandpackages.ImportMultipleKt;
import importsandpackages.ImportEverythingKt;
import importsandpackages.FullyQualifyKt;
import importsandpackages.ImportPythagoreanKt;
import testing.TestingExampleKt;
import testing.TDDFailKt;
import testing2.TDDStillFailsKt;
import testing3.TDDWorksKt;
import properties.CupKt;
import properties.Cup2Kt;
import lists.ListsKt;
import summary2.UseALibraryKt;
import summary2.UsingAtomicTestKt;
import summary2.ListCollectionKt;
import summary2.ClassBodiesKt;
import summary2.TemperatureKt;
import summary2.TicTacToeKt;
import whenexpressions.WhenExpressionsKt;
import classarguments.ClassArgKt;
import classarguments.VisibleClassArgsKt;
import classarguments.MultipleClassArgsKt;
import classarguments.VariableClassArgsKt;
import namedanddefault.NamedArgumentsKt;
import namedanddefault.NamedArgumentsOrderKt;
import namedanddefault.NamedAndDefaultArgsKt;
import namedanddefault.FamilyKt;
import namedanddefault.Family2Kt;
import overloading.OverloadingKt;
import overloading.OverloadingAddKt;
import constructors.CoffeeKt;
import secondaryconstructors.GardenGnomeKt;
import dataclasses.DataClassesKt;
import parameterizedtypes.ParameterizedTypesKt;
import parameterizedtypes.ParameterizedReturnTypesKt;
import lambdas.DisplayListKt;
import lambdas.DisplayListWithLambdaKt;
import lambdas.DisplayDuckKt;
import lambdas.DisplayDuckTestableKt;
import lambdas.TwoArgAnonymousKt;
import lambdas.CallLaterKt;
import lambdas.AssignAnonymousKt;
import mapandreduce.SimpleMapKt;
import mapandreduce.SumKt;
import mapandreduce.ReduceKt;
import mapandreduce.MoreReduceKt;
import whenexpressionscasts.WhenExpressionAndSmartCastsKt;
import whenexpressionsdata.WhenExpressionAndDataClassesKt;
import automaticstring.BicycleKt;
import automaticstring.SurreyKt;
import automaticstring.SurreyWithToStringKt;
import companionobjects.ObjectsAndMethodsKt;
import companionobjects1.ThisKeywordKt;
import companionobjects2.ObjectKeywordKt;
import companionobjects4.ObjectPropertyKt;
import companionobjects5.ObjectMethodsKt;
import companionobjects.ObjCounterKt;
import inheritance.GreatApeKt;
import baseclassinit.GreatApe2Kt;
import baseclassinit.AuxiliaryInitializationKt;
import overridingmethods.GreatApe3Kt;
import enumerations.LevelKt;
import abstractclasses.AbstractClassesKt;
import lists2.ListOperationsKt;
import combininglists.ZipperKt;
import combininglists.IndexWithZipKt;
import combininglists.ZipMapKt;
import sets.SetsKt;
import sets.RemoveDuplicatesKt;
import referencesmutability.ChangingAValKt;
import referencesmutability.AnUnchangingVarKt;
import referencesmutability.ReferencesKt;
import referencesmutability.ImmutableMapsKt;
import referencesmutability.MutableMapsKt;
import colorblend.ColorBlendTestKt;
import colorBlend.ColorBlendMapKt;

public class TestExamples {
    private final String[] args = new String[] {};

    @Test
    public void testEmptyProgram() {
        EmptyProgramKt.main(args);
    }

    @Test
    public void testHelloWorld() {
        HelloWorldKt.main(args);
    }

    @Test
    public void testVars() {
        VarsKt.main(args);
    }

    @Test
    public void testMutableVariable() {
        MutableVariableKt.main(args);
    }

    @Test
    public void testVals() {
        ValsKt.main(args);
    }

    @Test
    public void testStringPlusNumber() {
        StringPlusNumberKt.main(args);
    }

    @Test
    public void testTypes() {
        TypesKt.main(args);
    }

    @Test
    public void testInference() {
        InferenceKt.main(args);
    }

    @Test
    public void testMultiplyByTwo() {
        MultiplyByTwoKt.main(args);
    }

    @Test
    public void testSayHello() {
        SayHelloKt.main(args);
    }

    @Test
    public void testMultiplyByThree() {
        MultiplyByThreeKt.main(args);
    }

    @Test
    public void testMultiplyByFour() {
        MultiplyByFourKt.main(args);
    }

    @Test
    public void testIf1() {
        If1Kt.main(args);
    }

    @Test
    public void testIf2() {
        If2Kt.main(args);
    }

    @Test
    public void testIf3() {
        If3Kt.main(args);
    }

    @Test
    public void testIf4() {
        If4Kt.main(args);
    }

    @Test
    public void testIf5() {
        If5Kt.main(args);
    }

    @Test
    public void testIf6() {
        If6Kt.main(args);
    }

    @Test
    public void testTrueOrFalse() {
        TrueOrFalseKt.main(args);
    }

    @Test
    public void testOneOrTheOther() {
        OneOrTheOtherKt.main(args);
    }

    @Test
    public void testStringTemplates() {
        StringTemplatesKt.main(args);
    }

    @Test
    public void testTripleQuotes() {
        TripleQuotesKt.main(args);
    }

    @Test
    public void testExpressionInStringTemplate() {
        ExpressionInStringTemplateKt.main(args);
    }

    @Test
    public void testBMI() {
        BMIKt.main(args);
    }

    @Test
    public void testIntegerMath() {
        IntegerMathKt.main(args);
    }

    @Test
    public void testIntegerOverflow() {
        IntegerOverflowKt.main(args);
    }

    @Test
    public void testComputingLongs() {
        ComputingLongsKt.main(args);
    }

    @Test
    public void testBooleans1() {
        Booleans1Kt.main(args);
    }

    @Test
    public void testBooleans2() {
        Booleans2Kt.main(args);
    }

    @Test
    public void testBooleans3() {
        Booleans3Kt.main(args);
    }

    @Test
    public void testEvaluationOrder() {
        EvaluationOrderKt.main(args);
    }

    @Test
    public void testRepeatThreeTimes() {
        RepeatThreeTimesKt.main(args);
    }

    @Test
    public void testSimpleSum() {
        SimpleSumKt.main(args);
    }

    @Test
    public void testIterateOverString1() {
        IterateOverString1Kt.main(args);
    }

    @Test
    public void testIterateOverString2() {
        IterateOverString2Kt.main(args);
    }

    @Test
    public void testIterateOverString3() {
        IterateOverString3Kt.main(args);
    }

    @Test
    public void testEvalBoolean() {
        EvalBooleanKt.main(args);
    }

    @Test
    public void testRanges() {
        RangesKt.main(args);
    }

    @Test
    public void testBasicFunctions() {
        BasicFunctionsKt.main(args);
    }

    @Test
    public void testIfExpression() {
        IfExpressionKt.main(args);
    }

    @Test
    public void testBooleans() {
        BooleansKt.main(args);
    }

    @Test
    public void testAnimals() {
        AnimalsKt.main(args);
    }

    @Test
    public void testCat() {
        CatKt.main(args);
    }

    @Test
    public void testHamster() {
        HamsterKt.main(args);
    }

    @Test
    public void testImportClass() {
        ImportClassKt.main(args);
    }

    @Test
    public void testImportMultiple() {
        ImportMultipleKt.main(args);
    }

    @Test
    public void testImportEverything() {
        ImportEverythingKt.main(args);
    }

    @Test
    public void testFullyQualify() {
        FullyQualifyKt.main(args);
    }

    @Test
    public void testImportPythagorean() {
        ImportPythagoreanKt.main(args);
    }

    @Test
    public void testTestingExample() {
        TestingExampleKt.main(args);
    }

    @Test
    public void testTDDFail() {
        TDDFailKt.main(args);
    }

    @Test
    public void testTDDStillFails() {
        TDDStillFailsKt.main(args);
    }

    @Test
    public void testTDDWorks() {
        TDDWorksKt.main(args);
    }

    @Test
    public void testCup() {
        CupKt.main(args);
    }

    @Test
    public void testCup2() {
        Cup2Kt.main(args);
    }

    @Test
    public void testLists() {
        ListsKt.main(args);
    }

    @Test
    public void testUseALibrary() {
        UseALibraryKt.main(args);
    }

    @Test
    public void testUsingAtomicTest() {
        UsingAtomicTestKt.main(args);
    }

    @Test
    public void testListCollection() {
        ListCollectionKt.main(args);
    }

    @Test
    public void testClassBodies() {
        ClassBodiesKt.main(args);
    }

    @Test
    public void testTemperature() {
        TemperatureKt.main(args);
    }

    @Test
    public void testTicTacToe() {
        TicTacToeKt.main(args);
    }

    @Test
    public void testWhenExpressions() {
        WhenExpressionsKt.main(args);
    }

    @Test
    public void testClassArg() {
        ClassArgKt.main(args);
    }

    @Test
    public void testVisibleClassArgs() {
        VisibleClassArgsKt.main(args);
    }

    @Test
    public void testMultipleClassArgs() {
        MultipleClassArgsKt.main(args);
    }

    @Test
    public void testVariableClassArgs() {
        VariableClassArgsKt.main(args);
    }

    @Test
    public void testNamedArguments() {
        NamedArgumentsKt.main(args);
    }

    @Test
    public void testNamedArgumentsOrder() {
        NamedArgumentsOrderKt.main(args);
    }

    @Test
    public void testNamedAndDefaultArgs() {
        NamedAndDefaultArgsKt.main(args);
    }

    @Test
    public void testFamily() {
        FamilyKt.main(args);
    }

    @Test
    public void testFamily2() {
        Family2Kt.main(args);
    }

    @Test
    public void testOverloading() {
        OverloadingKt.main(args);
    }

    @Test
    public void testOverloadingAdd() {
        OverloadingAddKt.main(args);
    }

    @Test
    public void testCoffee() {
        CoffeeKt.main(args);
    }

    @Test
    public void testGardenGnome() {
        GardenGnomeKt.main(args);
    }

    @Test
    public void testDataClasses() {
        DataClassesKt.main(args);
    }

    @Test
    public void testParameterizedTypes() {
        ParameterizedTypesKt.main(args);
    }

    @Test
    public void testParameterizedReturnTypes() {
        ParameterizedReturnTypesKt.main(args);
    }

    @Test
    public void testDisplayList() {
        DisplayListKt.main(args);
    }

    @Test
    public void testDisplayListWithLambda() {
        DisplayListWithLambdaKt.main(args);
    }

    @Test
    public void testDisplayDuck() {
        DisplayDuckKt.main(args);
    }

    @Test
    public void testDisplayDuckTestable() {
        DisplayDuckTestableKt.main(args);
    }

    @Test
    public void testTwoArgAnonymous() {
        TwoArgAnonymousKt.main(args);
    }

    @Test
    public void testCallLater() {
        CallLaterKt.main(args);
    }

    @Test
    public void testAssignAnonymous() {
        AssignAnonymousKt.main(args);
    }

    @Test
    public void testSimpleMap() {
        SimpleMapKt.main(args);
    }

    @Test
    public void testSum() {
        SumKt.main(args);
    }

    @Test
    public void testReduce() {
        ReduceKt.main(args);
    }

    @Test
    public void testMoreReduce() {
        MoreReduceKt.main(args);
    }

    @Test
    public void testWhenExpressionAndSmartCasts() {
        WhenExpressionAndSmartCastsKt.main(args);
    }

    @Test
    public void testWhenExpressionAndDataClasses() {
        WhenExpressionAndDataClassesKt.main(args);
    }

    @Test
    public void testBicycle() {
        BicycleKt.main(args);
    }

    @Test
    public void testSurrey() {
        SurreyKt.main(args);
    }

    @Test
    public void testSurreyWithToString() {
        SurreyWithToStringKt.main(args);
    }

    @Test
    public void testObjectsAndMethods() {
        ObjectsAndMethodsKt.main(args);
    }

    @Test
    public void testThisKeyword() {
        ThisKeywordKt.main(args);
    }

    @Test
    public void testObjectKeyword() {
        ObjectKeywordKt.main(args);
    }

    @Test
    public void testObjectProperty() {
        ObjectPropertyKt.main(args);
    }

    @Test
    public void testObjectMethods() {
        ObjectMethodsKt.main(args);
    }

    @Test
    public void testObjCounter() {
        ObjCounterKt.main(args);
    }

    @Test
    public void testGreatApe() {
        GreatApeKt.main(args);
    }

    @Test
    public void testGreatApe2() {
        GreatApe2Kt.main(args);
    }

    @Test
    public void testAuxiliaryInitialization() {
        AuxiliaryInitializationKt.main(args);
    }

    @Test
    public void testGreatApe3() {
        GreatApe3Kt.main(args);
    }

    @Test
    public void testLevel() {
        LevelKt.main(args);
    }

    @Test
    public void testAbstractClasses() {
        AbstractClassesKt.main(args);
    }

    @Test
    public void testListOperations() {
        ListOperationsKt.main(args);
    }

    @Test
    public void testZipper() {
        ZipperKt.main(args);
    }

    @Test
    public void testIndexWithZip() {
        IndexWithZipKt.main(args);
    }

    @Test
    public void testZipMap() {
        ZipMapKt.main(args);
    }

    @Test
    public void testSets() {
        SetsKt.main(args);
    }

    @Test
    public void testRemoveDuplicates() {
        RemoveDuplicatesKt.main(args);
    }

    @Test
    public void testChangingAVal() {
        ChangingAValKt.main(args);
    }

    @Test
    public void testAnUnchangingVar() {
        AnUnchangingVarKt.main(args);
    }

    @Test
    public void testReferences() {
        ReferencesKt.main(args);
    }

    @Test
    public void testImmutableMaps() {
        ImmutableMapsKt.main(args);
    }

    @Test
    public void testMutableMaps() {
        MutableMapsKt.main(args);
    }

    @Test
    public void testColorBlendTest() {
        ColorBlendTestKt.main(args);
    }

    @Test
    public void testColorBlendMap() {
        ColorBlendMapKt.main(args);
    }
}