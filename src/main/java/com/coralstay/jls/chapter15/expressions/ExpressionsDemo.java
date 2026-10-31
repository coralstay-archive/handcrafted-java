package com.coralstay.jls.chapter15.expressions;

/**
 * Chapter 15: Expressions — 독립 실행 가능한 데모 진입점.
 *
 * <p>이 장의 절(section)마다 private static 메서드를 하나씩 두고, {@code main}에서
 * 순서대로 호출한다. 절을 공부할 때마다 해당 메서드 안을 직접 실습 코드로 채운다.
 * JLS 본문이 번호를 매긴 "Example X.Y-N"이 있는 절은 메서드 Javadoc에 그 번호를
 * 적어뒀다 — 그 예제를 그대로 타이핑해서 재현하면 된다. 번호가 없는 절은 본문
 * 설명만 있고 스펙이 별도로 박아둔 예제 코드는 없다는 뜻이다. 다른 장과
 * 무관하게 단독 실행 가능: {@code java --enable-preview -cp build/classes/java/main
 * com.coralstay.jls.chapter15.expressions.ExpressionsDemo}
 */
public final class ExpressionsDemo {

    private ExpressionsDemo() {
    }

    public static void main(String[] args) {
        System.out.println("=== Chapter 15: Expressions ===");
        evaluationDenotationAndResult();
        formsOfExpressions();
        typeOfAnExpression();
        floatingPointExpressions();
        expressionsAndRunTimeChecks();
        normalAndAbruptCompletionOfEvaluation();
        evaluationOrder();
        primaryExpressions();
        classInstanceCreationExpressions();
        arrayCreationAndAccessExpressions();
        fieldAccessExpressions();
        methodInvocationExpressions();
        methodReferenceExpressions();
        postfixExpressions();
        unaryOperators();
        castExpressions();
        multiplicativeOperators();
        additiveOperators();
        shiftOperators();
        relationalOperators();
        equalityOperators();
        bitwiseAndLogicalOperators();
        conditionalAndOperator();
        conditionalOrOperator();
        conditionalOperator();
        assignmentOperators();
        lambdaExpressions();
        switchExpressions();
        constantExpressions();
    }

    /** JLS §15.1 Evaluation, Denotation, and Result — 공식 Example 번호 없음. */
    private static void evaluationDenotationAndResult() {
        // TODO: 15.1 Evaluation, Denotation, and Result 내용 실습 코드 작성
        System.out.println("  §15.1 Evaluation, Denotation, and Result - TODO");
    }

    /** JLS §15.2 Forms of Expressions — 공식 Example 번호 없음. */
    private static void formsOfExpressions() {
        // TODO: 15.2 Forms of Expressions 내용 실습 코드 작성
        System.out.println("  §15.2 Forms of Expressions - TODO");
    }

    /** JLS §15.3 Type of an Expression — 공식 Example 번호 없음. */
    private static void typeOfAnExpression() {
        // TODO: 15.3 Type of an Expression 내용 실습 코드 작성
        System.out.println("  §15.3 Type of an Expression - TODO");
    }

    /** JLS §15.4 Floating-point Expressions — 공식 Example 번호 없음. */
    private static void floatingPointExpressions() {
        // TODO: 15.4 Floating-point Expressions 내용 실습 코드 작성
        System.out.println("  §15.4 Floating-point Expressions - TODO");
    }

    /** JLS §15.5 Expressions and Run-Time Checks — 공식 Example 번호 없음. */
    private static void expressionsAndRunTimeChecks() {
        // TODO: 15.5 Expressions and Run-Time Checks 내용 실습 코드 작성
        System.out.println("  §15.5 Expressions and Run-Time Checks - TODO");
    }

    /** JLS §15.6 Normal and Abrupt Completion of Evaluation — 공식 Example 번호 없음. */
    private static void normalAndAbruptCompletionOfEvaluation() {
        // TODO: 15.6 Normal and Abrupt Completion of Evaluation 내용 실습 코드 작성
        System.out.println("  §15.6 Normal and Abrupt Completion of Evaluation - TODO");
    }

    /** JLS §15.7 Evaluation Order — JLS Example 15.7.1-1, 15.7.1-2, 15.7.1-3, 15.7.2-1, 15.7.4-1, 15.7.4-2. */
    private static void evaluationOrder() {
        // TODO: 15.7 Evaluation Order 내용 실습 코드 작성
        System.out.println("  §15.7 Evaluation Order - TODO");
    }

    /** JLS §15.8 Primary Expressions — JLS Example 15.8.3-1. */
    private static void primaryExpressions() {
        // TODO: 15.8 Primary Expressions 내용 실습 코드 작성
        System.out.println("  §15.8 Primary Expressions - TODO");
    }

    /** JLS §15.9 Class Instance Creation Expressions — JLS Example 15.9.4-1. */
    private static void classInstanceCreationExpressions() {
        // TODO: 15.9 Class Instance Creation Expressions 내용 실습 코드 작성
        System.out.println("  §15.9 Class Instance Creation Expressions - TODO");
    }

    /** JLS §15.10 Array Creation and Access Expressions — JLS Example 15.10.2-1, 15.10.2-2, 15.10.2-3, 15.10.4-1, 15.10.4-2, 15.10.4-3. */
    private static void arrayCreationAndAccessExpressions() {
        // TODO: 15.10 Array Creation and Access Expressions 내용 실습 코드 작성
        System.out.println("  §15.10 Array Creation and Access Expressions - TODO");
    }

    /** JLS §15.11 Field Access Expressions — JLS Example 15.11.1-1, 15.11.1-2, 15.11.2-1. */
    private static void fieldAccessExpressions() {
        // TODO: 15.11 Field Access Expressions 내용 실습 코드 작성
        System.out.println("  §15.11 Field Access Expressions - TODO");
    }

    /** JLS §15.12 Method Invocation Expressions — JLS Example 15.12.2-1, 15.12.2-2, 15.12.2-3, 15.12.4.1-1, 15.12.4.1-2, 15.12.4.4-1, 15.12.4.4-2, 15.12.4.5-1. */
    private static void methodInvocationExpressions() {
        // TODO: 15.12 Method Invocation Expressions 내용 실습 코드 작성
        System.out.println("  §15.12 Method Invocation Expressions - TODO");
    }

    /** JLS §15.13 Method Reference Expressions — 공식 Example 번호 없음. */
    private static void methodReferenceExpressions() {
        // TODO: 15.13 Method Reference Expressions 내용 실습 코드 작성
        System.out.println("  §15.13 Method Reference Expressions - TODO");
    }

    /** JLS §15.14 Postfix Expressions — 공식 Example 번호 없음. */
    private static void postfixExpressions() {
        // TODO: 15.14 Postfix Expressions 내용 실습 코드 작성
        System.out.println("  §15.14 Postfix Expressions - TODO");
    }

    /** JLS §15.15 Unary Operators — 공식 Example 번호 없음. */
    private static void unaryOperators() {
        // TODO: 15.15 Unary Operators 내용 실습 코드 작성
        System.out.println("  §15.15 Unary Operators - TODO");
    }

    /** JLS §15.16 Cast Expressions — 공식 Example 번호 없음. */
    private static void castExpressions() {
        // TODO: 15.16 Cast Expressions 내용 실습 코드 작성
        System.out.println("  §15.16 Cast Expressions - TODO");
    }

    /** JLS §15.17 Multiplicative Operators — JLS Example 15.17.3-1, 15.17.3-2. */
    private static void multiplicativeOperators() {
        // TODO: 15.17 Multiplicative Operators 내용 실습 코드 작성
        System.out.println("  §15.17 Multiplicative Operators - TODO");
    }

    /** JLS §15.18 Additive Operators — JLS Example 15.18.1-1, 15.18.1-2. */
    private static void additiveOperators() {
        // TODO: 15.18 Additive Operators 내용 실습 코드 작성
        System.out.println("  §15.18 Additive Operators - TODO");
    }

    /** JLS §15.19 Shift Operators — 공식 Example 번호 없음. */
    private static void shiftOperators() {
        // TODO: 15.19 Shift Operators 내용 실습 코드 작성
        System.out.println("  §15.19 Shift Operators - TODO");
    }

    /** JLS §15.20 Relational Operators — JLS Example 15.20.2-1. */
    private static void relationalOperators() {
        // TODO: 15.20 Relational Operators 내용 실습 코드 작성
        System.out.println("  §15.20 Relational Operators - TODO");
    }

    /** JLS §15.21 Equality Operators — 공식 Example 번호 없음. */
    private static void equalityOperators() {
        // TODO: 15.21 Equality Operators 내용 실습 코드 작성
        System.out.println("  §15.21 Equality Operators - TODO");
    }

    /** JLS §15.22 Bitwise and Logical Operators — 공식 Example 번호 없음. */
    private static void bitwiseAndLogicalOperators() {
        // TODO: 15.22 Bitwise and Logical Operators 내용 실습 코드 작성
        System.out.println("  §15.22 Bitwise and Logical Operators - TODO");
    }

    /** JLS §15.23 Conditional-And Operator &amp;&amp; — 공식 Example 번호 없음. */
    private static void conditionalAndOperator() {
        // TODO: 15.23 Conditional-And Operator && 내용 실습 코드 작성
        System.out.println("  §15.23 Conditional-And Operator && - TODO");
    }

    /** JLS §15.24 Conditional-Or Operator || — 공식 Example 번호 없음. */
    private static void conditionalOrOperator() {
        // TODO: 15.24 Conditional-Or Operator || 내용 실습 코드 작성
        System.out.println("  §15.24 Conditional-Or Operator || - TODO");
    }

    /** JLS §15.25 Conditional Operator ?: — 공식 Example 번호 없음. */
    private static void conditionalOperator() {
        // TODO: 15.25 Conditional Operator ?: 내용 실습 코드 작성
        System.out.println("  §15.25 Conditional Operator ?: - TODO");
    }

    /** JLS §15.26 Assignment Operators — JLS Example 15.26.1-1, 15.26.2-1, 15.26.2-2. */
    private static void assignmentOperators() {
        // TODO: 15.26 Assignment Operators 내용 실습 코드 작성
        System.out.println("  §15.26 Assignment Operators - TODO");
    }

    /** JLS §15.27 Lambda Expressions — 공식 Example 번호 없음. */
    private static void lambdaExpressions() {
        // TODO: 15.27 Lambda Expressions 내용 실습 코드 작성
        System.out.println("  §15.27 Lambda Expressions - TODO");
    }

    /** JLS §15.28 switch Expressions — 공식 Example 번호 없음. */
    private static void switchExpressions() {
        // TODO: 15.28 switch Expressions 내용 실습 코드 작성
        System.out.println("  §15.28 switch Expressions - TODO");
    }

    /** JLS §15.29 Constant Expressions — JLS Example 15.29-1. */
    private static void constantExpressions() {
        // TODO: 15.29 Constant Expressions 내용 실습 코드 작성
        System.out.println("  §15.29 Constant Expressions - TODO");
    }

}
