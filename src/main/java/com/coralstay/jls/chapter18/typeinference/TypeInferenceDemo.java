package com.coralstay.jls.chapter18.typeinference;

/**
 * Chapter 18: Type Inference — 독립 실행 가능한 데모 진입점.
 *
 * <p>이 장의 절(section)마다 private static 메서드를 하나씩 두고, {@code main}에서
 * 순서대로 호출한다. 절을 공부할 때마다 해당 메서드 안을 직접 실습 코드로 채운다.
 * JLS 본문이 번호를 매긴 "Example X.Y-N"이 있는 절은 메서드 Javadoc에 그 번호를
 * 적어뒀다 — 그 예제를 그대로 타이핑해서 재현하면 된다. 번호가 없는 절은 본문
 * 설명만 있고 스펙이 별도로 박아둔 예제 코드는 없다는 뜻이다. 다른 장과
 * 무관하게 단독 실행 가능: {@code java --enable-preview -cp build/classes/java/main
 * com.coralstay.jls.chapter18.typeinference.TypeInferenceDemo}
 */
public final class TypeInferenceDemo {

    private TypeInferenceDemo() {
    }

    public static void main(String[] args) {
        System.out.println("=== Chapter 18: Type Inference ===");
        conceptsAndNotation();
        reduction();
        incorporation();
        resolution();
        usesOfInference();
    }

    /** JLS §18.1 Concepts and Notation — 공식 Example 번호 없음. */
    private static void conceptsAndNotation() {
        // TODO: 18.1 Concepts and Notation 내용 실습 코드 작성
        System.out.println("  §18.1 Concepts and Notation - TODO");
    }

    /** JLS §18.2 Reduction — 공식 Example 번호 없음. */
    private static void reduction() {
        // TODO: 18.2 Reduction 내용 실습 코드 작성
        System.out.println("  §18.2 Reduction - TODO");
    }

    /** JLS §18.3 Incorporation — 공식 Example 번호 없음. */
    private static void incorporation() {
        // TODO: 18.3 Incorporation 내용 실습 코드 작성
        System.out.println("  §18.3 Incorporation - TODO");
    }

    /** JLS §18.4 Resolution — 공식 Example 번호 없음. */
    private static void resolution() {
        // TODO: 18.4 Resolution 내용 실습 코드 작성
        System.out.println("  §18.4 Resolution - TODO");
    }

    /** JLS §18.5 Uses of Inference — JLS Example 18.5.5-1. */
    private static void usesOfInference() {
        // TODO: 18.5 Uses of Inference 내용 실습 코드 작성
        System.out.println("  §18.5 Uses of Inference - TODO");
    }

}
