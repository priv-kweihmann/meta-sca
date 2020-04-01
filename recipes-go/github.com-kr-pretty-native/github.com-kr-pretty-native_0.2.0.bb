SUMMARY = "Pretty printing for Go values"
HOMEPAGE = "https://github.com/kr/pretty"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/License;md5=449bfedd81a372635934cf9ce004c0cf"

DEPENDS += "github.com-kr-text-native"

SRC_URI = "git://${GO_IMPORT};protocol=https;tag=v${PV};nobranch=1"
GO_IMPORT = "github.com/kr/pretty"

UPSTREAM_CHECK_GITTAGREGEX = "(?P<pver>\d+\.\d+\.\d+)"

inherit go
inherit native
