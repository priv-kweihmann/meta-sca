SUMMARY = "Quick helpers for testing Go applications"
HOMEPAGE = "https://github.com/frankban/quicktest"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE;md5=98bdc79edcf073ecd345d44297905708"

DEPENDS += "\
            github.com-google-go-cmp-native \
            github.com-kr-pretty-native \
           "

SRC_URI = "git://${GO_IMPORT};protocol=https"
SRCREV = "e7d1f0b53af1e9c9cf66924bc310190b1db8c339"
GO_IMPORT = "github.com/frankban/quicktest"

export GO111MODULE = "auto"

inherit go
inherit native
