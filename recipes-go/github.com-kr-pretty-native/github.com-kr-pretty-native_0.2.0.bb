SUMMARY = "Pretty printing for Go values"
HOMEPAGE = "https://github.com/kr/pretty"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/License;md5=449bfedd81a372635934cf9ce004c0cf"

DEPENDS += "github.com-kr-text-native"

SRC_URI = "git://${GO_IMPORT};protocol=https;branch=main"
SRCREV = "4e0886370c3a67530192c6a238cff68f56c141b0"
GO_IMPORT = "github.com/kr/pretty"

UPSTREAM_CHECK_GITTAGREGEX = "(?P<pver>\d+\.\d+\.\d+)"

inherit go
inherit native
