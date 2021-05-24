SUMMARY = "NPM: mdast-util-gfm-autolink-literal"
DESCRIPTION = "mdast extension to parse and serialize GFM autolink literals"
HOMEPAGE = "https://github.com/syntax-tree/mdast-util-gfm-autolink-literal#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=6a9c614ad8a32fcd51b47e458d620e48"

DEPENDS = "npm-ccount-native \
           npm-mdast-util-find-and-replace-native \
           npm-micromark-native"

SRC_URI = "https://registry.npmjs.org/mdast-util-gfm-autolink-literal/-/mdast-util-gfm-autolink-literal-0.1.3.tgz"
SRC_URI[md5sum] = "abd4c81c88fae839536f97ca6c8de4d9"
SRC_URI[sha256sum] = "90c826c97b19adfca3d5d1f074b67702d68f6c3d276bbed540e743887d4a3c81"

NPM_PKGNAME = "mdast-util-gfm-autolink-literal"

inherit npmhelper
inherit native
