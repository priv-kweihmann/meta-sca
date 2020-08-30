SUMMARY = "Package for comparing Go values in tests"
HOMEPAGE = "https://github.com/google/go-cmp"

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE;md5=4ac66f7dea41d8d116cb7fb28aeff2ab"

DEPENDS += "golang.org-x-xerrors-native"

SRC_URI = "git://${GO_IMPORT};protocol=https"
SRCREV = "d2fcc899bdc2d134b7c00e36137260db963e193c"
GO_IMPORT = "github.com/google/go-cmp"

inherit go
inherit native
