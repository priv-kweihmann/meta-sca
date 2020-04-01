SUMMARY = "Go support for Google's protocol buffers "
HOMEPAGE = "https://github.com/golang/protobuf"

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE;md5=939cce1ec101726fa754e698ac871622"

SRC_URI = "git://${GO_IMPORT};protocol=https;tag=v${PV}"
GO_IMPORT = "github.com/golang/protobuf"

inherit go
inherit native
