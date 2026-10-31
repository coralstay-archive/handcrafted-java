#!/usr/bin/env bash
# 프로젝트 내 핵심 코드 스니펫([[snippet]] / @snippet) 검색·검증·추출기
set -euo pipefail
if command -v doctree >/dev/null 2>&1; then
  exec doctree snippet "$@"
fi
query="${1:-@snippet}"
grep -rn "$query" practice tips 2>/dev/null || true
