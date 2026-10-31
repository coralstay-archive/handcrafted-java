# java-study

Java Language Specification(JLS) 25를 챕터별로 직접 구현하며 공부하는 레포

## 구조

각 챕터가 하나의 Java 패키지다.

```
src/main/java/com/coralstay/jls/chapterNN/<주제>/
├── package-info.java   # 그 챕터의 학습 노트 (JLS 목차/섹션 요약)
└── *Demo.java           # 스펙 내용을 코드로 확인하는 데모

src/test/java/com/coralstay/jls/chapterNN/<주제>/
└── *DemoTest.java        # 데모 코드를 검증하는 JUnit 5 테스트
```

- `docs/java/jls-notes/` — 챕터 1~19 마크다운 학습 노트
- `docs/jls-spec/` — 참고 스펙 문서

## 다루는 챕터 (1~19)

introduction, grammars, lexical structure, types/values/variables, conversions and contexts,
names, packages and modules, classes, interfaces, arrays, exceptions, execution, binary
compatibility, blocks/statements/patterns, expressions, definite assignment, threads and
locks, type inference, syntax.

## 실행

Java 25 (`--enable-preview` 활성화), Gradle Kotlin DSL.

```bash
./gradlew test
```

## 도서

`Books/`에 jls25.pdf, jvms25.pdf(JLS/JVMS 원문 스펙)가 있다.

## 라이선스

이 저장소에서 직접 작성한 코드와 문서는 [GNU AGPL-3.0-only](./LICENSE)를 따릅니다.
Gradle Wrapper(`gradlew`, `gradlew.bat`, `gradle/wrapper/`)는 Gradle 프로젝트의 Apache-2.0 라이선스를 따릅니다.
Java Language Specification 등 참고 자료는 저작권자 소유이며 이 저장소에 포함하지 않습니다.
