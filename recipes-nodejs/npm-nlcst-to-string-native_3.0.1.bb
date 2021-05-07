SUMMARY = "NPM: nlcst-to-string"
DESCRIPTION = "nlcst utility to transform a tree to a string"
HOMEPAGE = "https://github.com/syntax-tree/nlcst-to-string#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=f94eeeb01d2350e09cda730abca93641"

DEPENDS = "npm-types-unist-native"

SRC_URI = "https://registry.npmjs.org/nlcst-to-string/-/nlcst-to-string-3.0.1.tgz"
SRC_URI[md5sum] = "89d83328995d2d69e1ae2565c5b6e8f2"
SRC_URI[sha256sum] = "046e1a5335ca2cd3ff2710f8fbad97d196a9585128e9f932a9c92ab5a2fcbc22"

NPM_PKGNAME = "nlcst-to-string"

inherit npmhelper
inherit native
