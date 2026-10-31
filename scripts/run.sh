#!/usr/bin/env bash
# 실습 과제(main.cpp / main.py / main.java / main.sql) 0.1초 고속 실행기
set -euo pipefail

if [ "$#" -lt 1 ]; then
  echo "사용법: $0 <실습_폴더_또는_파일_경로> [인자...]" >&2
  exit 1
fi

target="$1"
shift
if [ ! -e "$target" ] && [ -e "practice/$target" ]; then
  target="practice/$target"
fi

if [ -d "$target" ]; then
  if [ -f "$target/main.py" ]; then
    exec python3 "$target/main.py" "$@"
  elif [ -f "$target/main.cpp" ]; then
    out="$(mktemp -d)/a.out"
    clang++ -std=c++20 -O2 "$target/main.cpp" -o "$out"
    exec "$out" "$@"
  elif [ -f "$target/main.java" ]; then
    exec java "$target/main.java" "$@"
  elif [ -f "$target/main.sql" ]; then
    cat "$target/main.sql"
    exit 0
  fi
fi

echo "실행 가능한 main 파일을 찾을 수 없습니다: $target" >&2
exit 1
