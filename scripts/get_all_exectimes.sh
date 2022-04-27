#!/bin/sh
## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

_path=$(dirname $(realpath $0))
tasks=$(grep -Rh "addtask" ${_path}/../classes/ | cut -d' ' -f2 | sed "s/\n/ /g" | sort | uniq)
for f in ${tasks}; do
    ${_path}/get_exectime ${f} 2>/dev/null
done