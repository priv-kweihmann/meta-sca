SUMMARY = "NPM: qs"
DESCRIPTION = "A querystring parser that supports nesting and arrays, with a depth limit"
HOMEPAGE = "https://github.com/ljharb/qs"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=b289135779dd930509ae81e6041690c0"

DEPENDS = "npm-side-channel-native"

SRC_URI = "https://registry.npmjs.org/qs/-/qs-6.10.2.tgz"
SRC_URI[md5sum] = "c6a5e65bfb1893f719af9cac09157cc0"
SRC_URI[sha256sum] = "02094e21dbd238fd54ade4e287b683c5518f19bc1519f542c6a3a1f38bbe5487"

NPM_PKGNAME = "qs"

inherit npmhelper
inherit native
