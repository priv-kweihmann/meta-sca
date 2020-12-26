SUMMARY = "NPM: cspell-dict-node"
DESCRIPTION = "Node.js dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/node#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=62f84db3eea2ff0da5510fedd081ea0c"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-node/-/cspell-dict-node-1.1.2.tgz"
SRC_URI[md5sum] = "a46139c68ef34c1c60ec0474ec153e4f"
SRC_URI[sha256sum] = "44a60a939bf8e69f9cddea199252d0939678825c9a4813e9d006b34bf15788b4"

NPM_PKGNAME = "cspell-dict-node"

inherit npmhelper
inherit native
