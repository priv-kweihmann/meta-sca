SUMMARY = "NPM: is-negative-zero"
DESCRIPTION = "Is this value negative zero? === will lie to you"
HOMEPAGE = "https://github.com/inspect-js/is-negative-zero"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d22b3eb619d81197fd4f3ca47c2c1ea5"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/is-negative-zero/-/is-negative-zero-2.0.1.tgz"
SRC_URI[md5sum] = "6b8c5c27af41a0249eadea4e97565460"
SRC_URI[sha256sum] = "d6dd7345d55c08f6d34ffe7939608af93ae51c0ca94d59de41311b29691e6c33"

NPM_PKGNAME = "is-negative-zero"

inherit npmhelper
inherit native
