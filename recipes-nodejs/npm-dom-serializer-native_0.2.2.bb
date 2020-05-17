SUMMARY = "NPM: dom-serializer"
DESCRIPTION = "render dom nodes to string"
HOMEPAGE = "https://github.com/cheeriojs/dom-renderer#readme"

DEPENDS = "npm-domelementtype-native npm-entities-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ba3390a22fe1d127f3522ac8ef1bd1a0"

SRC_URI = "https://registry.npmjs.org/dom-serializer/-/dom-serializer-0.2.2.tgz"
SRC_URI[md5sum] = "8586fc54a1a933255123cfe381cda2c8"
SRC_URI[sha256sum] = "ae42aa8ddcbb8b03edaee3d2198bc12e4741d865598ef564053496b03ce0edc8"

S = "${WORKDIR}/package"

NPM_PKGNAME = "dom-serializer"

inherit npmhelper
inherit native
