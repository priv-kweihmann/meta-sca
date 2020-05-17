SUMMARY = "NPM: mdast-util-to-nlcst"
DESCRIPTION = "Transform MDAST to NLCST"
HOMEPAGE = "https://github.com/syntax-tree/mdast-util-to-nlcst#readme"

DEPENDS = "npm-nlcst-to-string-native npm-repeat-string-native npm-unist-util-position-native npm-vfile-location-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=91fb5297439b32d9cd49df8a2484d3eb"

SRC_URI = "https://registry.npmjs.org/mdast-util-to-nlcst/-/mdast-util-to-nlcst-3.2.3.tgz"
SRC_URI[md5sum] = "2ada9c11034ea2c9652f8053ec9a9b36"
SRC_URI[sha256sum] = "9c06d47ec1d593b3f28e79decbb591b6d78f65589f8c89abb865d472f6a3f526"

NPM_PKGNAME = "mdast-util-to-nlcst"

inherit npmhelper
inherit native
