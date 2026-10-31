package com.coralstay.jls.chapter11.exceptions;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Chapter 11: Exceptions — ExceptionsDemo에 대응하는 절별 테스트.
 *
 * <p>절을 실제로 구현할 때 {@code @Disabled}를 지우고, JLS에 명시된
 * 경계값과 예외 케이스까지 포함해서 검증한다. Example 번호가 있는 절은
 * 그 예제가 보여주는 요점을 그대로 assertion으로 옮기면 된다.
 */
class ExceptionsDemoTest {

    @Test
    @Disabled("TODO: JLS §11.1 The Kinds and Causes of Exceptions (공식 Example 번호 없음) - 모든 케이스 검증 필요")
    void theKindsAndCausesOfExceptions() {
        // TODO: JLS §11.1 The Kinds and Causes of Exceptions의 모든 케이스(경계값, 예외, 컴파일 에러 포함)를 검증
        fail("not yet implemented");
    }

    @Test
    @Disabled("TODO: JLS §11.2 Compile-Time Checking of Exceptions (JLS Example 11.2.3-1) - 모든 케이스 검증 필요")
    void compileTimeCheckingOfExceptions() {
        // TODO: JLS §11.2 Compile-Time Checking of Exceptions의 모든 케이스(경계값, 예외, 컴파일 에러 포함)를 검증
        fail("not yet implemented");
    }

    @Test
    @Disabled("TODO: JLS §11.3 Run-Time Handling of an Exception (JLS Example 11.3-1) - 모든 케이스 검증 필요")
    void runTimeHandlingOfAnException() {
        // TODO: JLS §11.3 Run-Time Handling of an Exception의 모든 케이스(경계값, 예외, 컴파일 에러 포함)를 검증
        fail("not yet implemented");
    }

}
