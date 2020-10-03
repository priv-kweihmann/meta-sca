SUMMARY = "NPM: comment-json"
DESCRIPTION = "Parse and stringify JSON with comments. It will retain comments even after saved!"
HOMEPAGE = "https://github.com/kaelzhang/node-comment-json#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=7f23c6c42a4a980596f5673e5fbee6ad"

DEPENDS = "npm-array-timsort-native \
           npm-core-util-is-native \
           npm-esprima-native \
           npm-has-own-prop-native \
           npm-repeat-string-native"

SRC_URI = "https://registry.npmjs.org/comment-json/-/comment-json-4.1.0.tgz"
SRC_URI[md5sum] = "6059cfc7a9b95603e088a51b93031032"
SRC_URI[sha256sum] = "46ec154e730e02fae8d00294273b19106b0d0a640236c761c4e1b104d6b77ada"

NPM_PKGNAME = "comment-json"

inherit npmhelper
inherit native
