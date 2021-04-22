SUMMARY = "NPM: nlcst-to-string"
DESCRIPTION = "nlcst utility to transform a tree to a string"
HOMEPAGE = "https://github.com/syntax-tree/nlcst-to-string#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=f94eeeb01d2350e09cda730abca93641"

DEPENDS = "npm-types-unist-native"

SRC_URI = "https://registry.npmjs.org/nlcst-to-string/-/nlcst-to-string-3.0.0.tgz"
SRC_URI[md5sum] = "433b3644f0f1e0b7ccc17f1dd9ebda50"
SRC_URI[sha256sum] = "79dc58349c62cf8f135a91a0c5ffdec99c06693e70b7969724a31a67459d631b"

NPM_PKGNAME = "nlcst-to-string"

inherit npmhelper
inherit native
