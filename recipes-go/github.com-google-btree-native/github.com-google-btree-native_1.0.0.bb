SUMMARY = "in-memory B-Tree implementation for Go"
HOMEPAGE = "https://github.com/google/btree"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"

SRC_URI = "git://${GO_IMPORT};protocol=https"
SRCREV = "4030bb1f1f0c35b30ca7009e9ebd06849dd45306"
GO_IMPORT = "github.com/google/btree"

export GO111MODULE = "auto"

inherit go
inherit native
