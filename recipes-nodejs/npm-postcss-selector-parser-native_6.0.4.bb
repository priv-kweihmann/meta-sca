SUMMARY = "NPM: postcss-selector-parser"
DESCRIPTION = "> Selector parser with built in methods for working with selector strings."
HOMEPAGE = "https://github.com/postcss/postcss-selector-parser"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE-MIT;md5=5a9c687fbbd43eb51c08313a2cbbf60d"

DEPENDS = "npm-cssesc-native \
           npm-indexes-of-native \
           npm-uniq-native \
           npm-util-deprecate-native"

SRC_URI = "https://registry.npmjs.org/postcss-selector-parser/-/postcss-selector-parser-6.0.4.tgz"
SRC_URI[md5sum] = "d4116226ae954fcef829f04373477a2b"
SRC_URI[sha256sum] = "9c26a47a587c6daeb04e21783b1fe4ecbc6c4bfcc321edbc96fd8c3514635fef"

NPM_PKGNAME = "postcss-selector-parser"

inherit npmhelper
inherit native
