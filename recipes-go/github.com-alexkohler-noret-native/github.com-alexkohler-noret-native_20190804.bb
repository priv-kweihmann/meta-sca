SUMMARY = "static analysis tool to find unused arguments in function declarations"
HOMEPAGE = "https://github.com/alexkohler/noret"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/noret/LICENSE;md5=2c7b8f9e174db37605a15c992b0dc995"

DEPENDS += "golang.org-x-tools-native"

PROVIDES += "github.com-alexkohler-noret-native"

SRC_URI = "git://github.com/alexkohler/noret.git;protocol=https;name=noret;destsuffix=git/src/github.com/alexkohler/noret"

SRCREV_noret = "57c4d447ca7ab711a3b2aaf28d1d9f8dbe34fab6"
UPSTREAM_CHECK_COMMITS = "1"

S = "${WORKDIR}/git"

GO_IMPORT = "github.com/alexkohler"

export GO111MODULE = "auto"

inherit go
inherit native
