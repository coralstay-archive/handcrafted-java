# ⚠️ 01_starter — 01_fundamentals / 01_intro Pitfalls (실습 과제)

## 1. 언제 제대로 동작하지 않는가 (Failure Modes & Edge Cases)

- 빈 입력(Empty Input), 경계값(0, 음수, 최댓값), NULL/None 참조가 주어질 때의 예외 및 반환값을 확인하세요.
- 전제 조건(Precondition)이나 불변식(Invariant)이 깨지는 입력에서 조기 실패(Fail-Fast)하는지 점검하세요.

## 2. 자주 하는 실수 (Common Mistakes & Anti-Patterns)

- 원문(실습 과제)의 핵심 제약 조건을 생략하고 해피 패스(Happy Path)만 구현하는 실수를 피하세요.
- 타입 변환, 오프셋 계산(Off-by-one), 리소스 해제 누락 여부를 함께 확인하세요.

## 3. 성능·메모리·환경 유의사항 (Performance & Environment Caveats)

- 대상 언어(`.java`) 컴파일러/런타임 버전 및 운영체제·커널 환경에 따른 동작 차이를 점검하세요.
- 불필요한 복사, 대용량 입력 시 시간·공간 복잡도 급증 구간이 없는지 확인하세요.

## 4. 디버깅 체크리스트 (Verification Checklist)

- [ ] `main.java` 실행 결과가 `README.md`의 목표 출력과 정확히 일치하는가?
- [ ] `test.java` 단위 테스트에 경계값·예외 케이스를 추가해 통과했는가?
- [ ] 원문(실습 과제)의 수식·다이어그램·코드 제약을 모두 반영했는가?
