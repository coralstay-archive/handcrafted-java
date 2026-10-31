package com.coralstay.jls.chapter12.execution;

/**
 * Chapter 12: Execution — 독립 실행 가능한 데모 진입점.
 *
 * <p>이 장의 절(section)마다 private static 메서드를 하나씩 두고, {@code main}에서
 * 순서대로 호출한다. 절을 공부할 때마다 해당 메서드 안을 직접 실습 코드로 채운다.
 * JLS 본문이 번호를 매긴 "Example X.Y-N"이 있는 절은 메서드 Javadoc에 그 번호를
 * 적어뒀다 — 그 예제를 그대로 타이핑해서 재현하면 된다. 번호가 없는 절은 본문
 * 설명만 있고 스펙이 별도로 박아둔 예제 코드는 없다는 뜻이다. 다른 장과
 * 무관하게 단독 실행 가능: {@code java --enable-preview -cp build/classes/java/main
 * com.coralstay.jls.chapter12.execution.ExecutionDemo}
 */
public final class ExecutionDemo {

    private ExecutionDemo() {
    }

    public static void main(String[] args) {
        System.out.println("=== Chapter 12: Execution ===");
        javaVirtualMachineStartup();
        loadingOfClassesAndInterfaces();
        linkingOfClassesAndInterfaces();
        initializationOfClassesAndInterfaces();
        creationOfNewClassInstances();
        finalizationOfClassInstances();
        unloadingOfClassesAndInterfaces();
        programExit();
    }

    /** JLS §12.1 Java Virtual Machine Startup — 공식 Example 번호 없음. */
    private static void javaVirtualMachineStartup() {
        // TODO: 12.1 Java Virtual Machine Startup 내용 실습 코드 작성
        System.out.println("  §12.1 Java Virtual Machine Startup - TODO");
    }

    /** JLS §12.2 Loading of Classes and Interfaces — 공식 Example 번호 없음. */
    private static void loadingOfClassesAndInterfaces() {
        // TODO: 12.2 Loading of Classes and Interfaces 내용 실습 코드 작성
        System.out.println("  §12.2 Loading of Classes and Interfaces - TODO");
    }

    /** JLS §12.3 Linking of Classes and Interfaces — 공식 Example 번호 없음. */
    private static void linkingOfClassesAndInterfaces() {
        // TODO: 12.3 Linking of Classes and Interfaces 내용 실습 코드 작성
        System.out.println("  §12.3 Linking of Classes and Interfaces - TODO");
    }

    /** JLS §12.4 Initialization of Classes and Interfaces — JLS Example 12.4.1-1, 12.4.1-2, 12.4.1-3. */
    private static void initializationOfClassesAndInterfaces() {
        // TODO: 12.4 Initialization of Classes and Interfaces 내용 실습 코드 작성
        System.out.println("  §12.4 Initialization of Classes and Interfaces - TODO");
    }

    /** JLS §12.5 Creation of New Class Instances — JLS Example 12.5-1, 12.5-2, 12.5-3. */
    private static void creationOfNewClassInstances() {
        // TODO: 12.5 Creation of New Class Instances 내용 실습 코드 작성
        System.out.println("  §12.5 Creation of New Class Instances - TODO");
    }

    /** JLS §12.6 Finalization of Class Instances — 공식 Example 번호 없음. */
    private static void finalizationOfClassInstances() {
        // TODO: 12.6 Finalization of Class Instances 내용 실습 코드 작성
        System.out.println("  §12.6 Finalization of Class Instances - TODO");
    }

    /** JLS §12.7 Unloading of Classes and Interfaces — 공식 Example 번호 없음. */
    private static void unloadingOfClassesAndInterfaces() {
        // TODO: 12.7 Unloading of Classes and Interfaces 내용 실습 코드 작성
        System.out.println("  §12.7 Unloading of Classes and Interfaces - TODO");
    }

    /** JLS §12.8 Program Exit — 공식 Example 번호 없음. */
    private static void programExit() {
        // TODO: 12.8 Program Exit 내용 실습 코드 작성
        System.out.println("  §12.8 Program Exit - TODO");
    }

}
