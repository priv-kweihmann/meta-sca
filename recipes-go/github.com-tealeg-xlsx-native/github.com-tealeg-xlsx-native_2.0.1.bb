SUMMARY = "Google Go (golang) library for reading and writing XLSX files"
HOMEPAGE = "https://github.com/tealeg/xlsx"

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE;md5=f609f72877939978ce194fa2431db040"

DEPENDS += "\
            github.com-frankban-quicktest-native \
            gopkg.in-check.v1-native \
           "

SRC_URI = "git://${GO_IMPORT};protocol=https"
SRCREV = "5fbeeeef05b0f65852efca277c23d75538835f57"
GO_IMPORT = "github.com/tealeg/xlsx"

UPSTREAM_CHECK_GITTAGREGEX = "(?P<pver>\d+\.\d+\.\d+)"

inherit go
inherit native
