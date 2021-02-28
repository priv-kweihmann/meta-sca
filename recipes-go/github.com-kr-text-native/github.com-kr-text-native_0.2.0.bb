SUMMARY = "Miscellaneous functions for formatting text "
HOMEPAGE = "https://github.com/kr/text"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/License;md5=449bfedd81a372635934cf9ce004c0cf"

DEPENDS += "github.com-kr-pty-native"

SRC_URI = "git://${GO_IMPORT};protocol=https;branch=main"
SRCREV = "702c74938df48b97370179f33ce2107bd7ff3b3e"
GO_IMPORT = "github.com/kr/text"

export GO111MODULE = "auto"

inherit go
inherit native
