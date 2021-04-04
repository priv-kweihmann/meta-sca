#!/bin/sh
## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2021, Konrad Weihmann

find $(dirname "$0")/../recipes-go/*.bb -exec grep "GO_IMPORT = " {} \; | sed 's#GO_IMPORT = "##g' | sed 's#"$##g' | sort | tr '\n' ' '