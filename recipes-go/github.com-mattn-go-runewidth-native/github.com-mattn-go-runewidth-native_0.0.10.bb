SUMMARY = "wcwidth for golang"
HOMEPAGE = "https://github.com/mattn/go-runewidth"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE;md5=24ce168f90aec2456a73de1839037245"

DEPENDS += "github.com-rivo-uniseg-native"

SRC_URI = "git://${GO_IMPORT};protocol=https"
SRCREV = "59616a248b91ae20bf3eb93636a24c87d9ce6cea"
GO_IMPORT = "github.com/mattn/go-runewidth"

export GO111MODULE = "auto"

inherit go
inherit native
