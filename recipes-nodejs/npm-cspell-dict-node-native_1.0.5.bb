SUMMARY = "NPM: cspell-dict-node"
DESCRIPTION = "Node.js dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/node#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fd6ca8d8865d18c1a5a6696c0f841ff0"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-node/-/cspell-dict-node-1.0.5.tgz"
SRC_URI[md5sum] = "8777d5e8489c5a5bcef48b53f97ad5fe"
SRC_URI[sha256sum] = "8e2433058a32fd3225e73a82e0dbdb4a5682361c87194d01b62232c7919114da"

NPM_PKGNAME = "cspell-dict-node"

inherit npmhelper
inherit native
