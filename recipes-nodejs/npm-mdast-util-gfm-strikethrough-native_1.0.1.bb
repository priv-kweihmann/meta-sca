SUMMARY = "NPM: mdast-util-gfm-strikethrough"
DESCRIPTION = "mdast extension to parse and serialize GFM strikethrough"
HOMEPAGE = "https://github.com/syntax-tree/mdast-util-gfm-strikethrough#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=6a9c614ad8a32fcd51b47e458d620e48"

DEPENDS = "npm-mdast-util-to-markdown-native \
           npm-types-mdast-native"

SRC_URI = "https://registry.npmjs.org/mdast-util-gfm-strikethrough/-/mdast-util-gfm-strikethrough-1.0.1.tgz"
SRC_URI[md5sum] = "11ece0d85f07eae99de65fa65e1c2d64"
SRC_URI[sha256sum] = "cb2416b6450a1f9ebadc75f2e75474d9ea6a00905112bae61ebd7de1273ec22f"

NPM_PKGNAME = "mdast-util-gfm-strikethrough"

inherit npmhelper
inherit native
