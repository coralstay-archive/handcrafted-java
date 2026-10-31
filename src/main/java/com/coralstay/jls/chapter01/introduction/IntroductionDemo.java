package com.coralstay.jls.chapter01.introduction;

/**
 * Chapter 1: Introduction — 독립 실행 가능한 데모 진입점.
 *
 * <p>이 장의 절(section)마다 private static 메서드를 하나씩 두고, {@code main}에서
 * 순서대로 호출한다. 절을 공부할 때마다 해당 메서드 안을 직접 실습 코드로 채운다.
 * JLS 본문이 번호를 매긴 "Example X.Y-N"이 있는 절은 메서드 Javadoc에 그 번호를
 * 적어뒀다 — 그 예제를 그대로 타이핑해서 재현하면 된다. 번호가 없는 절은 본문
 * 설명만 있고 스펙이 별도로 박아둔 예제 코드는 없다는 뜻이다. 다른 장과
 * 무관하게 단독 실행 가능: {@code java --enable-preview -cp build/classes/java/main
 * com.coralstay.jls.chapter01.introduction.IntroductionDemo}
 */
public final class IntroductionDemo {

    private IntroductionDemo() {
    }

    public static void main(String[] args) {
        System.out.println("=== Chapter 1: Introduction ===");
        organizationOfTheSpecification();
        examplePrograms();
        notation();
        relationshipToPredefinedClassesAndInterfaces();
        previewFeatures();
        feedback();
        references();
    }

    /** JLS §1.1 Organization of the Specification — 공식 Example 번호 없음. */
    private static void organizationOfTheSpecification() {
        // TODO: 1.1 Organization of the Specification 내용 실습 코드 작성
        /*
        1장의 내용은
         */
        System.out.println("  §1.1 Organization of the Specification - TODO");
    }

    /** JLS §1.2 Example Programs — 공식 Example 번호 없음. */
    private static void examplePrograms() {
        // TODO: 1.2 Example Programs 내용 실습 코드 작성
        System.out.println("  §1.2 Example Programs - TODO");
    }

    /** JLS §1.3 Notation — 공식 Example 번호 없음. */
    private static void notation() {
        // TODO: 1.3 Notation 내용 실습 코드 작성
        System.out.println("  §1.3 Notation - TODO");
    }

    /** JLS §1.4 Relationship to Predefined Classes and Interfaces — 공식 Example 번호 없음. */
    private static void relationshipToPredefinedClassesAndInterfaces() {
        // TODO: 1.4 Relationship to Predefined Classes and Interfaces 내용 실습 코드 작성
        System.out.println("  §1.4 Relationship to Predefined Classes and Interfaces - TODO");
    }

    /** JLS §1.5 Preview Features — 공식 Example 번호 없음. */
    private static void previewFeatures() {
        // TODO: 1.5 Preview Features 내용 실습 코드 작성
        System.out.println("  §1.5 Preview Features - TODO");
    }

    /** JLS §1.6 Feedback — 공식 Example 번호 없음. */
    private static void feedback() {
        // TODO: 1.6 Feedback 내용 실습 코드 작성
        System.out.println("  §1.6 Feedback - TODO");
    }

    /** JLS §1.7 References — 공식 Example 번호 없음. */
    private static void references() {
        // TODO: 1.7 References 내용 실습 코드 작성
        System.out.println("  §1.7 References - TODO");
    }

}
