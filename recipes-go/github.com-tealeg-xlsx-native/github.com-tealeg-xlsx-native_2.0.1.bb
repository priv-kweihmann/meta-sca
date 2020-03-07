SUMMARY = "Google Go (golang) library for reading and writing XLSX files"
HOMEPAGE = "https://github.com/tealeg/xlsx"

SRC_URI = "git://${GO_IMPORT};protocol=https;tag=v${PV}"
GO_IMPORT = "github.com/tealeg/xlsx"

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE;md5=f609f72877939978ce194fa2431db040"

DEPENDS += "\
            github.com-frankban-quicktest-native \
            gopkg.in-check.v1-native \
           "

inherit go
inherit native