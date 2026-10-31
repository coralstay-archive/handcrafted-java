package com.coralstay.jls.chapter10.arrays;

/**
 * Chapter 10: Arrays — 독립 실행 가능한 데모 진입점.
 *
 * <p>이 장의 절(section)마다 private static 메서드를 하나씩 두고, {@code main}에서
 * 순서대로 호출한다. 절을 공부할 때마다 해당 메서드 안을 직접 실습 코드로 채운다.
 * JLS 본문이 번호를 매긴 "Example X.Y-N"이 있는 절은 메서드 Javadoc에 그 번호를
 * 적어뒀다 — 그 예제를 그대로 타이핑해서 재현하면 된다. 번호가 없는 절은 본문
 * 설명만 있고 스펙이 별도로 박아둔 예제 코드는 없다는 뜻이다. 다른 장과
 * 무관하게 단독 실행 가능: {@code java --enable-preview -cp build/classes/java/main
 * com.coralstay.jls.chapter10.arrays.ArraysDemo}
 */
public final class ArraysDemo {

    private ArraysDemo() {
    }

    public static void main(String[] args) {
        System.out.println("=== Chapter 10: Arrays ===");
        arrayTypes();
        arrayVariables();
        arrayCreation();
        arrayAccess();
        arrayStoreException();
        arrayInitializers();
        arrayMembers();
        classObjectsForArrays();
        anArrayOfCharactersIsNotAString();
    }

    /** JLS §10.1 Array Types — 공식 Example 번호 없음. */
    private static void arrayTypes() {
        // TODO: 10.1 Array Types 내용 실습 코드 작성
        System.out.println("  §10.1 Array Types - TODO");
    }

    /** JLS §10.2 Array Variables — JLS Example 10.2-1, 10.2-2. */
    private static void arrayVariables() {
        // TODO: 10.2 Array Variables 내용 실습 코드 작성
        System.out.println("  §10.2 Array Variables - TODO");
    }

    /** JLS §10.3 Array Creation — 공식 Example 번호 없음. */
    private static void arrayCreation() {
        // TODO: 10.3 Array Creation 내용 실습 코드 작성
        System.out.println("  §10.3 Array Creation - TODO");
    }

    /** JLS §10.4 Array Access — JLS Example 10.4-1. */
    private static void arrayAccess() {
        // TODO: 10.4 Array Access 내용 실습 코드 작성
        System.out.println("  §10.4 Array Access - TODO");
    }

    /** JLS §10.5 Array Store Exception — JLS Example 10.5-1. */
    private static void arrayStoreException() {
        // TODO: 10.5 Array Store Exception 내용 실습 코드 작성
        System.out.println("  §10.5 Array Store Exception - TODO");
    }

    /** JLS §10.6 Array Initializers — JLS Example 10.6-1. */
    private static void arrayInitializers() {
        // TODO: 10.6 Array Initializers 내용 실습 코드 작성
        System.out.println("  §10.6 Array Initializers - TODO");
    }

    /** JLS §10.7 Array Members — JLS Example 10.7-1, 10.7-2. */
    private static void arrayMembers() {
        // TODO: 10.7 Array Members 내용 실습 코드 작성
        System.out.println("  §10.7 Array Members - TODO");
    }

    /** JLS §10.8 Class Objects for Arrays — JLS Example 10.8-1, 10.8-2. */
    private static void classObjectsForArrays() {
        // TODO: 10.8 Class Objects for Arrays 내용 실습 코드 작성
        System.out.println("  §10.8 Class Objects for Arrays - TODO");
    }

    /** JLS §10.9 An Array of Characters Is Not a String — 공식 Example 번호 없음. */
    private static void anArrayOfCharactersIsNotAString() {
        // TODO: 10.9 An Array of Characters Is Not a String 내용 실습 코드 작성
        System.out.println("  §10.9 An Array of Characters Is Not a String - TODO");
    }

}
