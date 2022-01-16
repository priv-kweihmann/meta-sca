SUMMARY = "NPM: qs"
DESCRIPTION = "A querystring parser that supports nesting and arrays, with a depth limit"
HOMEPAGE = "https://github.com/ljharb/qs"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=b289135779dd930509ae81e6041690c0"

DEPENDS = "npm-side-channel-native"

SRC_URI = "https://registry.npmjs.org/qs/-/qs-6.10.3.tgz"
SRC_URI[md5sum] = "1adb1a03a1a42fe3e41903a3a7c02325"
SRC_URI[sha256sum] = "a870fe3cc87d4bdbedc5dd3fb83ead68b4cc6b01bf790daab4a432c4ba841617"

NPM_PKGNAME = "qs"

inherit npmhelper
inherit native
