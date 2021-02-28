SUMMARY = "Implements the wildcard file matching in Go"
HOMEPAGE = "https://github.com/mgechev/dots"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE;md5=6898b1ee52bce3bd296aba3dff3fffb0"

SRC_URI = "git://${GO_IMPORT};protocol=https"
SRCREV = "c36f7dcfbb81d2220bbddabf29c757c861c3e4d8"
UPSTREAM_CHECK_COMMITS = "1"

GO_IMPORT = "github.com/mgechev/dots"

export GO111MODULE = "auto"

inherit go
inherit native
