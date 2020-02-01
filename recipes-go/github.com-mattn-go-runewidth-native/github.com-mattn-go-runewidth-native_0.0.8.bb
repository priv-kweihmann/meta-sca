SUMMARY = "wcwidth for golang"
HOMEPAGE = "https://github.com/mattn/go-runewidth"

SRC_URI = "git://${GO_IMPORT};protocol=https;tag=v${PV}"
GO_IMPORT = "github.com/mattn/go-runewidth"

LICENSE = "MIT"
LIC_FILES_CHKSUM  = "file://src/${GO_IMPORT}/LICENSE;md5=24ce168f90aec2456a73de1839037245"

inherit go
inherit native