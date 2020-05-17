SUMMARY = "NPM: postcss-selector-parser"
DESCRIPTION = "> Selector parser with built in methods for working with selector strings."
HOMEPAGE = "https://github.com/postcss/postcss-selector-parser"

DEPENDS = "npm-cssesc-native npm-indexes-of-native npm-uniq-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE-MIT;md5=5a9c687fbbd43eb51c08313a2cbbf60d"

SRC_URI = "https://registry.npmjs.org/postcss-selector-parser/-/postcss-selector-parser-6.0.2.tgz"
SRC_URI[md5sum] = "311f65c1c7555e2fbcf3664e1b947f8c"
SRC_URI[sha256sum] = "588ffb4811e9818a0501ccf6904ffc9eeebb3f4660d91e666667b5015ceb557e"

NPM_PKGNAME = "postcss-selector-parser"

inherit npmhelper
inherit native
