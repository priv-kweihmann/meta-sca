SUMMARY = "in-memory B-Tree implementation for Go"
HOMEPAGE = "https://github.com/google/btree"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"

SRC_URI = "git://${GO_IMPORT};protocol=https"
SRCREV = "479b5e81b0a93ec038d201b0b33d17db599531d3"
GO_IMPORT = "github.com/google/btree"

export GO111MODULE = "auto"

inherit go
inherit native
