package com.coralstay.jls.chapter03.lexicalstructure;

/**
 * Chapter 3: Lexical Structure — 독립 실행 가능한 데모 진입점.
 *
 * <p>이 장의 절(section)마다 private static 메서드를 하나씩 두고, {@code main}에서
 * 순서대로 호출한다. 절을 공부할 때마다 해당 메서드 안을 직접 실습 코드로 채운다.
 * JLS 본문이 번호를 매긴 "Example X.Y-N"이 있는 절은 메서드 Javadoc에 그 번호를
 * 적어뒀다 — 그 예제를 그대로 타이핑해서 재현하면 된다. 번호가 없는 절은 본문
 * 설명만 있고 스펙이 별도로 박아둔 예제 코드는 없다는 뜻이다. 다른 장과 무관하게
 * 단독 실행 가능: {@code java --enable-preview -cp build/classes/java/main
 * com.coralstay.jls.chapter03.lexicalstructure.LexicalStructureDemo}
 */
public final class LexicalStructureDemo {

    private LexicalStructureDemo() {
    }

    public static void main(String[] args) {
        System.out.println("=== Chapter 3: Lexical Structure ===");
        unicode();
        lexicalTranslations();
        unicodeEscapes();
        lineTerminators();
        inputElementsAndTokens();
        whiteSpace();
        comments();
        identifiers();
        keywords();
        integerLiterals();
        floatingPointLiterals();
        booleanLiterals();
        characterLiterals();
        stringLiterals();
        textBlocks();
        escapeSequences();
        nullLiteral();
        separators();
        operators();
    }

    /** JLS §3.1 Unicode — 공식 Example 번호 없음. */
    private static void unicode() {
        // TODO: 3.1 Unicode 내용 실습 코드 작성
        System.out.println("  §3.1 Unicode - TODO");
    }

    /** JLS §3.2 Lexical Translations — 공식 Example 번호 없음. */
    private static void lexicalTranslations() {
        // TODO: 3.2 Lexical Translations 내용 실습 코드 작성
        System.out.println("  §3.2 Lexical Translations - TODO");
    }

    /** JLS §3.3 Unicode Escapes — 공식 Example 번호 없음. */
    private static void unicodeEscapes() {
        // TODO: 3.3 Unicode Escapes 내용 실습 코드 작성
        System.out.println("  §3.3 Unicode Escapes - TODO");
    }

    /** JLS §3.4 Line Terminators — 공식 Example 번호 없음. */
    private static void lineTerminators() {
        // TODO: 3.4 Line Terminators 내용 실습 코드 작성
        System.out.println("  §3.4 Line Terminators - TODO");
    }

    /** JLS §3.5 Input Elements and Tokens — 공식 Example 번호 없음. */
    private static void inputElementsAndTokens() {
        // TODO: 3.5 Input Elements and Tokens 내용 실습 코드 작성
        System.out.println("  §3.5 Input Elements and Tokens - TODO");
    }

    /** JLS §3.6 White Space — 공식 Example 번호 없음. */
    private static void whiteSpace() {
        // TODO: 3.6 White Space 내용 실습 코드 작성
        System.out.println("  §3.6 White Space - TODO");
    }

    /** JLS §3.7 Comments — 공식 Example 번호 없음. */
    private static void comments() {
        // TODO: 3.7 Comments 내용 실습 코드 작성
        System.out.println("  §3.7 Comments - TODO");
    }

    /** JLS §3.8 Identifiers — 공식 Example 번호 없음. */
    private static void identifiers() {
        // TODO: 3.8 Identifiers 내용 실습 코드 작성
        System.out.println("  §3.8 Identifiers - TODO");
    }

    /** JLS §3.9 Keywords — 공식 Example 번호 없음. */
    private static void keywords() {
        // TODO: 3.9 Keywords 내용 실습 코드 작성
        System.out.println("  §3.9 Keywords - TODO");
    }

    /** JLS §3.10.1 Integer Literals — 공식 Example 번호 없음. */
    private static void integerLiterals() {
        // TODO: 3.10.1 Integer Literals 내용 실습 코드 작성
        System.out.println("  §3.10.1 Integer Literals - TODO");
    }

    /** JLS §3.10.2 Floating-Point Literals — 공식 Example 번호 없음. */
    private static void floatingPointLiterals() {
        // TODO: 3.10.2 Floating-Point Literals 내용 실습 코드 작성
        System.out.println("  §3.10.2 Floating-Point Literals - TODO");
    }

    /** JLS §3.10.3 Boolean Literals — 공식 Example 번호 없음. */
    private static void booleanLiterals() {
        // TODO: 3.10.3 Boolean Literals 내용 실습 코드 작성
        System.out.println("  §3.10.3 Boolean Literals - TODO");
    }

    /** JLS §3.10.4 Character Literals — 공식 Example 번호 없음. */
    private static void characterLiterals() {
        // TODO: 3.10.4 Character Literals 내용 실습 코드 작성
        System.out.println("  §3.10.4 Character Literals - TODO");
    }

    /** JLS §3.10.5 String Literals — JLS Example 3.10.5-1 (String Literals). */
    private static void stringLiterals() {
        // TODO: 3.10.5 String Literals 내용 실습 코드 작성 (JLS Example 3.10.5-1 재현)
        System.out.println("  §3.10.5 String Literals - TODO (Example 3.10.5-1)");
    }

    /**
     * JLS §3.10.6 Text Blocks — JLS Example 3.10.6-1 (Text Blocks), 3.10.6-2 (Escape
     * sequences in text blocks), 3.10.6-3 (Order of transformations on text block
     * content), 3.10.6-4 (Text blocks evaluate to String).
     */
    private static void textBlocks() {
        // TODO: 3.10.6 Text Blocks 내용 실습 코드 작성 (JLS Example 3.10.6-1~4 재현)
        System.out.println("  §3.10.6 Text Blocks - TODO (Example 3.10.6-1, 3.10.6-2, 3.10.6-3, 3.10.6-4)");
    }

    /** JLS §3.10.7 Escape Sequences — 공식 Example 번호 없음. */
    private static void escapeSequences() {
        // TODO: 3.10.7 Escape Sequences 내용 실습 코드 작성
        System.out.println("  §3.10.7 Escape Sequences - TODO");
    }

    /** JLS §3.10.8 The Null Literal — 공식 Example 번호 없음. */
    private static void nullLiteral() {
        // TODO: 3.10.8 The Null Literal 내용 실습 코드 작성
        System.out.println("  §3.10.8 The Null Literal - TODO");
    }

    /** JLS §3.11 Separators — 공식 Example 번호 없음. */
    private static void separators() {
        // TODO: 3.11 Separators 내용 실습 코드 작성
        System.out.println("  §3.11 Separators - TODO");
    }

    /** JLS §3.12 Operators — 공식 Example 번호 없음. */
    private static void operators() {
        // TODO: 3.12 Operators 내용 실습 코드 작성
        System.out.println("  §3.12 Operators - TODO");
    }
}
