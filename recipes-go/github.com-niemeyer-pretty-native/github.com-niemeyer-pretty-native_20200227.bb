SUMMARY = "Pretty printing for Go values"
HOMEPAGE = "https://github.com/niemeyer/pretty"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/License;md5=449bfedd81a372635934cf9ce004c0cf"

DEPENDS += "github.com-kr-text-native"

SRC_URI = "git://${GO_IMPORT};protocol=https"
SRCREV = "a10e7caefd8e0d600cea437f5c3613aeb1553d56"
GO_IMPORT = "github.com/niemeyer/pretty"

UPSTREAM_CHECK_COMMITS = "1"

export GO111MODULE = "auto"

inherit go
inherit native
