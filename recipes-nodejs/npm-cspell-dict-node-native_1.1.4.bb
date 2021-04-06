SUMMARY = "NPM: cspell-dict-node"
DESCRIPTION = "Node.js dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/node#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=62f84db3eea2ff0da5510fedd081ea0c"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-node/-/cspell-dict-node-1.1.4.tgz"
SRC_URI[md5sum] = "986de46b07edd8de0ae3e737def01e50"
SRC_URI[sha256sum] = "6842a7aa4a6e2a414b3b0ce8d5eedb2e72a66686ff14f0a8c644a981eac78ad2"

NPM_PKGNAME = "cspell-dict-node"

inherit npmhelper
inherit native
