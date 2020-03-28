SUMMARY = "Partial port of Python difflib package to Go"
HOMEPAGE = "https://github.com/pmezard/go-difflib"

SRC_URI = "git://${GO_IMPORT};protocol=https;tag=v${PV}"
GO_IMPORT = "github.com/pmezard/go-difflib"

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM  = "file://src/${GO_IMPORT}/LICENSE;md5=e9a2ebb8de779a07500ddecca806145e"

inherit go
inherit native
