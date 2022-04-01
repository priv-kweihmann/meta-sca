SUMMARY = "NPM: postcss-selector-parser"
DESCRIPTION = "> Selector parser with built in methods for working with selector strings."
HOMEPAGE = "https://github.com/postcss/postcss-selector-parser"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE-MIT;md5=5a9c687fbbd43eb51c08313a2cbbf60d"

DEPENDS = "npm-cssesc-native \
           npm-util-deprecate-native"

SRC_URI = "https://registry.npmjs.org/postcss-selector-parser/-/postcss-selector-parser-6.0.10.tgz"
SRC_URI[md5sum] = "5ba9498cd9f72ead215197bc71ca605f"
SRC_URI[sha256sum] = "f6520bf5428cb673de03644374e8bb18c0cabe3cdbb05fe9b791864b49fd6104"

NPM_PKGNAME = "postcss-selector-parser"

inherit npmhelper
inherit native
