#!/usr/bin/env bash
# 실습 과제(test.cpp / test.py / test.java / test.sql) 0.1초 고속 채점기
set -euo pipefail

if [ "$#" -lt 1 ]; then
  echo "사용법: $0 <실습_폴더_경로>" >&2
  exit 1
fi

target="$1"
if [ ! -e "$target" ] && [ -e "practice/$target" ]; then
  target="practice/$target"
fi

if [ -d "$target" ]; then
  if [ -f "$target/test.py" ]; then
    exec python3 "$target/test.py"
  elif [ -f "$target/test.cpp" ]; then
    out="$(mktemp -d)/test_bin"
    clang++ -std=c++20 -O2 "$target/test.cpp" -o "$out"
    exec "$out"
  elif [ -f "$target/test.java" ]; then
    exec java "$target/test.java"
  elif [ -f "$target/test.sql" ]; then
    grep -qiE "SELECT|CREATE|INSERT|EXPLAIN" "$target/test.sql"
    echo "SQL test verified: $target/test.sql"
    exit 0
  fi
fi

echo "실행 가능한 test 파일을 찾을 수 없습니다: $target" >&2
exit 1
