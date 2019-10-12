#!/bin/sh
## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

_path=$(dirname $(realpath $0))
for f in $(find ${_path}/../recipes-sca/ -type f -name "*.bb" | sort | uniq); do
    _recipe=$(echo $(basename $f)| grep -o '.*_' | sed 's/.$//')
    if [ ! -z ${_recipe} ]; then
        ${_path}/get_buildtime ${_recipe} 2>/dev/null
    fi
done