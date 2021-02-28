SUMMARY = "Go (golang) package with 70+ configurable terminal spinner/progress indicators"
HOMEPAGE = "https://github.com/briandowns/spinner"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE;md5=5335066555b14d832335aa4660d6c376"

DEPENDS += "\
            github.com-fatih-color-native \
            "

SRC_URI = "git://${GO_IMPORT};protocol=https"
SRCREV = "db9a25053a700cbfa2b021429cd6146205028886"
GO_IMPORT = "github.com/briandowns/spinner"

export GO111MODULE = "auto"

inherit go
inherit native
