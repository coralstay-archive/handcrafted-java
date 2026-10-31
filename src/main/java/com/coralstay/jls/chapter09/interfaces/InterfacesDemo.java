package com.coralstay.jls.chapter09.interfaces;

/**
 * Chapter 9: Interfaces — 독립 실행 가능한 데모 진입점.
 *
 * <p>이 장의 절(section)마다 private static 메서드를 하나씩 두고, {@code main}에서
 * 순서대로 호출한다. 절을 공부할 때마다 해당 메서드 안을 직접 실습 코드로 채운다.
 * JLS 본문이 번호를 매긴 "Example X.Y-N"이 있는 절은 메서드 Javadoc에 그 번호를
 * 적어뒀다 — 그 예제를 그대로 타이핑해서 재현하면 된다. 번호가 없는 절은 본문
 * 설명만 있고 스펙이 별도로 박아둔 예제 코드는 없다는 뜻이다. 다른 장과
 * 무관하게 단독 실행 가능: {@code java --enable-preview -cp build/classes/java/main
 * com.coralstay.jls.chapter09.interfaces.InterfacesDemo}
 */
public final class InterfacesDemo {

    private InterfacesDemo() {
    }

    public static void main(String[] args) {
        System.out.println("=== Chapter 9: Interfaces ===");
        interfaceDeclarations();
        interfaceMembers();
        fieldConstantDeclarations();
        methodDeclarations();
        memberClassAndInterfaceDeclarations();
        annotationInterfaces();
        annotations();
        functionalInterfaces();
        functionTypes();
    }

    /** JLS §9.1 Interface Declarations — 공식 Example 번호 없음. */
    private static void interfaceDeclarations() {
        // TODO: 9.1 Interface Declarations 내용 실습 코드 작성
        System.out.println("  §9.1 Interface Declarations - TODO");
    }

    /** JLS §9.2 Interface Members — 공식 Example 번호 없음. */
    private static void interfaceMembers() {
        // TODO: 9.2 Interface Members 내용 실습 코드 작성
        System.out.println("  §9.2 Interface Members - TODO");
    }

    /** JLS §9.3 Field (Constant) Declarations — JLS Example 9.3-1, 9.3-2, 9.3.1-1. */
    private static void fieldConstantDeclarations() {
        // TODO: 9.3 Field (Constant) Declarations 내용 실습 코드 작성
        System.out.println("  §9.3 Field (Constant) Declarations - TODO");
    }

    /** JLS §9.4 Method Declarations — JLS Example 9.4.2-1. */
    private static void methodDeclarations() {
        // TODO: 9.4 Method Declarations 내용 실습 코드 작성
        System.out.println("  §9.4 Method Declarations - TODO");
    }

    /** JLS §9.5 Member Class and Interface Declarations — 공식 Example 번호 없음. */
    private static void memberClassAndInterfaceDeclarations() {
        // TODO: 9.5 Member Class and Interface Declarations 내용 실습 코드 작성
        System.out.println("  §9.5 Member Class and Interface Declarations - TODO");
    }

    /** JLS §9.6 Annotation Interfaces — JLS Example 9.6.1-1, 9.6.1-2, 9.6.1-3, 9.6.2-1, 9.6.3-1, 9.6.3-2, 9.6.3-3. */
    private static void annotationInterfaces() {
        // TODO: 9.6 Annotation Interfaces 내용 실습 코드 작성
        System.out.println("  §9.6 Annotation Interfaces - TODO");
    }

    /** JLS §9.7 Annotations — JLS Example 9.7.1-1, 9.7.2-1, 9.7.3-1. */
    private static void annotations() {
        // TODO: 9.7 Annotations 내용 실습 코드 작성
        System.out.println("  §9.7 Annotations - TODO");
    }

    /** JLS §9.8 Functional Interfaces — JLS Example 9.8-1, 9.8-2, 9.8-3. */
    private static void functionalInterfaces() {
        // TODO: 9.8 Functional Interfaces 내용 실습 코드 작성
        System.out.println("  §9.8 Functional Interfaces - TODO");
    }

    /** JLS §9.9 Function Types — JLS Example 9.9-1, 9.9-2. */
    private static void functionTypes() {
        // TODO: 9.9 Function Types 내용 실습 코드 작성
        System.out.println("  §9.9 Function Types - TODO");
    }

}
