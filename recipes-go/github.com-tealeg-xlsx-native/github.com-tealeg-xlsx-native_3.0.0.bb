SUMMARY = "Google Go (golang) library for reading and writing XLSX files"
HOMEPAGE = "https://github.com/tealeg/xlsx"

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE;md5=f609f72877939978ce194fa2431db040"

DEPENDS += "\
            github.com-frankban-quicktest-native \
            github.com-peterbourgon-diskv-native \
            github.com-rogpeppe-fastuuid-native \
            github.com-shabbyrobe-xmlwriter-native \
            gopkg.in-check.v1-native \
           "

SRC_URI = "git://${GO_IMPORT};protocol=https"
SRCREV = "05284ea17355d0b7c62612710fb7e4eccc2be137"
GO_IMPORT = "github.com/tealeg/xlsx"

UPSTREAM_CHECK_GITTAGREGEX = "(?P<pver>\d+\.\d+\.\d+)"

inherit go
inherit native
