SUMMARY = "NPM: is-arguments"
DESCRIPTION = "Is this an arguments object? It's a harder question than you think."
HOMEPAGE = "https://github.com/inspect-js/is-arguments"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d22b3eb619d81197fd4f3ca47c2c1ea5"

DEPENDS = "npm-call-bind-native \
           npm-has-tostringtag-native"

SRC_URI = "https://registry.npmjs.org/is-arguments/-/is-arguments-1.1.1.tgz"
SRC_URI[md5sum] = "d40e4542c611a965f9b867e0eb9b5a99"
SRC_URI[sha256sum] = "22037916d1c9ade7067f00c7dc750e73775d18276d556f79707e1ba80296fadf"

NPM_PKGNAME = "is-arguments"

inherit npmhelper
inherit native
