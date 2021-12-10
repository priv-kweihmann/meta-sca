SUMMARY = "NPM: postcss-selector-parser"
DESCRIPTION = "> Selector parser with built in methods for working with selector strings."
HOMEPAGE = "https://github.com/postcss/postcss-selector-parser"
DEFAULT_PREFERENCE = "-1"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE-MIT;md5=5a9c687fbbd43eb51c08313a2cbbf60d"

DEPENDS = "npm-cssesc-native \
           npm-util-deprecate-native"

SRC_URI = "https://registry.npmjs.org/postcss-selector-parser/-/postcss-selector-parser-6.0.7.tgz"
SRC_URI[md5sum] = "31a9e18d1585d59463f985dad023d31a"
SRC_URI[sha256sum] = "73393ada7b95b43503b96548c5112966aebdb9319b8a7f1e5e9a76e1cb8a7b5a"

NPM_PKGNAME = "postcss-selector-parser"

inherit npmhelper
inherit native
