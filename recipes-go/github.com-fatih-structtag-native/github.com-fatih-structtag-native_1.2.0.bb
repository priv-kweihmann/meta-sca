SUMMARY = "Parse and modify Go struct field tags"
HOMEPAGE = "https://github.com/fatih/structtag"

SRC_URI = "git://${GO_IMPORT};protocol=https;tag=v${PV}"
GO_IMPORT = "github.com/fatih/structtag"

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM  = "file://src/${GO_IMPORT}/LICENSE;md5=7cd9e46c722ee0e2532709c7ab80abaf"

inherit go
inherit native
