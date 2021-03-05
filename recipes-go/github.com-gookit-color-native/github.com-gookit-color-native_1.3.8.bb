SUMMARY = "Terminal color rendering tool library"
HOMEPAGE = "https://github.com/gookit/color"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE;md5=e3aad5860068665df2e421afed153e7d"

DEPENDS += "github.com-stretchr-native"

SRC_URI = "git://${GO_IMPORT};protocol=https"
SRCREV = "d701117ae5e94935dfe8e3725348fe637208a0a4"
GO_IMPORT = "github.com/gookit/color"

export GO111MODULE = "auto"

inherit go
inherit native
