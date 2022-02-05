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

SRC_URI = "https://registry.npmjs.org/mdast-util-to-markdown/-/mdast-util-to-markdown-1.3.0.tgz"
SRC_URI[md5sum] = "4a497e0ba1a8d7ce301b6dc23b74a13b"
SRC_URI[sha256sum] = "1c4f27185a03325922f95ac045e8101ef51df54efc7a69b87438ff946eca0fc1"

NPM_PKGNAME = "mdast-util-to-markdown"

inherit npmhelper
inherit native
