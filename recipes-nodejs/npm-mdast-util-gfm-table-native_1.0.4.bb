SUMMARY = "NPM: mdast-util-gfm-table"
DESCRIPTION = "mdast extension to parse and serialize GFM tables"
HOMEPAGE = "https://github.com/syntax-tree/mdast-util-gfm-table#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=6a9c614ad8a32fcd51b47e458d620e48"

DEPENDS = "npm-markdown-table-native \
           npm-mdast-util-from-markdown-native \
           npm-mdast-util-to-markdown-native"

SRC_URI = "https://registry.npmjs.org/mdast-util-gfm-table/-/mdast-util-gfm-table-1.0.4.tgz"
SRC_URI[md5sum] = "3de1847a02bbd28dc17af0aa4b655666"
SRC_URI[sha256sum] = "4fa775143b60b56a9a24f9451620d0209fb698068eed0823fd8f6d042f5b62eb"

NPM_PKGNAME = "mdast-util-gfm-table"

inherit npmhelper
inherit native
