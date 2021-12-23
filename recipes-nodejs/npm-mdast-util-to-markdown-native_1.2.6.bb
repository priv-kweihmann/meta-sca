SUMMARY = "NPM: mdast-util-to-markdown"
DESCRIPTION = "mdast utility to serialize markdown"
HOMEPAGE = "https://github.com/syntax-tree/mdast-util-to-markdown#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=6a9c614ad8a32fcd51b47e458d620e48"

DEPENDS = "npm-longest-streak-native \
           npm-mdast-util-to-string-native \
           npm-micromark-util-decode-string-native \
           npm-types-mdast-native \
           npm-types-unist-native \
           npm-unist-util-visit-native \
           npm-zwitch-native"

SRC_URI = "https://registry.npmjs.org/mdast-util-to-markdown/-/mdast-util-to-markdown-1.2.6.tgz"
SRC_URI[md5sum] = "fb85b09ec9c2a8ecd543a0b079c7666f"
SRC_URI[sha256sum] = "0fb15fc09e4644b2f77d169d44743a7050afb91e9be5e63f56ed9b6b55f7e7a3"

NPM_PKGNAME = "mdast-util-to-markdown"

inherit npmhelper
inherit native
