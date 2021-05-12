SUMMARY = "NPM: postcss-selector-parser"
DESCRIPTION = "> Selector parser with built in methods for working with selector strings."
HOMEPAGE = "https://github.com/postcss/postcss-selector-parser"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE-MIT;md5=5a9c687fbbd43eb51c08313a2cbbf60d"

DEPENDS = "npm-cssesc-native \
           npm-util-deprecate-native"

SRC_URI = "https://registry.npmjs.org/postcss-selector-parser/-/postcss-selector-parser-6.0.6.tgz"
SRC_URI[md5sum] = "32c6837ad0d32bc8059180498340cd03"
SRC_URI[sha256sum] = "a540bb9661b1fb0da58618a34cdff2711306874b91556bcb5055f5d9b7d6a2aa"

NPM_PKGNAME = "postcss-selector-parser"

inherit npmhelper
inherit native
