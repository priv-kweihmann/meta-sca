SUMMARY = "NPM: cspell-dict-node"
DESCRIPTION = "Node.js dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/node#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=62f84db3eea2ff0da5510fedd081ea0c"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-node/-/cspell-dict-node-1.0.8.tgz"
SRC_URI[md5sum] = "5e22eda643d8e8d630864576f575811c"
SRC_URI[sha256sum] = "95d520e7ac3cb0c8e7772f7a5fafa4a93a3d8e4c9709645604b869a40b199e63"

NPM_PKGNAME = "cspell-dict-node"

inherit npmhelper
inherit native
