SUMMARY = "NPM: mdast-util-gfm-table"
DESCRIPTION = "mdast extension to parse and serialize GFM tables"
HOMEPAGE = "https://github.com/syntax-tree/mdast-util-gfm-table#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=6a9c614ad8a32fcd51b47e458d620e48"

DEPENDS = "npm-markdown-table-native \
           npm-mdast-util-to-markdown-native"

SRC_URI = "https://registry.npmjs.org/mdast-util-gfm-table/-/mdast-util-gfm-table-1.0.3.tgz"
SRC_URI[md5sum] = "3b8a228ecdf965f16968b3c76508474f"
SRC_URI[sha256sum] = "71de192636a19b9cd34c13679c38f8923ca413a599941026aabdc0b4d6014f86"

NPM_PKGNAME = "mdast-util-gfm-table"

inherit npmhelper
inherit native
