SUMMARY = "Blackfriday: a markdown processor for Go"
HOMEPAGE = "https://github.com/russross/blackfriday"

LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE.txt;md5=ecf8a8a60560c35a862a4a545f2db1b3"

DEPENDS += "github.com-shurcool-sanitized-anchor-name-native"

SRC_URI = "git://${GO_IMPORT};protocol=https;branch=v2"
SRCREV = "d3b5b032dc8e8927d31a5071b56e14c89f045135"
GO_IMPORT = "github.com/russross/blackfriday"

export GO111MODULE = "auto"

inherit go
inherit native
