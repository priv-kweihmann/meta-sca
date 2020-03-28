SUMMARY = "Miscellaneous functions for formatting text "
HOMEPAGE = "https://github.com/kr/text"

SRC_URI = "git://${GO_IMPORT};protocol=https;tag=v${PV};nobranch=1"
GO_IMPORT = "github.com/kr/text"

LICENSE = "MIT"
LIC_FILES_CHKSUM  = "file://src/${GO_IMPORT}/License;md5=449bfedd81a372635934cf9ce004c0cf"

DEPENDS += "github.com-kr-pty-native"

inherit go
inherit native
