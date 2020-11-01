SUMMARY = "Package isatty implements interface to isatty"
HOMEPAGE = "https://github.com/mattn/go-isatty"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE;md5=f509beadd5a11227c27b5d2ad6c9f2c6"

DEPENDS += "golang.org-x-sys-native"

SRC_URI = "git://${GO_IMPORT};protocol=https"
SRCREV = "7b513a986450394f7bbf1476909911b3aa3a55ce"
GO_IMPORT = "github.com/mattn/go-isatty"

inherit gonative
inherit native
