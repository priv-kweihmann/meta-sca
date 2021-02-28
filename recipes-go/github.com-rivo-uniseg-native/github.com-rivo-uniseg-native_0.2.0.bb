SUMMARY = "Unicode Text Segmentation for Go"
HOMEPAGE = "https://github.com/rivo/uniseg"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE.txt;md5=4393c339bf180cf6e188b6ea32d8b93c"

SRC_URI = "git://${GO_IMPORT};protocol=https"
SRCREV = "75711fccf6a3e85bc74c241e2dddd06a9bc9e53d"
GO_IMPORT = "github.com/rivo/uniseg"

export GO111MODULE = "auto"

inherit go
inherit native
