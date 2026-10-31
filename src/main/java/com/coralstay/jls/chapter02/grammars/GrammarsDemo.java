package com.coralstay.jls.chapter02.grammars;

/**
 * Chapter 2: Grammars — 독립 실행 가능한 데모 진입점.
 *
 * <p>이 장의 절(section)마다 private static 메서드를 하나씩 두고, {@code main}에서
 * 순서대로 호출한다. 절을 공부할 때마다 해당 메서드 안을 직접 실습 코드로 채운다.
 * JLS 본문이 번호를 매긴 "Example X.Y-N"이 있는 절은 메서드 Javadoc에 그 번호를
 * 적어뒀다 — 그 예제를 그대로 타이핑해서 재현하면 된다. 번호가 없는 절은 본문
 * 설명만 있고 스펙이 별도로 박아둔 예제 코드는 없다는 뜻이다. 다른 장과
 * 무관하게 단독 실행 가능: {@code java --enable-preview -cp build/classes/java/main
 * com.coralstay.jls.chapter02.grammars.GrammarsDemo}
 */
public final class GrammarsDemo {

    private GrammarsDemo() {
    }

    public static void main(String[] args) {
        System.out.println("=== Chapter 2: Grammars ===");
        contextFreeGrammars();
        theLexicalGrammar();
        theSyntacticGrammar();
        grammarNotation();
    }

    /** JLS §2.1 Context-Free Grammars — 공식 Example 번호 없음. */
    private static void contextFreeGrammars() {
        // TODO: 2.1 Context-Free Grammars 내용 실습 코드 작성
        System.out.println("  §2.1 Context-Free Grammars - TODO");
    }

    /** JLS §2.2 The Lexical Grammar — 공식 Example 번호 없음. */
    private static void theLexicalGrammar() {
        // TODO: 2.2 The Lexical Grammar 내용 실습 코드 작성
        System.out.println("  §2.2 The Lexical Grammar - TODO");
    }

    /** JLS §2.3 The Syntactic Grammar — 공식 Example 번호 없음. */
    private static void theSyntacticGrammar() {
        // TODO: 2.3 The Syntactic Grammar 내용 실습 코드 작성
        System.out.println("  §2.3 The Syntactic Grammar - TODO");
    }

    /** JLS §2.4 Grammar Notation — 공식 Example 번호 없음. */
    private static void grammarNotation() {
        // TODO: 2.4 Grammar Notation 내용 실습 코드 작성
        System.out.println("  §2.4 Grammar Notation - TODO");
    }

}
