SUMMARY = "static analysis tool to find unnecessary import aliases"
HOMEPAGE = "https://github.com/alexkohler/unimport"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/unimport/LICENSE;md5=2c7b8f9e174db37605a15c992b0dc995"

DEPENDS += "golang.org-x-tools-native"

PROVIDES += "github.com-alexkohler-unimport-native"

SRC_URI = "git://github.com/alexkohler/unimport.git;protocol=https;name=unimport;destsuffix=git/src/github.com/alexkohler/unimport"

SRCREV_unimport = "e6f2b2e2d406ad19518ce48d88278589d86b193d"
UPSTREAM_CHECK_COMMITS = "1"

S = "${WORKDIR}/git"

GO_IMPORT = "github.com/alexkohler"

inherit go
inherit native
