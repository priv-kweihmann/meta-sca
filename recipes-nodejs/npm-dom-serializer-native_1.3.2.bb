SUMMARY = "NPM: dom-serializer"
DESCRIPTION = "render domhandler DOM nodes to a string"
HOMEPAGE = "https://github.com/cheeriojs/dom-renderer#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ba3390a22fe1d127f3522ac8ef1bd1a0"

DEPENDS = "npm-domelementtype-native \
           npm-domhandler-native \
           npm-entities-native"

SRC_URI = "https://registry.npmjs.org/dom-serializer/-/dom-serializer-1.3.2.tgz"
SRC_URI[md5sum] = "beb389ea0e65742b73dc4dc798ea267b"
SRC_URI[sha256sum] = "771bf9bbb2a7a3e317417b554841128d76b60ec64b365445b7d68b4f44fcfff7"

NPM_PKGNAME = "dom-serializer"

inherit npmhelper
inherit native
