package com.coralstay.jls.chapter07.packagesandmodules;

/**
 * Chapter 7: Packages and Modules — 독립 실행 가능한 데모 진입점.
 *
 * <p>이 장의 절(section)마다 private static 메서드를 하나씩 두고, {@code main}에서
 * 순서대로 호출한다. 절을 공부할 때마다 해당 메서드 안을 직접 실습 코드로 채운다.
 * JLS 본문이 번호를 매긴 "Example X.Y-N"이 있는 절은 메서드 Javadoc에 그 번호를
 * 적어뒀다 — 그 예제를 그대로 타이핑해서 재현하면 된다. 번호가 없는 절은 본문
 * 설명만 있고 스펙이 별도로 박아둔 예제 코드는 없다는 뜻이다. 다른 장과
 * 무관하게 단독 실행 가능: {@code java --enable-preview -cp build/classes/java/main
 * com.coralstay.jls.chapter07.packagesandmodules.PackagesAndModulesDemo}
 */
public final class PackagesAndModulesDemo {

    private PackagesAndModulesDemo() {
    }

    public static void main(String[] args) {
        System.out.println("=== Chapter 7: Packages and Modules ===");
        packageMembers();
        hostSupportForModulesAndPackages();
        compilationUnits();
        packageDeclarations();
        importDeclarations();
        topLevelClassAndInterfaceDeclarations();
        moduleDeclarations();
    }

    /** JLS §7.1 Package Members — 공식 Example 번호 없음. */
    private static void packageMembers() {
        // TODO: 7.1 Package Members 내용 실습 코드 작성
        System.out.println("  §7.1 Package Members - TODO");
    }

    /** JLS §7.2 Host Support for Modules and Packages — 공식 Example 번호 없음. */
    private static void hostSupportForModulesAndPackages() {
        // TODO: 7.2 Host Support for Modules and Packages 내용 실습 코드 작성
        System.out.println("  §7.2 Host Support for Modules and Packages - TODO");
    }

    /** JLS §7.3 Compilation Units — 공식 Example 번호 없음. */
    private static void compilationUnits() {
        // TODO: 7.3 Compilation Units 내용 실습 코드 작성
        System.out.println("  §7.3 Compilation Units - TODO");
    }

    /** JLS §7.4 Package Declarations — JLS Example 7.4.2-1. */
    private static void packageDeclarations() {
        // TODO: 7.4 Package Declarations 내용 실습 코드 작성
        System.out.println("  §7.4 Package Declarations - TODO");
    }

    /** JLS §7.5 Import Declarations — JLS Example 7.5.1-1, 7.5.1-2, 7.5.1-3, 7.5.1-4, 7.5.2-1, 7.5.5-1, 7.5.5-2, 7.5.5-3. */
    private static void importDeclarations() {
        // TODO: 7.5 Import Declarations 내용 실습 코드 작성
        System.out.println("  §7.5 Import Declarations - TODO");
    }

    /** JLS §7.6 Top Level Class and Interface Declarations — JLS Example 7.6-1, 7.6-2, 7.6-3. */
    private static void topLevelClassAndInterfaceDeclarations() {
        // TODO: 7.6 Top Level Class and Interface Declarations 내용 실습 코드 작성
        System.out.println("  §7.6 Top Level Class and Interface Declarations - TODO");
    }

    /** JLS §7.7 Module Declarations — JLS Example 7.7.1-1 (본문 오탈자로 7.1.1-1로 표기됨). */
    private static void moduleDeclarations() {
        // TODO: 7.7 Module Declarations 내용 실습 코드 작성
        System.out.println("  §7.7 Module Declarations - TODO");
    }

}
