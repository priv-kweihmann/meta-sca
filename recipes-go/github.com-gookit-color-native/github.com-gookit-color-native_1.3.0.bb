SUMMARY = "Terminal color rendering tool library"
HOMEPAGE = "https://github.com/gookit/color"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE;md5=e3aad5860068665df2e421afed153e7d"

DEPENDS += "github.com-stretchr-native"

SRC_URI = "git://${GO_IMPORT};protocol=https"
SRCREV = "03a3efcb50655d3aaf551a88ca70ab76c865d65b"
GO_IMPORT = "github.com/gookit/color"

inherit go
inherit native
