SUMMARY = "NPM: structured-source"
DESCRIPTION = "Provides StructuredSource and functionality for converting range and loc vice versa."
HOMEPAGE = "https://github.com/Constellation/structured-source"

DEPENDS = "npm-boundary-native"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://README.md;beginline=44;md5=9c6942b190be713b724358bcd4f8a08c"

SRC_URI = "https://registry.npmjs.org/structured-source/-/structured-source-3.0.2.tgz"
SRC_URI[md5sum] = "f26635a6e2d0e7b993bc505b7b97a141"
SRC_URI[sha256sum] = "99de3d1e57df3d1e14670aaa002b86d08ab8285bac94f1d84bce31d616acd3d4"

NPM_PKGNAME = "structured-source"

inherit npmhelper
inherit native
