SUMMARY = "Terminal color rendering tool library"
HOMEPAGE = "https://github.com/gookit/color"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE;md5=e3aad5860068665df2e421afed153e7d"

DEPENDS += "github.com-stretchr-native"

SRC_URI = "git://${GO_IMPORT};protocol=https"
SRCREV = "2904452e9755b471732cbd17631946a932e951f7"
GO_IMPORT = "github.com/gookit/color"

inherit gonative
inherit native
