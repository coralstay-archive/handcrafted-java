#!/usr/bin/env bash
# 실습 과제(main.* / test.*)를 초기 스켈레톤(.skeleton/) 상태로 복원하는 리셋 도구
set -euo pipefail

if [ "$#" -lt 1 ]; then
  echo "사용법: $0 <실습_폴더_경로>" >&2
  exit 1
fi

target="$1"
if [ ! -e "$target" ] && [ -e "practice/$target" ]; then
  target="practice/$target"
fi

if [ ! -d "$target" ]; then
  echo "실습 디렉토리를 찾을 수 없습니다: $target" >&2
  exit 1
fi

reset_kata_dir() {
  local kdir="$1"
  local skel="$kdir/.skeleton"
  [ -d "$skel" ] || return 0
  for src in "$skel"/*; do
    [ -f "$src" ] || continue
    local base
    base="$(basename "$src")"
    cp -f "$src" "$kdir/$base"
    chmod 644 "$kdir/$base"
  done
  echo "초기화 완료: $kdir"
}

if [ -d "$target/.skeleton" ]; then
  reset_kata_dir "$target"
else
  find "$target" -type d -name ".skeleton" | sort | while read -r sdir; do
    reset_kata_dir "$(dirname "$sdir")"
  done
fi
