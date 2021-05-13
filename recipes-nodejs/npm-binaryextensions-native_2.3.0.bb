SUMMARY = "NPM: binaryextensions"
DESCRIPTION = "A package that contains an array of every single file extension there is for binary files"
HOMEPAGE = "https://github.com/bevry/binaryextensions"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=10f8378cf9409df9bd8015af40a24b59"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/binaryextensions/-/binaryextensions-2.3.0.tgz"
SRC_URI[md5sum] = "e98e47b133d3ee7bf3cc89a11fc4f563"
SRC_URI[sha256sum] = "49942de2c863e393408583a6960603bbe57bad948db5e1637a31b7c047ca288f"

NPM_PKGNAME = "binaryextensions"

inherit npmhelper
inherit native
