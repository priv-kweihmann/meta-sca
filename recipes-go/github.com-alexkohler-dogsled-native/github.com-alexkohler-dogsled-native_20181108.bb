SUMMARY = "analysis tool to find assignments/declarations with too many blank identifiers"
HOMEPAGE = "https://github.com/alexkohler/dogsled"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/dogsled/LICENSE;md5=55bfb4256a903d5c2d6be3e909894bef"

DEPENDS += "golang.org-x-tools-native"

PROVIDES += "github.com-alexkohler-dogsled-native"

SRC_URI = "git://github.com/alexkohler/dogsled.git;protocol=https;name=dogsled;destsuffix=git/src/github.com/alexkohler/dogsled"

SRCREV_dogsled = "dad318941ed237414e932c0bd27a2431aa85fcce"
UPSTREAM_CHECK_COMMITS = "1"

S = "${WORKDIR}/git"

GO_IMPORT = "github.com/alexkohler"

inherit go
inherit native
