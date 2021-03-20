SUMMARY = "NPM: qs"
DESCRIPTION = "A querystring parser that supports nesting and arrays, with a depth limit"
HOMEPAGE = "https://github.com/ljharb/qs"

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=b289135779dd930509ae81e6041690c0"

DEPENDS = "npm-side-channel-native"

SRC_URI = "https://registry.npmjs.org/qs/-/qs-6.10.0.tgz"
SRC_URI[md5sum] = "669953eb8100f251803ce0272b607bf1"
SRC_URI[sha256sum] = "770e1ac102e7f310384d1637482380e5a25431cd5d155ad4cd883cf9b42ea962"

NPM_PKGNAME = "qs"

inherit npmhelper
inherit native
