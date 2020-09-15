SUMMARY = "NPM: dom-serializer"
DESCRIPTION = "render dom nodes to string"
HOMEPAGE = "https://github.com/cheeriojs/dom-renderer#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ba3390a22fe1d127f3522ac8ef1bd1a0"

DEPENDS = "npm-domelementtype-native \
           npm-domhandler-native \
           npm-entities-native"

SRC_URI = "https://registry.npmjs.org/dom-serializer/-/dom-serializer-1.1.0.tgz"
SRC_URI[md5sum] = "4905a8d884576a293d1db2cb7f1c3ae5"
SRC_URI[sha256sum] = "cd8fcb9336fdc49cf3660c29978eed5b627522f93aa138b8d9715bfb2c4be935"

NPM_PKGNAME = "dom-serializer"

inherit npmhelper
inherit native
