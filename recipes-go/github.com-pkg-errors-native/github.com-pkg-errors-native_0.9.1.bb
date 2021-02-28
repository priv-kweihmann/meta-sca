SUMMARY = "Simple error handling primitives"
HOMEPAGE = "https://github.com/pkg/errors"

LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE;md5=6fe682a02df52c6653f33bd0f7126b5a"

SRC_URI = "git://${GO_IMPORT};protocol=https"
SRCREV = "614d223910a179a466c1767a985424175c39b465"
GO_IMPORT = "github.com/pkg/errors"

export GO111MODULE = "auto"

inherit go
inherit native
