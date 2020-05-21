SUMMARY = "NPM: dom-serializer"
DESCRIPTION = "render dom nodes to string"
HOMEPAGE = "https://github.com/cheeriojs/dom-renderer#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ba3390a22fe1d127f3522ac8ef1bd1a0"

DEPENDS = "npm-domelementtype-native \
           npm-domhandler-native \
           npm-entities-native"

SRC_URI = "https://registry.npmjs.org/dom-serializer/-/dom-serializer-1.0.1.tgz"
SRC_URI[md5sum] = "22d25715c3e4ac828cd499c015a59147"
SRC_URI[sha256sum] = "d210fadaad06955c4a090f948873ad6e8fde26ebc1b928f885d723f42b4a1108"

NPM_PKGNAME = "dom-serializer"

inherit npmhelper
inherit native
