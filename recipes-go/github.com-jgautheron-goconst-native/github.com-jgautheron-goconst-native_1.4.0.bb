SUMMARY = "Find repeated strings that could be replaced by a constant"
HOMEPAGE = "https://github.com/jgautheron/goconst"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE;md5=33b2be59a3a3c31e4b98ba1acce08fcb"

SRC_URI = "git://${GO_IMPORT};protocol=https"
SRCREV = "ccae5bf973f32a5eea387c584efb0d526fcbcfe0"
GO_IMPORT = "github.com/jgautheron/goconst"

UPSTREAM_CHECK_GITTAGREGEX = "(?P<pver>\d+\.\d+\.\d+)"

export GO111MODULE = "auto"

inherit go
inherit native
