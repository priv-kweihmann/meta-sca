SUMMARY = "renameio provides a way to atomically create or replace a file or symbolic link"
HOMEPAGE = "https://github.com/google/renameio"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"

SRC_URI = "git://${GO_IMPORT};protocol=https"
SRCREV = "f443b9c3eaac3f33393534475e34888ddc253eb9"
GO_IMPORT = "github.com/google/renameio"
UPSTREAM_CHECK_COMMITS = "1"

inherit go
inherit native
