package com.coralstay.jls.chapter08.classes;

/**
 * Chapter 8: Classes — 독립 실행 가능한 데모 진입점.
 *
 * <p>이 장의 절(section)마다 private static 메서드를 하나씩 두고, {@code main}에서
 * 순서대로 호출한다. 절을 공부할 때마다 해당 메서드 안을 직접 실습 코드로 채운다.
 * JLS 본문이 번호를 매긴 "Example X.Y-N"이 있는 절은 메서드 Javadoc에 그 번호를
 * 적어뒀다 — 그 예제를 그대로 타이핑해서 재현하면 된다. 번호가 없는 절은 본문
 * 설명만 있고 스펙이 별도로 박아둔 예제 코드는 없다는 뜻이다. 다른 장과
 * 무관하게 단독 실행 가능: {@code java --enable-preview -cp build/classes/java/main
 * com.coralstay.jls.chapter08.classes.ClassesDemo}
 */
public final class ClassesDemo {

    private ClassesDemo() {
    }

    public static void main(String[] args) {
        System.out.println("=== Chapter 8: Classes ===");
        classDeclarations();
        classMembers();
        fieldDeclarations();
        methodDeclarations();
        memberClassAndInterfaceDeclarations();
        instanceInitializers();
        staticInitializers();
        constructorDeclarations();
        enumClasses();
        recordClasses();
    }

    /** JLS §8.1 Class Declarations — JLS Example 8.1.1.1-1, 8.1.1.1-2, 8.1.2-1, 8.1.2-2, 8.1.3-1, 8.1.3-2, 8.1.4-1, 8.1.4-2, 8.1.4-3, 8.1.5-1, 8.1.5-2, 8.1.5-3, 8.1.5-4. */
    private static void classDeclarations() {
        // TODO: 8.1 Class Declarations 내용 실습 코드 작성
        System.out.println("  §8.1 Class Declarations - TODO");
    }

    /** JLS §8.2 Class Members — JLS Example 8.2-1, 8.2-2, 8.2-3, 8.2-4, 8.2-5. */
    private static void classMembers() {
        // TODO: 8.2 Class Members 내용 실습 코드 작성
        System.out.println("  §8.2 Class Members - TODO");
    }

    /** JLS §8.3 Field Declarations — JLS Example 8.3-1, 8.3-2, 8.3.1.1-1, 8.3.1.1-2, 8.3.1.1-3, 8.3.1.3-1, 8.3.1.4-1, 8.3.2-1, 8.3.2-2, 8.3.3-1. */
    private static void fieldDeclarations() {
        // TODO: 8.3 Field Declarations 내용 실습 코드 작성
        System.out.println("  §8.3 Field Declarations - TODO");
    }

    /** JLS §8.4 Method Declarations — JLS Example 8.4.2-1, 8.4.3.1-1, 8.4.3.1-2, 8.4.3.6-1, 8.4.3.6-2, 8.4.6-1, 8.4.8-1, 8.4.8.1-1, 8.4.8.1-2, 8.4.8.2-1, 8.4.8.3-1, 8.4.8.3-2, 8.4.8.3-3, 8.4.8.3-4, 8.4.8.4-1, 8.4.9-1, 8.4.9-2. */
    private static void methodDeclarations() {
        // TODO: 8.4 Method Declarations 내용 실습 코드 작성
        System.out.println("  §8.4 Method Declarations - TODO");
    }

    /** JLS §8.5 Member Class and Interface Declarations — 공식 Example 번호 없음. */
    private static void memberClassAndInterfaceDeclarations() {
        // TODO: 8.5 Member Class and Interface Declarations 내용 실습 코드 작성
        System.out.println("  §8.5 Member Class and Interface Declarations - TODO");
    }

    /** JLS §8.6 Instance Initializers — 공식 Example 번호 없음. */
    private static void instanceInitializers() {
        // TODO: 8.6 Instance Initializers 내용 실습 코드 작성
        System.out.println("  §8.6 Instance Initializers - TODO");
    }

    /** JLS §8.7 Static Initializers — 공식 Example 번호 없음. */
    private static void staticInitializers() {
        // TODO: 8.7 Static Initializers 내용 실습 코드 작성
        System.out.println("  §8.7 Static Initializers - TODO");
    }

    /** JLS §8.8 Constructor Declarations — JLS Example 8.8-1, 8.8.7-1, 8.8.7.1-1, 8.8.7.1-2, 8.8.9-1, 8.8.9-2, 8.8.10-1. */
    private static void constructorDeclarations() {
        // TODO: 8.8 Constructor Declarations 내용 실습 코드 작성
        System.out.println("  §8.8 Constructor Declarations - TODO");
    }

    /** JLS §8.9 Enum Classes — JLS Example 8.9.2-1, 8.9.2-2, 8.9.3-1, 8.9.3-2, 8.9.3-3, 8.9.3-4. */
    private static void enumClasses() {
        // TODO: 8.9 Enum Classes 내용 실습 코드 작성
        System.out.println("  §8.9 Enum Classes - TODO");
    }

    /** JLS §8.10 Record Classes — 공식 Example 번호 없음. */
    private static void recordClasses() {
        // TODO: 8.10 Record Classes 내용 실습 코드 작성
        System.out.println("  §8.10 Record Classes - TODO");
    }

}
