#!/bin/sh
## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2021, Konrad Weihmann
find $(dirname "$0")/../recipes-go/*.bb -exec basename {} \; | cut -d '_' -f 1 | sort | tr '\n' ' '