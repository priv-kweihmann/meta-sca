SUMMARY = "renameio provides a way to atomically create or replace a file or symbolic link"
HOMEPAGE = "https://github.com/google/renameio"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"

SRC_URI = "git://${GO_IMPORT};protocol=https"
SRCREV = "650fcb94ca4d72ea43b13887574f2cc8daf89d48"
GO_IMPORT = "github.com/google/renameio"
UPSTREAM_CHECK_COMMITS = "1"

export GO111MODULE = "auto"

inherit go
inherit native
