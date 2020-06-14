SUMMARY = "Google Go (golang) library for reading and writing XLSX files"
HOMEPAGE = "https://github.com/tealeg/xlsx"

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE;md5=b17ee91e3d09eeaa00ebd23b0e8d84be"

DEPENDS += "\
            github.com-frankban-quicktest-native \
            github.com-peterbourgon-diskv-native \
            github.com-rogpeppe-fastuuid-native \
            github.com-shabbyrobe-xmlwriter-native \
            gopkg.in-check.v1-native \
           "

SRC_URI = "git://${GO_IMPORT};protocol=https"
SRCREV = "414693dc24c7c198bb4b545a8549d450570ef54b"
GO_IMPORT = "github.com/tealeg/xlsx"

UPSTREAM_CHECK_GITTAGREGEX = "(?P<pver>\d+\.\d+\.\d+)"

inherit go
inherit native
