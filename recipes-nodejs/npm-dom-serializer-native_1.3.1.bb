SUMMARY = "NPM: dom-serializer"
DESCRIPTION = "render dom nodes to string"
HOMEPAGE = "https://github.com/cheeriojs/dom-renderer#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ba3390a22fe1d127f3522ac8ef1bd1a0"

DEPENDS = "npm-domelementtype-native \
           npm-domhandler-native \
           npm-entities-native"

SRC_URI = "https://registry.npmjs.org/dom-serializer/-/dom-serializer-1.3.1.tgz"
SRC_URI[md5sum] = "6692f4c69e4a79860c0ace29c8e7bfc5"
SRC_URI[sha256sum] = "4cdb0c674f025ae0b3172c80e935469a9e78cb8641db66502bd5fec9fbebc496"

NPM_PKGNAME = "dom-serializer"

inherit npmhelper
inherit native
