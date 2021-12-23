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

SRC_URI = "https://registry.npmjs.org/comment-json/-/comment-json-4.1.1.tgz"
SRC_URI[md5sum] = "42196b0f75983a3c5267eb3f825644b5"
SRC_URI[sha256sum] = "365e401b9838891fb6f7bbc663ec0162f6f540001592f16b6361d7d11414fb5a"

NPM_PKGNAME = "comment-json"

inherit npmhelper
inherit native
