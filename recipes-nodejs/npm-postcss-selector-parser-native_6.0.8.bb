SUMMARY = "NPM: postcss-selector-parser"
DESCRIPTION = "> Selector parser with built in methods for working with selector strings."
HOMEPAGE = "https://github.com/postcss/postcss-selector-parser"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE-MIT;md5=5a9c687fbbd43eb51c08313a2cbbf60d"

DEPENDS = "npm-cssesc-native \
           npm-util-deprecate-native"

SRC_URI = "https://registry.npmjs.org/postcss-selector-parser/-/postcss-selector-parser-6.0.8.tgz"
SRC_URI[md5sum] = "58e53b9463126683d9f90214cb98c770"
SRC_URI[sha256sum] = "34c1db695d05173b5d798f333e84db86223b2d6b949f188a81e5b671143d5fa4"

NPM_PKGNAME = "postcss-selector-parser"

inherit npmhelper
inherit native
