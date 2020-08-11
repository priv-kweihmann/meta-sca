SUMMARY = "NPM: comment-json"
DESCRIPTION = "Parse and stringify JSON with comments. It will retain comments even after saved!"
HOMEPAGE = "https://github.com/kaelzhang/node-comment-json#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=7f23c6c42a4a980596f5673e5fbee6ad"

DEPENDS = "npm-core-util-is-native \
           npm-esprima-native \
           npm-has-own-prop-native \
           npm-repeat-string-native"

SRC_URI = "https://registry.npmjs.org/comment-json/-/comment-json-3.0.3.tgz"
SRC_URI[md5sum] = "d884e3061a67de3676ac307608516bb1"
SRC_URI[sha256sum] = "df05763fff4d9a7ca8ac84bd269c67d0247dac7449839268156cec9a113c0375"

NPM_PKGNAME = "comment-json"

inherit npmhelper
inherit native
