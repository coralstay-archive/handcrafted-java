package com.coralstay.jls.chapter13.binarycompatibility;

/**
 * Chapter 13: Binary Compatibility — 독립 실행 가능한 데모 진입점.
 *
 * <p>이 장의 절(section)마다 private static 메서드를 하나씩 두고, {@code main}에서
 * 순서대로 호출한다. 절을 공부할 때마다 해당 메서드 안을 직접 실습 코드로 채운다.
 * JLS 본문이 번호를 매긴 "Example X.Y-N"이 있는 절은 메서드 Javadoc에 그 번호를
 * 적어뒀다 — 그 예제를 그대로 타이핑해서 재현하면 된다. 번호가 없는 절은 본문
 * 설명만 있고 스펙이 별도로 박아둔 예제 코드는 없다는 뜻이다. 다른 장과
 * 무관하게 단독 실행 가능: {@code java --enable-preview -cp build/classes/java/main
 * com.coralstay.jls.chapter13.binarycompatibility.BinaryCompatibilityDemo}
 */
public final class BinaryCompatibilityDemo {

    private BinaryCompatibilityDemo() {
    }

    public static void main(String[] args) {
        System.out.println("=== Chapter 13: Binary Compatibility ===");
        theFormOfABinary();
        whatBinaryCompatibilityIsAndIsNot();
        evolutionOfPackagesAndModules();
        evolutionOfClasses();
        evolutionOfInterfaces();
    }

    /** JLS §13.1 The Form of a Binary — 공식 Example 번호 없음. */
    private static void theFormOfABinary() {
        // TODO: 13.1 The Form of a Binary 내용 실습 코드 작성
        System.out.println("  §13.1 The Form of a Binary - TODO");
    }

    /** JLS §13.2 What Binary Compatibility Is and Is Not — 공식 Example 번호 없음. */
    private static void whatBinaryCompatibilityIsAndIsNot() {
        // TODO: 13.2 What Binary Compatibility Is and Is Not 내용 실습 코드 작성
        System.out.println("  §13.2 What Binary Compatibility Is and Is Not - TODO");
    }

    /** JLS §13.3 Evolution of Packages and Modules — 공식 Example 번호 없음. */
    private static void evolutionOfPackagesAndModules() {
        // TODO: 13.3 Evolution of Packages and Modules 내용 실습 코드 작성
        System.out.println("  §13.3 Evolution of Packages and Modules - TODO");
    }

    /** JLS §13.4 Evolution of Classes — JLS Example 13.4.4-1, 13.4.4-2, 13.4.6-1, 13.4.6-2, 13.4.8-1, 13.4.9-1, 13.4.16-1, 13.4.17-1, 13.4.23-1. */
    private static void evolutionOfClasses() {
        // TODO: 13.4 Evolution of Classes 내용 실습 코드 작성
        System.out.println("  §13.4 Evolution of Classes - TODO");
    }

    /** JLS §13.5 Evolution of Interfaces — JLS Example 13.5.4-1, 13.5.7-1. */
    private static void evolutionOfInterfaces() {
        // TODO: 13.5 Evolution of Interfaces 내용 실습 코드 작성
        System.out.println("  §13.5 Evolution of Interfaces - TODO");
    }

}
