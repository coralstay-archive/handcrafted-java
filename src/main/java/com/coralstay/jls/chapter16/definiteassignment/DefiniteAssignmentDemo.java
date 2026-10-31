package com.coralstay.jls.chapter16.definiteassignment;

/**
 * Chapter 16: Definite Assignment — 독립 실행 가능한 데모 진입점.
 *
 * <p>이 장의 절(section)마다 private static 메서드를 하나씩 두고, {@code main}에서
 * 순서대로 호출한다. 절을 공부할 때마다 해당 메서드 안을 직접 실습 코드로 채운다.
 * JLS 본문이 번호를 매긴 "Example X.Y-N"이 있는 절은 메서드 Javadoc에 그 번호를
 * 적어뒀다 — 그 예제를 그대로 타이핑해서 재현하면 된다. 번호가 없는 절은 본문
 * 설명만 있고 스펙이 별도로 박아둔 예제 코드는 없다는 뜻이다. 챕터 서두(첫 절 이전)에 번호 붙은 예제가 있다: 16-1. Definite Assignment Considers Structure of Statements and Expressions; 16-2. Definite Assignment Does Not Consider Values of Expressions; 16-3. Definite Unassignment. 다른 장과
 * 무관하게 단독 실행 가능: {@code java --enable-preview -cp build/classes/java/main
 * com.coralstay.jls.chapter16.definiteassignment.DefiniteAssignmentDemo}
 */
public final class DefiniteAssignmentDemo {

    private DefiniteAssignmentDemo() {
    }

    public static void main(String[] args) {
        System.out.println("=== Chapter 16: Definite Assignment ===");
        definiteAssignmentAndExpressions();
        definiteAssignmentAndStatements();
        definiteAssignmentAndParameters();
        definiteAssignmentAndArrayInitializers();
        definiteAssignmentAndEnumConstants();
        definiteAssignmentAndAnonymousClasses();
        definiteAssignmentAndMemberClassesAndInterfaces();
        definiteAssignmentAndStaticInitializers();
        definiteAssignmentConstructorsAndInstanceInitializers();
    }

    /** JLS §16.1 Definite Assignment and Expressions — 공식 Example 번호 없음. */
    private static void definiteAssignmentAndExpressions() {
        // TODO: 16.1 Definite Assignment and Expressions 내용 실습 코드 작성
        System.out.println("  §16.1 Definite Assignment and Expressions - TODO");
    }

    /** JLS §16.2 Definite Assignment and Statements — 공식 Example 번호 없음. */
    private static void definiteAssignmentAndStatements() {
        // TODO: 16.2 Definite Assignment and Statements 내용 실습 코드 작성
        System.out.println("  §16.2 Definite Assignment and Statements - TODO");
    }

    /** JLS §16.3 Definite Assignment and Parameters — 공식 Example 번호 없음. */
    private static void definiteAssignmentAndParameters() {
        // TODO: 16.3 Definite Assignment and Parameters 내용 실습 코드 작성
        System.out.println("  §16.3 Definite Assignment and Parameters - TODO");
    }

    /** JLS §16.4 Definite Assignment and Array Initializers — 공식 Example 번호 없음. */
    private static void definiteAssignmentAndArrayInitializers() {
        // TODO: 16.4 Definite Assignment and Array Initializers 내용 실습 코드 작성
        System.out.println("  §16.4 Definite Assignment and Array Initializers - TODO");
    }

    /** JLS §16.5 Definite Assignment and Enum Constants — 공식 Example 번호 없음. */
    private static void definiteAssignmentAndEnumConstants() {
        // TODO: 16.5 Definite Assignment and Enum Constants 내용 실습 코드 작성
        System.out.println("  §16.5 Definite Assignment and Enum Constants - TODO");
    }

    /** JLS §16.6 Definite Assignment and Anonymous Classes — 공식 Example 번호 없음. */
    private static void definiteAssignmentAndAnonymousClasses() {
        // TODO: 16.6 Definite Assignment and Anonymous Classes 내용 실습 코드 작성
        System.out.println("  §16.6 Definite Assignment and Anonymous Classes - TODO");
    }

    /** JLS §16.7 Definite Assignment and Member Classes and Interfaces — 공식 Example 번호 없음. */
    private static void definiteAssignmentAndMemberClassesAndInterfaces() {
        // TODO: 16.7 Definite Assignment and Member Classes and Interfaces 내용 실습 코드 작성
        System.out.println("  §16.7 Definite Assignment and Member Classes and Interfaces - TODO");
    }

    /** JLS §16.8 Definite Assignment and Static Initializers — 공식 Example 번호 없음. */
    private static void definiteAssignmentAndStaticInitializers() {
        // TODO: 16.8 Definite Assignment and Static Initializers 내용 실습 코드 작성
        System.out.println("  §16.8 Definite Assignment and Static Initializers - TODO");
    }

    /** JLS §16.9 Definite Assignment, Constructors, and Instance Initializers — 공식 Example 번호 없음. */
    private static void definiteAssignmentConstructorsAndInstanceInitializers() {
        // TODO: 16.9 Definite Assignment, Constructors, and Instance Initializers 내용 실습 코드 작성
        System.out.println("  §16.9 Definite Assignment, Constructors, and Instance Initializers - TODO");
    }

}
