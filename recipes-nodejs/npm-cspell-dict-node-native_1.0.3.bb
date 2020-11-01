SUMMARY = "NPM: cspell-dict-node"
DESCRIPTION = "Node.js dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/node#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fd6ca8d8865d18c1a5a6696c0f841ff0"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-node/-/cspell-dict-node-1.0.3.tgz"
SRC_URI[md5sum] = "45792d8e4bdcb63b84ff37fc3de87654"
SRC_URI[sha256sum] = "57fa67a4ae7302a005191f366df296d7fd3cd525103e4507d08812fb690cd1f5"

NPM_PKGNAME = "cspell-dict-node"

inherit npmhelper
inherit native
