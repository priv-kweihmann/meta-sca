SUMMARY = "NPM: comment-json"
DESCRIPTION = "Parse and stringify JSON with comments. It will retain comments even after saved!"
HOMEPAGE = "https://github.com/kaelzhang/node-comment-json#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=7f23c6c42a4a980596f5673e5fbee6ad"

DEPENDS = "npm-core-util-is-native \
           npm-esprima-native \
           npm-has-own-prop-native \
           npm-repeat-string-native"

SRC_URI = "https://registry.npmjs.org/comment-json/-/comment-json-3.0.2.tgz"
SRC_URI[md5sum] = "33893c95fb12509b7a11f32c5f99ab2e"
SRC_URI[sha256sum] = "881d4213b1cf4e0890e20cdae6ef524cbb472185b744643ae5bdbb0451a56fdf"

NPM_PKGNAME = "comment-json"

inherit npmhelper
inherit native
