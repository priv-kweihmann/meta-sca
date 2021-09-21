SUMMARY = "NPM: mdast-util-to-markdown"
DESCRIPTION = "mdast utility to serialize markdown"
HOMEPAGE = "https://github.com/syntax-tree/mdast-util-to-markdown#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=6a9c614ad8a32fcd51b47e458d620e48"

DEPENDS = "npm-longest-streak-native \
           npm-mdast-util-to-string-native \
           npm-micromark-util-decode-string-native \
           npm-types-mdast-native \
           npm-types-unist-native \
           npm-unist-util-visit-native \
           npm-zwitch-native"

SRC_URI = "https://registry.npmjs.org/mdast-util-to-markdown/-/mdast-util-to-markdown-1.2.3.tgz"
SRC_URI[md5sum] = "5707f8f3c9e4f43829b0d181c39ff43a"
SRC_URI[sha256sum] = "90f34812edd473002d6ed58ea168f1d4f72ce4d614fffc2841dd1d22d012081f"

NPM_PKGNAME = "mdast-util-to-markdown"

inherit npmhelper
inherit native
