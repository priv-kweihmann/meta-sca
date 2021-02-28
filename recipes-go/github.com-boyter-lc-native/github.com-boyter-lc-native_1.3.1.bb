SUMMARY = "command line application which identifies what software license things are under"
DESCRIPTION = "licensechecker (lc) a command line application which scans directories and identifies what \
               software license things are under producing reports as either \
               SPDX, CSV, JSON, XLSX or CLI Tabular output."
HOMEPAGE = "https://github.com/boyter/lc"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE;md5=c80dc78b1efbb79817c0b2699aa1b357"

DEPENDS += "\
            github.com-boyter-golangvectorspace-native \
            github.com-briandowns-spinner-native \
            github.com-ryanuber-columnize-native \
            github.com-tealeg-xlsx-native \
            github.com-urfave-cli-native \
            "

SRC_URI = "git://${GO_IMPORT};protocol=https"
SRCREV = "73ca74a348258c5d9931b667a337e2a72490a251"
GO_IMPORT = "github.com/boyter/lc"

export GO111MODULE = "auto"

inherit go
inherit native
