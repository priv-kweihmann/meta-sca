SUMMARY = "NPM: dashdash"
DESCRIPTION = "A light, featureful and explicit option parsing library."
HOMEPAGE = "https://github.com/trentm/node-dashdash#readme"

DEPENDS = "npm-assert-plus-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=ebce61c1a0900d798daaf5853c69ce72"

SRC_URI = "https://registry.npmjs.org/dashdash/-/dashdash-1.14.1.tgz"
SRC_URI[md5sum] = "10e52530e0086914a59d498cb1637c7e"
SRC_URI[sha256sum] = "8b79ebde18aa8f10aba37e32dcecbe376023c79776510e06e9a53f5e68555340"

S = "${WORKDIR}/package"

NPM_PKGNAME = "dashdash"

inherit npmhelper
inherit native
