SUMMARY = "NPM: dom-serializer"
DESCRIPTION = "render dom nodes to string"
HOMEPAGE = "https://github.com/cheeriojs/dom-renderer#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ba3390a22fe1d127f3522ac8ef1bd1a0"

DEPENDS = "npm-domelementtype-native \
           npm-domhandler-native \
           npm-entities-native"

SRC_URI = "https://registry.npmjs.org/dom-serializer/-/dom-serializer-1.2.0.tgz"
SRC_URI[md5sum] = "6860e85835b4388594023abb4e0cb822"
SRC_URI[sha256sum] = "e10b6e1d12316e4ea1e16d6aa9805f7274e4293a5ea754db5832e6f7f3bf21bf"

NPM_PKGNAME = "dom-serializer"

inherit npmhelper
inherit native
