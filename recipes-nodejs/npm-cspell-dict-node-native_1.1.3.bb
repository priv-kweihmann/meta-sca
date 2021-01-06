SUMMARY = "NPM: cspell-dict-node"
DESCRIPTION = "Node.js dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/node#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=62f84db3eea2ff0da5510fedd081ea0c"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-node/-/cspell-dict-node-1.1.3.tgz"
SRC_URI[md5sum] = "705a74a8cf504d1a67f5ddc241b820c0"
SRC_URI[sha256sum] = "f09c84e1a505584085f4051f5669e53e200534626de8985a3c34c292b58e4845"

NPM_PKGNAME = "cspell-dict-node"

inherit npmhelper
inherit native
