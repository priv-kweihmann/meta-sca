SUMMARY = "NPM: comment-json"
DESCRIPTION = "Parse and stringify JSON with comments. It will retain comments even after saved!"
HOMEPAGE = "https://github.com/kaelzhang/node-comment-json#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=7f23c6c42a4a980596f5673e5fbee6ad"

DEPENDS = "npm-core-util-is-native \
           npm-esprima-native \
           npm-has-own-prop-native \
           npm-repeat-string-native"

SRC_URI = "https://registry.npmjs.org/comment-json/-/comment-json-4.0.4.tgz"
SRC_URI[md5sum] = "1c1d10d21b4fe0cca4962bb7787616c1"
SRC_URI[sha256sum] = "ea770bfb71f564949036e07a228218399b113773ca33b9d894252e32d6059dd3"

NPM_PKGNAME = "comment-json"

inherit npmhelper
inherit native
