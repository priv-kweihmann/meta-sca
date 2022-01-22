SUMMARY = "NPM: postcss-selector-parser"
DESCRIPTION = "> Selector parser with built in methods for working with selector strings."
HOMEPAGE = "https://github.com/postcss/postcss-selector-parser"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE-MIT;md5=5a9c687fbbd43eb51c08313a2cbbf60d"

DEPENDS = "npm-cssesc-native \
           npm-util-deprecate-native"

SRC_URI = "https://registry.npmjs.org/postcss-selector-parser/-/postcss-selector-parser-6.0.9.tgz"
SRC_URI[md5sum] = "d7b59265275109bc97376c3cae41c1b1"
SRC_URI[sha256sum] = "245aca4816c04abefc41acc182c3f4d532e490390185444fed82c3c70e0c0674"

NPM_PKGNAME = "postcss-selector-parser"

inherit npmhelper
inherit native
