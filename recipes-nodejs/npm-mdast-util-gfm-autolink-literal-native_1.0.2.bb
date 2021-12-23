SUMMARY = "NPM: mdast-util-gfm-autolink-literal"
DESCRIPTION = "mdast extension to parse and serialize GFM autolink literals"
HOMEPAGE = "https://github.com/syntax-tree/mdast-util-gfm-autolink-literal#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=6a9c614ad8a32fcd51b47e458d620e48"

DEPENDS = "npm-ccount-native \
           npm-mdast-util-find-and-replace-native \
           npm-micromark-util-character-native \
           npm-types-mdast-native"

SRC_URI = "https://registry.npmjs.org/mdast-util-gfm-autolink-literal/-/mdast-util-gfm-autolink-literal-1.0.2.tgz"
SRC_URI[md5sum] = "062721601bab1a5692fcfbaa18126ab0"
SRC_URI[sha256sum] = "bba085b80c9d55851f9a5f629e92e3c865faa5b1343cd4726c752d1e1901d314"

NPM_PKGNAME = "mdast-util-gfm-autolink-literal"

inherit npmhelper
inherit native
