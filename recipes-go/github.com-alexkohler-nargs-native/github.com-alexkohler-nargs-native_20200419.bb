SUMMARY = "static analysis tool to find unused arguments in function declarations"
HOMEPAGE = "https://github.com/alexkohler/nargs"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/nargs/LICENSE;md5=2c7b8f9e174db37605a15c992b0dc995"

DEPENDS += "golang.org-x-tools-native"

PROVIDES += "github.com-alexkohler-nargs-native"

SRC_URI = "git://github.com/alexkohler/nargs.git;protocol=https;name=nargs;destsuffix=git/src/github.com/alexkohler/nargs"

SRCREV_nargs = "2df8ecd3c73af2773001eecc944ade39423cad46"
UPSTREAM_CHECK_COMMITS = "1"

S = "${WORKDIR}/git"

GO_IMPORT = "github.com/alexkohler"

inherit go
inherit native
