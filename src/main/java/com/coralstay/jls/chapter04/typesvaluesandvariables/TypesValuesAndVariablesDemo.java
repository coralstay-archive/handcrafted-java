package com.coralstay.jls.chapter04.typesvaluesandvariables;

/**
 * Chapter 4: Types, Values, and Variables — 독립 실행 가능한 데모 진입점.
 *
 * <p>이 장의 절(section)마다 private static 메서드를 하나씩 두고, {@code main}에서
 * 순서대로 호출한다. 절을 공부할 때마다 해당 메서드 안을 직접 실습 코드로 채운다.
 * JLS 본문이 번호를 매긴 "Example X.Y-N"이 있는 절은 메서드 Javadoc에 그 번호를
 * 적어뒀다 — 그 예제를 그대로 타이핑해서 재현하면 된다. 번호가 없는 절은 본문
 * 설명만 있고 스펙이 별도로 박아둔 예제 코드는 없다는 뜻이다. 다른 장과
 * 무관하게 단독 실행 가능: {@code java --enable-preview -cp build/classes/java/main
 * com.coralstay.jls.chapter04.typesvaluesandvariables.TypesValuesAndVariablesDemo}
 */
public final class TypesValuesAndVariablesDemo {

    private TypesValuesAndVariablesDemo() {
    }

    public static void main(String[] args) {
        System.out.println("=== Chapter 4: Types, Values, and Variables ===");
        theKindsOfTypesAndValues();
        primitiveTypesAndValues();
        referenceTypesAndValues();
        typeVariables();
        parameterizedTypes();
        typeErasure();
        reifiableTypes();
        rawTypes();
        intersectionTypes();
        subtyping();
        whereTypesAreUsed();
        variables();
    }

    /** JLS §4.1 The Kinds of Types and Values — 공식 Example 번호 없음. */
    private static void theKindsOfTypesAndValues() {
        // TODO: 4.1 The Kinds of Types and Values 내용 실습 코드 작성
        System.out.println("  §4.1 The Kinds of Types and Values - TODO");
    }

    /** JLS §4.2 Primitive Types and Values — JLS Example 4.2.2-1, 4.2.4-1. */
    private static void primitiveTypesAndValues() {
        // TODO: 4.2 Primitive Types and Values 내용 실습 코드 작성
        System.out.println("  §4.2 Primitive Types and Values - TODO");
    }

    /** JLS §4.3 Reference Types and Values — JLS Example 4.3.1-1, 4.3.1-2. */
    private static void referenceTypesAndValues() {
        // TODO: 4.3 Reference Types and Values 내용 실습 코드 작성
        System.out.println("  §4.3 Reference Types and Values - TODO");
    }

    /** JLS §4.4 Type Variables — JLS Example 4.4-1. */
    private static void typeVariables() {
        // TODO: 4.4 Type Variables 내용 실습 코드 작성
        System.out.println("  §4.4 Type Variables - TODO");
    }

    /** JLS §4.5 Parameterized Types — JLS Example 4.5.1-1, 4.5.1-2. */
    private static void parameterizedTypes() {
        // TODO: 4.5 Parameterized Types 내용 실습 코드 작성
        System.out.println("  §4.5 Parameterized Types - TODO");
    }

    /** JLS §4.6 Type Erasure — 공식 Example 번호 없음. */
    private static void typeErasure() {
        // TODO: 4.6 Type Erasure 내용 실습 코드 작성
        System.out.println("  §4.6 Type Erasure - TODO");
    }

    /** JLS §4.7 Reifiable Types — 공식 Example 번호 없음. */
    private static void reifiableTypes() {
        // TODO: 4.7 Reifiable Types 내용 실습 코드 작성
        System.out.println("  §4.7 Reifiable Types - TODO");
    }

    /** JLS §4.8 Raw Types — JLS Example 4.8-1, 4.8-2. */
    private static void rawTypes() {
        // TODO: 4.8 Raw Types 내용 실습 코드 작성
        System.out.println("  §4.8 Raw Types - TODO");
    }

    /** JLS §4.9 Intersection Types — 공식 Example 번호 없음. */
    private static void intersectionTypes() {
        // TODO: 4.9 Intersection Types 내용 실습 코드 작성
        System.out.println("  §4.9 Intersection Types - TODO");
    }

    /** JLS §4.10 Subtyping — 공식 Example 번호 없음. */
    private static void subtyping() {
        // TODO: 4.10 Subtyping 내용 실습 코드 작성
        System.out.println("  §4.10 Subtyping - TODO");
    }

    /** JLS §4.11 Where Types Are Used — JLS Example 4.11-1. */
    private static void whereTypesAreUsed() {
        // TODO: 4.11 Where Types Are Used 내용 실습 코드 작성
        System.out.println("  §4.11 Where Types Are Used - TODO");
    }

    /** JLS §4.12 Variables — JLS Example 4.12.3-1, 4.12.4-1, 4.12.5-1, 4.12.6-1. */
    private static void variables() {
        // TODO: 4.12 Variables 내용 실습 코드 작성
        System.out.println("  §4.12 Variables - TODO");
    }

}
