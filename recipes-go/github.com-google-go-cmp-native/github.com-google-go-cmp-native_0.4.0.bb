SUMMARY = "Package for comparing Go values in tests"
HOMEPAGE = "https://github.com/google/go-cmp"

SRC_URI = "git://${GO_IMPORT};protocol=https;tag=v${PV}"
GO_IMPORT = "github.com/google/go-cmp"

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE;md5=4ac66f7dea41d8d116cb7fb28aeff2ab"

DEPENDS += "\
            golang.org-x-xerrors-native \
           "

inherit go
inherit native
