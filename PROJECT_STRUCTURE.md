# handcrafted-java 디렉토리 및 아키텍처 규격 (`handcrafted`)

본 프로젝트는 `doctree scaffold handcrafted` 명령으로 표준 구조가 강제·검증됩니다.

1. `contents/`: 원본 도서 PDF (`doctree pull` 대상, `contents/<트랙_또는_분류>/<도서_슬러그>/` 또는 `contents/<도서_슬러그>/`)
2. `content_data/`: `contents/`의 디렉토리 계층을 1:1로 미러링한 페이지별 마크다운 + 크롭 이미지(`.png`) + Graphviz DOT 벡터 도식(`.svg`) + `index.json`
3. `practice/`: `practice/<트랙_또는_분류>/<도서_슬러그>/<장>/<절>/` 계층 아래 학습자가 직접 타이핑하며 검증하는 4대 표준 실습 파일 (`README.md`, `PITFALLS.md`, `main.*`, `test.*`)
