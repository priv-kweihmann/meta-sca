## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2020, Konrad Weihmann

# This class provided some fixes around compiling go for native recipes
# as GO_DYNLINK seems to cause issues with latest GO compiler
# furthermore CGO has to be disabled to make it work

inherit go

# Disable dnylinking
GO_DYNLINK_class-native = "1"
# disable CGO
export CGO_ENABLED = "0"
