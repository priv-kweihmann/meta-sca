SUMMARY = "Blackfriday: a markdown processor for Go"
HOMEPAGE = "https://github.com/russross/blackfriday"

SRC_URI = "git://${GO_IMPORT};protocol=https;tag=v${PV};branch=v2"
GO_IMPORT = "github.com/russross/blackfriday"

LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE.txt;md5=ecf8a8a60560c35a862a4a545f2db1b3"

DEPENDS += "github.com-shurcool-sanitized-anchor-name-native"

inherit go
inherit native
