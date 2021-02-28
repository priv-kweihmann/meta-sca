SUMMARY = "Pretty printing for Go values"
HOMEPAGE = "https://github.com/kr/pretty"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/License;md5=449bfedd81a372635934cf9ce004c0cf"

DEPENDS += "github.com-kr-text-native"

SRC_URI = "git://${GO_IMPORT};protocol=https;branch=main"
SRCREV = "ead452280cd055b2ae8a7f0db5eb37a878d902f7"
GO_IMPORT = "github.com/kr/pretty"

UPSTREAM_CHECK_GITTAGREGEX = "(?P<pver>\d+\.\d+\.\d+)"

export GO111MODULE = "auto"

inherit go
inherit native
