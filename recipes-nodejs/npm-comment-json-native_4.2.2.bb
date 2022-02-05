SUMMARY = "NPM: comment-json"
DESCRIPTION = "Parse and stringify JSON with comments. It will retain comments even after saved!"
HOMEPAGE = "https://github.com/kaelzhang/node-comment-json#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=7f23c6c42a4a980596f5673e5fbee6ad"

DEPENDS = "npm-array-timsort-native \
           npm-core-util-is-native \
           npm-esprima-native \
           npm-has-own-prop-native \
           npm-repeat-string-native"

SRC_URI = "https://registry.npmjs.org/comment-json/-/comment-json-4.2.2.tgz"
SRC_URI[md5sum] = "c8fae0493e81b3793e0d6687e405fb25"
SRC_URI[sha256sum] = "ad51a3daa8fb7022f43c07504f1b6226813a4c7a5db6f4162acce0e0dc6f9813"

NPM_PKGNAME = "comment-json"

inherit npmhelper
inherit native
