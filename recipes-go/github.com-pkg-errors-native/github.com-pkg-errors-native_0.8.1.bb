SUMMARY = "Simple error handling primitives"
HOMEPAGE = "https://github.com/pkg/errors"

SRC_URI = "git://${GO_IMPORT};protocol=https;tag=v${PV}"
GO_IMPORT = "github.com/pkg/errors"

LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM  = "file://src/${GO_IMPORT}/LICENSE;md5=6fe682a02df52c6653f33bd0f7126b5a"

inherit go
inherit native