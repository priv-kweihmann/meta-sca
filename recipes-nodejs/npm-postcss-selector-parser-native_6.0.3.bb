SUMMARY = "NPM: postcss-selector-parser"
DESCRIPTION = "> Selector parser with built in methods for working with selector strings."
HOMEPAGE = "https://github.com/postcss/postcss-selector-parser"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE-MIT;md5=5a9c687fbbd43eb51c08313a2cbbf60d"

DEPENDS = "npm-cssesc-native \
           npm-indexes-of-native \
           npm-uniq-native \
           npm-util-deprecate-native"

SRC_URI = "https://registry.npmjs.org/postcss-selector-parser/-/postcss-selector-parser-6.0.3.tgz"
SRC_URI[md5sum] = "f5d2caf268b1312e9d526a7edb810e48"
SRC_URI[sha256sum] = "b54b35927740d0b7fcee99d298da0092890f5e0055743a9bbf82808705b9c46f"

NPM_PKGNAME = "postcss-selector-parser"

inherit npmhelper
inherit native
