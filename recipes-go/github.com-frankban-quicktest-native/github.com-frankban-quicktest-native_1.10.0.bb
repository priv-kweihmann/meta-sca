SUMMARY = "Quick helpers for testing Go applications"
HOMEPAGE = "https://github.com/frankban/quicktest"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE;md5=98bdc79edcf073ecd345d44297905708"

DEPENDS += "\
            github.com-google-go-cmp-native \
            github.com-kr-pretty-native \
           "

SRC_URI = "git://${GO_IMPORT};protocol=https"
SRCREV = "bba1b8fe60c1fc2a990912fbb63c3751d744d364"
GO_IMPORT = "github.com/frankban/quicktest"

inherit go
inherit native
