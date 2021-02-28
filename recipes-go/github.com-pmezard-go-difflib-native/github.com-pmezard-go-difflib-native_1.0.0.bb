SUMMARY = "Partial port of Python difflib package to Go"
HOMEPAGE = "https://github.com/pmezard/go-difflib"

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE;md5=e9a2ebb8de779a07500ddecca806145e"

SRC_URI = "git://${GO_IMPORT};protocol=https"
SRCREV = "792786c7400a136282c1664665ae0a8db921c6c2"
GO_IMPORT = "github.com/pmezard/go-difflib"

export GO111MODULE = "auto"

inherit go
inherit native
