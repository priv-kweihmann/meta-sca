SUMMARY = "Package for comparing Go values in tests"
HOMEPAGE = "https://github.com/google/go-cmp"

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE;md5=4ac66f7dea41d8d116cb7fb28aeff2ab"

DEPENDS += "golang.org-x-xerrors-native"

SRC_URI = "git://${GO_IMPORT};protocol=https"
SRCREV = "9680bfaf28748393e28e00238d94070fb9972fd8"
GO_IMPORT = "github.com/google/go-cmp"

inherit go
inherit native
