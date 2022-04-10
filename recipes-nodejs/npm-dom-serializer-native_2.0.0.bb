SUMMARY = "NPM: dom-serializer"
DESCRIPTION = "render domhandler DOM nodes to a string"
HOMEPAGE = "https://github.com/cheeriojs/dom-serializer#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ba3390a22fe1d127f3522ac8ef1bd1a0"

DEPENDS = "npm-domelementtype-native \
           npm-domhandler-native \
           npm-entities-native"

SRC_URI = "https://registry.npmjs.org/dom-serializer/-/dom-serializer-2.0.0.tgz"
SRC_URI[md5sum] = "ef8d11d6bbc8d15c7999324aba579a96"
SRC_URI[sha256sum] = "e34511f144fc6b34ce536bd60fb1ed27dd965f07a7c317407e79dd6be9e8f399"

NPM_PKGNAME = "dom-serializer"

inherit npmhelper
inherit native
