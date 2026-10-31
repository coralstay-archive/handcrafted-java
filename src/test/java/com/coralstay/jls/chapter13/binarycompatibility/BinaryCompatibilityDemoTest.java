package com.coralstay.jls.chapter13.binarycompatibility;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Chapter 13: Binary Compatibility — BinaryCompatibilityDemo에 대응하는 절별 테스트.
 *
 * <p>절을 실제로 구현할 때 {@code @Disabled}를 지우고, JLS에 명시된
 * 경계값과 예외 케이스까지 포함해서 검증한다. Example 번호가 있는 절은
 * 그 예제가 보여주는 요점을 그대로 assertion으로 옮기면 된다.
 */
class BinaryCompatibilityDemoTest {

    @Test
    @Disabled("TODO: JLS §13.1 The Form of a Binary (공식 Example 번호 없음) - 모든 케이스 검증 필요")
    void theFormOfABinary() {
        // TODO: JLS §13.1 The Form of a Binary의 모든 케이스(경계값, 예외, 컴파일 에러 포함)를 검증
        fail("not yet implemented");
    }

    @Test
    @Disabled("TODO: JLS §13.2 What Binary Compatibility Is and Is Not (공식 Example 번호 없음) - 모든 케이스 검증 필요")
    void whatBinaryCompatibilityIsAndIsNot() {
        // TODO: JLS §13.2 What Binary Compatibility Is and Is Not의 모든 케이스(경계값, 예외, 컴파일 에러 포함)를 검증
        fail("not yet implemented");
    }

    @Test
    @Disabled("TODO: JLS §13.3 Evolution of Packages and Modules (공식 Example 번호 없음) - 모든 케이스 검증 필요")
    void evolutionOfPackagesAndModules() {
        // TODO: JLS §13.3 Evolution of Packages and Modules의 모든 케이스(경계값, 예외, 컴파일 에러 포함)를 검증
        fail("not yet implemented");
    }

    @Test
    @Disabled("TODO: JLS §13.4 Evolution of Classes (JLS Example 13.4.4-1, 13.4.4-2, 13.4.6-1, 13.4.6-2, 13.4.8-1, 13.4.9-1, 13.4.16-1, 13.4.17-1, 13.4.23-1) - 모든 케이스 검증 필요")
    void evolutionOfClasses() {
        // TODO: JLS §13.4 Evolution of Classes의 모든 케이스(경계값, 예외, 컴파일 에러 포함)를 검증
        fail("not yet implemented");
    }

    @Test
    @Disabled("TODO: JLS §13.5 Evolution of Interfaces (JLS Example 13.5.4-1, 13.5.7-1) - 모든 케이스 검증 필요")
    void evolutionOfInterfaces() {
        // TODO: JLS §13.5 Evolution of Interfaces의 모든 케이스(경계값, 예외, 컴파일 에러 포함)를 검증
        fail("not yet implemented");
    }

}
