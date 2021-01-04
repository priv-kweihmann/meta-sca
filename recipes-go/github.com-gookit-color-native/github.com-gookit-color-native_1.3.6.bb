SUMMARY = "Terminal color rendering tool library"
HOMEPAGE = "https://github.com/gookit/color"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE;md5=e3aad5860068665df2e421afed153e7d"

DEPENDS += "github.com-stretchr-native"

SRC_URI = "git://${GO_IMPORT};protocol=https"
SRCREV = "1ffb69594b42ab99ee2405c3151cbb70d199a403"
GO_IMPORT = "github.com/gookit/color"

inherit go
inherit native
