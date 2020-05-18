SUMMARY = "NPM: side-channel"
DESCRIPTION = "Store information about any JS value in a side channel. Uses WeakMap if available."
HOMEPAGE = "https://github.com/ljharb/side-channel#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=375dc7ca936a14e9c29418d5263bd066"

DEPENDS = "npm-es-abstract-native \
           npm-object-inspect-native"

SRC_URI = "https://registry.npmjs.org/side-channel/-/side-channel-1.0.2.tgz"
SRC_URI[md5sum] = "261254c1cda27a8df3d4609999b1e5bf"
SRC_URI[sha256sum] = "be803057b3f6f3794d3ca92856a8f5d996d0f2fe59593e863aeda78a468077e5"

NPM_PKGNAME = "side-channel"

inherit npmhelper
inherit native
