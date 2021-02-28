SUMMARY = "static analysis tool to find typos in identifiers"
HOMEPAGE = "https://github.com/alexkohler/identypo"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/identypo/LICENSE;md5=55bfb4256a903d5c2d6be3e909894bef"

DEPENDS += "golang.org-x-tools-native"

PROVIDES += "github.com-alexkohler-identypo-native"

SRC_URI = "git://github.com/alexkohler/identypo.git;protocol=https;name=identypo;destsuffix=git/src/github.com/alexkohler/identypo"

SRCREV_identypo = "dcb8a79840450edb48a29a1621321101510b338e"
UPSTREAM_CHECK_COMMITS = "1"

S = "${WORKDIR}/git"

GO_IMPORT = "github.com/alexkohler"

export GO111MODULE = "auto"

inherit go
inherit native
