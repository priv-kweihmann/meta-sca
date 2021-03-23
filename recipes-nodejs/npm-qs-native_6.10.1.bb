SUMMARY = "NPM: qs"
DESCRIPTION = "A querystring parser that supports nesting and arrays, with a depth limit"
HOMEPAGE = "https://github.com/ljharb/qs"

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=b289135779dd930509ae81e6041690c0"

DEPENDS = "npm-side-channel-native"

SRC_URI = "https://registry.npmjs.org/qs/-/qs-6.10.1.tgz"
SRC_URI[md5sum] = "cc3c3da7e8c180084ea48c5b7d21b441"
SRC_URI[sha256sum] = "48ff71ae029bdc028e6b26955edf93d811a212d46c8ed4d0d5454c18182a889a"

NPM_PKGNAME = "qs"

inherit npmhelper
inherit native
