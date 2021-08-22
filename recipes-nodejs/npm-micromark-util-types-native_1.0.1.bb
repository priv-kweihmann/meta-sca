SUMMARY = "NPM: micromark-util-types"
DESCRIPTION = "micromark utility with a couple of typescript types"
HOMEPAGE = "https://github.com/micromark/micromark/tree/main#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://readme.md;beginline=63;endline=64;md5=511f6768a0948d45e6ce0015231af805"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/micromark-util-types/-/micromark-util-types-1.0.1.tgz"
SRC_URI[md5sum] = "52359600fc76ffc5bdebe534b3020b34"
SRC_URI[sha256sum] = "9b73a1954559b8331ac8c59135d181c38785749f3840db306be077b6dd173a36"

NPM_PKGNAME = "micromark-util-types"

inherit npmhelper
inherit native
