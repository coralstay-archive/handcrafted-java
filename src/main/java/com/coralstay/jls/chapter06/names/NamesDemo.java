package com.coralstay.jls.chapter06.names;

/**
 * Chapter 6: Names — 독립 실행 가능한 데모 진입점.
 *
 * <p>이 장의 절(section)마다 private static 메서드를 하나씩 두고, {@code main}에서
 * 순서대로 호출한다. 절을 공부할 때마다 해당 메서드 안을 직접 실습 코드로 채운다.
 * JLS 본문이 번호를 매긴 "Example X.Y-N"이 있는 절은 메서드 Javadoc에 그 번호를
 * 적어뒀다 — 그 예제를 그대로 타이핑해서 재현하면 된다. 번호가 없는 절은 본문
 * 설명만 있고 스펙이 별도로 박아둔 예제 코드는 없다는 뜻이다. 다른 장과
 * 무관하게 단독 실행 가능: {@code java --enable-preview -cp build/classes/java/main
 * com.coralstay.jls.chapter06.names.NamesDemo}
 */
public final class NamesDemo {

    private NamesDemo() {
    }

    public static void main(String[] args) {
        System.out.println("=== Chapter 6: Names ===");
        declarations();
        namesAndIdentifiers();
        scopeOfADeclaration();
        shadowingAndObscuring();
        determiningTheMeaningOfAName();
        accessControl();
        fullyQualifiedNamesAndCanonicalNames();
    }

    /** JLS §6.1 Declarations — JLS Example 6.1-1, 6.1-2, 6.1-3, 6.1-4. */
    private static void declarations() {
        // TODO: 6.1 Declarations 내용 실습 코드 작성
        System.out.println("  §6.1 Declarations - TODO");
    }

    /** JLS §6.2 Names and Identifiers — 공식 Example 번호 없음. */
    private static void namesAndIdentifiers() {
        // TODO: 6.2 Names and Identifiers 내용 실습 코드 작성
        System.out.println("  §6.2 Names and Identifiers - TODO");
    }

    /** JLS §6.3 Scope of a Declaration — JLS Example 6.3-1, 6.3-2. */
    private static void scopeOfADeclaration() {
        // TODO: 6.3 Scope of a Declaration 내용 실습 코드 작성
        System.out.println("  §6.3 Scope of a Declaration - TODO");
    }

    /** JLS §6.4 Shadowing and Obscuring — JLS Example 6.4-1, 6.4.1-1, 6.4.1-2. */
    private static void shadowingAndObscuring() {
        // TODO: 6.4 Shadowing and Obscuring 내용 실습 코드 작성
        System.out.println("  §6.4 Shadowing and Obscuring - TODO");
    }

    /** JLS §6.5 Determining the Meaning of a Name — JLS Example 6.5.2-1, 6.5.5.1-1, 6.5.5.2-1, 6.5.6.1-1, 6.5.6.1-2, 6.5.6.1-3, 6.5.6.2-1, 6.5.6.2-2, 6.5.7.1-1. */
    private static void determiningTheMeaningOfAName() {
        // TODO: 6.5 Determining the Meaning of a Name 내용 실습 코드 작성
        System.out.println("  §6.5 Determining the Meaning of a Name - TODO");
    }

    /** JLS §6.6 Access Control — JLS Example 6.6-1, 6.6-2, 6.6-3, 6.6-4, 6.6-5, 6.6.2-1. */
    private static void accessControl() {
        // TODO: 6.6 Access Control 내용 실습 코드 작성
        System.out.println("  §6.6 Access Control - TODO");
    }

    /** JLS §6.7 Fully Qualified Names and Canonical Names — JLS Example 6.7-1, 6.7-2. */
    private static void fullyQualifiedNamesAndCanonicalNames() {
        // TODO: 6.7 Fully Qualified Names and Canonical Names 내용 실습 코드 작성
        System.out.println("  §6.7 Fully Qualified Names and Canonical Names - TODO");
    }

}
