SUMMARY = "licensechecker (lc) a command line application which scans directories and identifies what software license things are under"
HOMEPAGE = "https://github.com/boyter/lc"

SRC_URI = "git://${GO_IMPORT};protocol=https;tag=v${PV}"
GO_IMPORT = "github.com/boyter/lc"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE;md5=c80dc78b1efbb79817c0b2699aa1b357"

DEPENDS += "\
            github.com-boyter-golangvectorspace-native \
            github.com-briandowns-spinner-native \
            github.com-ryanuber-columnize-native \
            github.com-tealeg-xlsx-native \
            github.com-urfave-cli-native \
            "

inherit go
inherit native
