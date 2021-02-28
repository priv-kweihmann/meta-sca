SUMMARY = "static analysis tool to find slice declarations that could potentially be preallocated"
HOMEPAGE = "https://github.com/alexkohler/prealloc"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/prealloc/LICENSE;md5=2c7b8f9e174db37605a15c992b0dc995"

DEPENDS += "golang.org-x-tools-native"

PROVIDES += "github.com-alexkohler-prealloc-native"

SRC_URI = "git://github.com/alexkohler/prealloc.git;protocol=https;name=prealloc;destsuffix=git/src/github.com/alexkohler/prealloc"

SRCREV_prealloc = "50faa068e0172b77dc8a97739d943001b00c3d4b"
UPSTREAM_CHECK_COMMITS = "1"

S = "${WORKDIR}/git"

GO_IMPORT = "github.com/alexkohler"

export GO111MODULE = "auto"

inherit go
inherit native
