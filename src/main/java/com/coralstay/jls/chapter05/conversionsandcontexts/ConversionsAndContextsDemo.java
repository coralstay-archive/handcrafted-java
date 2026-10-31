package com.coralstay.jls.chapter05.conversionsandcontexts;

/**
 * Chapter 5: Conversions and Contexts — 독립 실행 가능한 데모 진입점.
 *
 * <p>이 장의 절(section)마다 private static 메서드를 하나씩 두고, {@code main}에서
 * 순서대로 호출한다. 절을 공부할 때마다 해당 메서드 안을 직접 실습 코드로 채운다.
 * JLS 본문이 번호를 매긴 "Example X.Y-N"이 있는 절은 메서드 Javadoc에 그 번호를
 * 적어뒀다 — 그 예제를 그대로 타이핑해서 재현하면 된다. 번호가 없는 절은 본문
 * 설명만 있고 스펙이 별도로 박아둔 예제 코드는 없다는 뜻이다. 챕터 서두(첫 절 이전)에 번호 붙은 예제가 있다: 5.0-1. Conversions at Compile Time and Run Time; 5.0-2. Conversions In Various Contexts. 다른 장과
 * 무관하게 단독 실행 가능: {@code java --enable-preview -cp build/classes/java/main
 * com.coralstay.jls.chapter05.conversionsandcontexts.ConversionsAndContextsDemo}
 */
public final class ConversionsAndContextsDemo {

    private ConversionsAndContextsDemo() {
    }

    public static void main(String[] args) {
        System.out.println("=== Chapter 5: Conversions and Contexts ===");
        kindsOfConversion();
        assignmentContexts();
        invocationContexts();
        stringContexts();
        castingContexts();
        numericContexts();
        testingContexts();
    }

    /** JLS §5.1 Kinds of Conversion — JLS Example 5.1.2-1, 5.1.3-1, 5.1.3-2. */
    private static void kindsOfConversion() {
        // TODO: 5.1 Kinds of Conversion 내용 실습 코드 작성
        System.out.println("  §5.1 Kinds of Conversion - TODO");
    }

    /** JLS §5.2 Assignment Contexts — JLS Example 5.2-1, 5.2-2, 5.2-3. */
    private static void assignmentContexts() {
        // TODO: 5.2 Assignment Contexts 내용 실습 코드 작성
        System.out.println("  §5.2 Assignment Contexts - TODO");
    }

    /** JLS §5.3 Invocation Contexts — 공식 Example 번호 없음. */
    private static void invocationContexts() {
        // TODO: 5.3 Invocation Contexts 내용 실습 코드 작성
        System.out.println("  §5.3 Invocation Contexts - TODO");
    }

    /** JLS §5.4 String Contexts — 공식 Example 번호 없음. */
    private static void stringContexts() {
        // TODO: 5.4 String Contexts 내용 실습 코드 작성
        System.out.println("  §5.4 String Contexts - TODO");
    }

    /** JLS §5.5 Casting Contexts — JLS Example 5.5-1, 5.5-2, 5.5-3. */
    private static void castingContexts() {
        // TODO: 5.5 Casting Contexts 내용 실습 코드 작성
        System.out.println("  §5.5 Casting Contexts - TODO");
    }

    /** JLS §5.6 Numeric Contexts — JLS Example 5.6-1, 5.6-2. */
    private static void numericContexts() {
        // TODO: 5.6 Numeric Contexts 내용 실습 코드 작성
        System.out.println("  §5.6 Numeric Contexts - TODO");
    }

    /** JLS §5.7 Testing Contexts — 공식 Example 번호 없음. */
    private static void testingContexts() {
        // TODO: 5.7 Testing Contexts 내용 실습 코드 작성
        System.out.println("  §5.7 Testing Contexts - TODO");
    }

}
