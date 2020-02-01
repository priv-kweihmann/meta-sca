SUMMARY = "Package isatty implements interface to isatty"
HOMEPAGE = "https://github.com/mattn/go-isatty"

SRC_URI = "git://${GO_IMPORT};protocol=https;tag=v${PV}"
GO_IMPORT = "github.com/mattn/go-isatty"

LICENSE = "MIT"
LIC_FILES_CHKSUM  = "file://src/${GO_IMPORT}/LICENSE;md5=f509beadd5a11227c27b5d2ad6c9f2c6"

DEPENDS += "golang.org-x-sys-native"

inherit go
inherit native