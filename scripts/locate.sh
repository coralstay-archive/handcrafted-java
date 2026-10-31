#!/usr/bin/env bash
# 실습 과제 및 원문 페이지(content_data/) 역추적 네비게이터
set -euo pipefail
query="${1:---tree}"
if [ "$query" = "--tree" ]; then
  find practice content_data -maxdepth 4 2>/dev/null | sort
else
  grep -rn "$query" practice content_data 2>/dev/null || true
fi
