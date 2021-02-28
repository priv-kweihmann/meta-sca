SUMMARY = "static analysis tool to find naked returns in greater than specified"
HOMEPAGE = "https://github.com/alexkohler/nakedret"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/nakedret/LICENSE;md5=2c7b8f9e174db37605a15c992b0dc995"

DEPENDS += "golang.org-x-tools-native"

PROVIDES += "github.com-alexkohler-nakedret-native"

SRC_URI = "git://github.com/alexkohler/nakedret.git;protocol=https;name=nakedret;destsuffix=git/src/github.com/alexkohler/nakedret"

SRCREV_nakedret = "23a393d620693bbf94814ea548dca127dfad4611"
UPSTREAM_CHECK_COMMITS = "1"

S = "${WORKDIR}/git"

GO_IMPORT = "github.com/alexkohler"

export GO111MODULE = "auto"

inherit go
inherit native
