SUMMARY = "NPM: dashdash"
DESCRIPTION = "A light, featureful and explicit option parsing library."
HOMEPAGE = "https://github.com/trentm/node-dashdash#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=ebce61c1a0900d798daaf5853c69ce72"

DEPENDS = "npm-assert-plus-native"

SRC_URI = "https://registry.npmjs.org/dashdash/-/dashdash-2.0.0.tgz"
SRC_URI[md5sum] = "7a2d0c99fb81dac02c8633e294885b29"
SRC_URI[sha256sum] = "e187abf4a88ffe570d631c24e5b08bf2119fa9f9cd34697f923d12c71dd6cacc"

NPM_PKGNAME = "dashdash"

inherit npmhelper
inherit native
