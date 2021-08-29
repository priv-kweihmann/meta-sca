SUMMARY = "NPM: nlcst-to-string"
DESCRIPTION = "nlcst utility to transform a tree to a string"
HOMEPAGE = "https://github.com/syntax-tree/nlcst-to-string#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=f94eeeb01d2350e09cda730abca93641"

DEPENDS = "npm-types-nlcst-native"

SRC_URI = "https://registry.npmjs.org/nlcst-to-string/-/nlcst-to-string-3.1.0.tgz"
SRC_URI[md5sum] = "a778f560b63e9ba0603916f7bab676fa"
SRC_URI[sha256sum] = "d9473eb97033ae3ba58bef0f4e0ad327eae9bd377e3feafbf4e9ea1a526718e6"

NPM_PKGNAME = "nlcst-to-string"

inherit npmhelper
inherit native
