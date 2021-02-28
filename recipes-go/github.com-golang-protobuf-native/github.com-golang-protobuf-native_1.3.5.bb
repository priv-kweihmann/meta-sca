SUMMARY = "Go support for Google's protocol buffers "
HOMEPAGE = "https://github.com/golang/protobuf"

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE;md5=939cce1ec101726fa754e698ac871622"

SRC_URI = "git://${GO_IMPORT};protocol=https"
SRCREV = "84668698ea25b64748563aa20726db66a6b8d299"
GO_IMPORT = "github.com/golang/protobuf"

export GO111MODULE = "auto"

inherit go
inherit native
