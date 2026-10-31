package com.coralstay.jls.chapter14.blocksstatementsandpatterns;

/**
 * Chapter 14: Blocks, Statements, and Patterns — 독립 실행 가능한 데모 진입점.
 *
 * <p>이 장의 절(section)마다 private static 메서드를 하나씩 두고, {@code main}에서
 * 순서대로 호출한다. 절을 공부할 때마다 해당 메서드 안을 직접 실습 코드로 채운다.
 * JLS 본문이 번호를 매긴 "Example X.Y-N"이 있는 절은 메서드 Javadoc에 그 번호를
 * 적어뒀다 — 그 예제를 그대로 타이핑해서 재현하면 된다. 번호가 없는 절은 본문
 * 설명만 있고 스펙이 별도로 박아둔 예제 코드는 없다는 뜻이다. 다른 장과
 * 무관하게 단독 실행 가능: {@code java --enable-preview -cp build/classes/java/main
 * com.coralstay.jls.chapter14.blocksstatementsandpatterns.BlocksStatementsAndPatternsDemo}
 */
public final class BlocksStatementsAndPatternsDemo {

    private BlocksStatementsAndPatternsDemo() {
    }

    public static void main(String[] args) {
        System.out.println("=== Chapter 14: Blocks, Statements, and Patterns ===");
        normalAndAbruptCompletionOfStatements();
        blocks();
        localClassAndInterfaceDeclarations();
        localVariableDeclarations();
        statements();
        theEmptyStatement();
        labeledStatements();
        expressionStatements();
        theIfStatement();
        theAssertStatement();
        theSwitchStatement();
        theWhileStatement();
        theDoStatement();
        theForStatement();
        theBreakStatement();
        theContinueStatement();
        theReturnStatement();
        theThrowStatement();
        theSynchronizedStatement();
        theTryStatement();
        theYieldStatement();
        unreachableStatements();
        patterns();
    }

    /** JLS §14.1 Normal and Abrupt Completion of Statements — 공식 Example 번호 없음. */
    private static void normalAndAbruptCompletionOfStatements() {
        // TODO: 14.1 Normal and Abrupt Completion of Statements 내용 실습 코드 작성
        System.out.println("  §14.1 Normal and Abrupt Completion of Statements - TODO");
    }

    /** JLS §14.2 Blocks — 공식 Example 번호 없음. */
    private static void blocks() {
        // TODO: 14.2 Blocks 내용 실습 코드 작성
        System.out.println("  §14.2 Blocks - TODO");
    }

    /** JLS §14.3 Local Class and Interface Declarations — JLS Example 14.3-1. */
    private static void localClassAndInterfaceDeclarations() {
        // TODO: 14.3 Local Class and Interface Declarations 내용 실습 코드 작성
        System.out.println("  §14.3 Local Class and Interface Declarations - TODO");
    }

    /** JLS §14.4 Local Variable Declarations — JLS Example 14.4-1, 14.4.1-1. */
    private static void localVariableDeclarations() {
        // TODO: 14.4 Local Variable Declarations 내용 실습 코드 작성
        System.out.println("  §14.4 Local Variable Declarations - TODO");
    }

    /** JLS §14.5 Statements — 공식 Example 번호 없음. */
    private static void statements() {
        // TODO: 14.5 Statements 내용 실습 코드 작성
        System.out.println("  §14.5 Statements - TODO");
    }

    /** JLS §14.6 The Empty Statement — 공식 Example 번호 없음. */
    private static void theEmptyStatement() {
        // TODO: 14.6 The Empty Statement 내용 실습 코드 작성
        System.out.println("  §14.6 The Empty Statement - TODO");
    }

    /** JLS §14.7 Labeled Statements — JLS Example 14.7-1. */
    private static void labeledStatements() {
        // TODO: 14.7 Labeled Statements 내용 실습 코드 작성
        System.out.println("  §14.7 Labeled Statements - TODO");
    }

    /** JLS §14.8 Expression Statements — 공식 Example 번호 없음. */
    private static void expressionStatements() {
        // TODO: 14.8 Expression Statements 내용 실습 코드 작성
        System.out.println("  §14.8 Expression Statements - TODO");
    }

    /** JLS §14.9 The if Statement — 공식 Example 번호 없음. */
    private static void theIfStatement() {
        // TODO: 14.9 The if Statement 내용 실습 코드 작성
        System.out.println("  §14.9 The if Statement - TODO");
    }

    /** JLS §14.10 The assert Statement — 공식 Example 번호 없음. */
    private static void theAssertStatement() {
        // TODO: 14.10 The assert Statement 내용 실습 코드 작성
        System.out.println("  §14.10 The assert Statement - TODO");
    }

    /** JLS §14.11 The switch Statement — JLS Example 14.11.3-1. */
    private static void theSwitchStatement() {
        // TODO: 14.11 The switch Statement 내용 실습 코드 작성
        System.out.println("  §14.11 The switch Statement - TODO");
    }

    /** JLS §14.12 The while Statement — 공식 Example 번호 없음. */
    private static void theWhileStatement() {
        // TODO: 14.12 The while Statement 내용 실습 코드 작성
        System.out.println("  §14.12 The while Statement - TODO");
    }

    /** JLS §14.13 The do Statement — JLS Example 14.13-1. */
    private static void theDoStatement() {
        // TODO: 14.13 The do Statement 내용 실습 코드 작성
        System.out.println("  §14.13 The do Statement - TODO");
    }

    /** JLS §14.14 The for Statement — JLS Example 14.14-1, 14.14-2. */
    private static void theForStatement() {
        // TODO: 14.14 The for Statement 내용 실습 코드 작성
        System.out.println("  §14.14 The for Statement - TODO");
    }

    /** JLS §14.15 The break Statement — JLS Example 14.15-1. */
    private static void theBreakStatement() {
        // TODO: 14.15 The break Statement 내용 실습 코드 작성
        System.out.println("  §14.15 The break Statement - TODO");
    }

    /** JLS §14.16 The continue Statement — JLS Example 14.16-1. */
    private static void theContinueStatement() {
        // TODO: 14.16 The continue Statement 내용 실습 코드 작성
        System.out.println("  §14.16 The continue Statement - TODO");
    }

    /** JLS §14.17 The return Statement — 공식 Example 번호 없음. */
    private static void theReturnStatement() {
        // TODO: 14.17 The return Statement 내용 실습 코드 작성
        System.out.println("  §14.17 The return Statement - TODO");
    }

    /** JLS §14.18 The throw Statement — 공식 Example 번호 없음. */
    private static void theThrowStatement() {
        // TODO: 14.18 The throw Statement 내용 실습 코드 작성
        System.out.println("  §14.18 The throw Statement - TODO");
    }

    /** JLS §14.19 The synchronized Statement — JLS Example 14.19-1. */
    private static void theSynchronizedStatement() {
        // TODO: 14.19 The synchronized Statement 내용 실습 코드 작성
        System.out.println("  §14.19 The synchronized Statement - TODO");
    }

    /** JLS §14.20 The try statement — JLS Example 14.20.1-1, 14.20.2-1. */
    private static void theTryStatement() {
        // TODO: 14.20 The try statement 내용 실습 코드 작성
        System.out.println("  §14.20 The try statement - TODO");
    }

    /** JLS §14.21 The yield Statement — JLS Example 14.21-1. */
    private static void theYieldStatement() {
        // TODO: 14.21 The yield Statement 내용 실습 코드 작성
        System.out.println("  §14.21 The yield Statement - TODO");
    }

    /** JLS §14.22 Unreachable Statements — JLS Example 14.22-1. */
    private static void unreachableStatements() {
        // TODO: 14.22 Unreachable Statements 내용 실습 코드 작성
        System.out.println("  §14.22 Unreachable Statements - TODO");
    }

    /** JLS §14.30 Patterns — 공식 Example 번호 없음. */
    private static void patterns() {
        // TODO: 14.30 Patterns 내용 실습 코드 작성
        System.out.println("  §14.30 Patterns - TODO");
    }

}
