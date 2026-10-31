package com.coralstay.jls.chapter17.threadsandlocks;

/**
 * Chapter 17: Threads and Locks — 독립 실행 가능한 데모 진입점.
 *
 * <p>이 장의 절(section)마다 private static 메서드를 하나씩 두고, {@code main}에서
 * 순서대로 호출한다. 절을 공부할 때마다 해당 메서드 안을 직접 실습 코드로 채운다.
 * JLS 본문이 번호를 매긴 "Example X.Y-N"이 있는 절은 메서드 Javadoc에 그 번호를
 * 적어뒀다 — 그 예제를 그대로 타이핑해서 재현하면 된다. 번호가 없는 절은 본문
 * 설명만 있고 스펙이 별도로 박아둔 예제 코드는 없다는 뜻이다. 다른 장과
 * 무관하게 단독 실행 가능: {@code java --enable-preview -cp build/classes/java/main
 * com.coralstay.jls.chapter17.threadsandlocks.ThreadsAndLocksDemo}
 */
public final class ThreadsAndLocksDemo {

    private ThreadsAndLocksDemo() {
    }

    public static void main(String[] args) {
        System.out.println("=== Chapter 17: Threads and Locks ===");
        synchronization();
        waitSetsAndNotification();
        sleepAndYield();
        memoryModel();
        finalFieldSemantics();
        wordTearing();
        nonAtomicTreatmentOfDoubleAndLong();
    }

    /** JLS §17.1 Synchronization — 공식 Example 번호 없음. */
    private static void synchronization() {
        // TODO: 17.1 Synchronization 내용 실습 코드 작성
        System.out.println("  §17.1 Synchronization - TODO");
    }

    /** JLS §17.2 Wait Sets and Notification — 공식 Example 번호 없음. */
    private static void waitSetsAndNotification() {
        // TODO: 17.2 Wait Sets and Notification 내용 실습 코드 작성
        System.out.println("  §17.2 Wait Sets and Notification - TODO");
    }

    /** JLS §17.3 Sleep and Yield — 공식 Example 번호 없음. */
    private static void sleepAndYield() {
        // TODO: 17.3 Sleep and Yield 내용 실습 코드 작성
        System.out.println("  §17.3 Sleep and Yield - TODO");
    }

    /** JLS §17.4 Memory Model — JLS Example 17.4-1, 17.4.5-1, 17.4.8-1. */
    private static void memoryModel() {
        // TODO: 17.4 Memory Model 내용 실습 코드 작성
        System.out.println("  §17.4 Memory Model - TODO");
    }

    /** JLS §17.5 final Field Semantics — JLS Example 17.5-1, 17.5-2, 17.5.3-1. */
    private static void finalFieldSemantics() {
        // TODO: 17.5 final Field Semantics 내용 실습 코드 작성
        System.out.println("  §17.5 final Field Semantics - TODO");
    }

    /** JLS §17.6 Word Tearing — JLS Example 17.6-1. */
    private static void wordTearing() {
        // TODO: 17.6 Word Tearing 내용 실습 코드 작성
        System.out.println("  §17.6 Word Tearing - TODO");
    }

    /** JLS §17.7 Non-Atomic Treatment of double and long — 공식 Example 번호 없음. */
    private static void nonAtomicTreatmentOfDoubleAndLong() {
        // TODO: 17.7 Non-Atomic Treatment of double and long 내용 실습 코드 작성
        System.out.println("  §17.7 Non-Atomic Treatment of double and long - TODO");
    }

}
