SUMMARY = "package colorable"
HOMEPAGE = "https://github.com/mattn/go-colorable"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE;md5=24ce168f90aec2456a73de1839037245"

DEPENDS += "github.com-mattn-go-isatty-native"

SRC_URI = "git://${GO_IMPORT};protocol=https"
SRCREV = "68e95eba382c972aafde02ead2cd2426a8a92480"
GO_IMPORT = "github.com/mattn/go-colorable"

inherit go
inherit native
