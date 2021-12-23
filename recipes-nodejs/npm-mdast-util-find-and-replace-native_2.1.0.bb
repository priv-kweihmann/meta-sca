SUMMARY = "NPM: mdast-util-find-and-replace"
DESCRIPTION = "mdast utility to find and replace text in a tree"
HOMEPAGE = "https://github.com/syntax-tree/mdast-util-find-and-replace#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=6a9c614ad8a32fcd51b47e458d620e48"

DEPENDS = "npm-escape-string-regexp-native \
           npm-unist-util-is-native \
           npm-unist-util-visit-parents-native"

SRC_URI = "https://registry.npmjs.org/mdast-util-find-and-replace/-/mdast-util-find-and-replace-2.1.0.tgz"
SRC_URI[md5sum] = "c34416cfd100fd19c8a0866f464e77e8"
SRC_URI[sha256sum] = "59830ca94ee83b19adf8eb0ce634bc2216b1762eff1c126b9c4fa8342a779362"

NPM_PKGNAME = "mdast-util-find-and-replace"

inherit npmhelper
inherit native
