SUMMARY = "NPM: comment-json"
DESCRIPTION = "Parse and stringify JSON with comments. It will retain comments even after saved!"
HOMEPAGE = "https://github.com/kaelzhang/node-comment-json#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=7f23c6c42a4a980596f5673e5fbee6ad"

DEPENDS = "npm-core-util-is-native \
           npm-esprima-native \
           npm-has-own-prop-native \
           npm-repeat-string-native"

SRC_URI = "https://registry.npmjs.org/comment-json/-/comment-json-4.0.6.tgz"
SRC_URI[md5sum] = "1bb497361acdc4e9534a373f3edc2cc7"
SRC_URI[sha256sum] = "52801cadd78c8da78656eabea51682edf09c12c9197f01acac1fbfb8330c852f"

NPM_PKGNAME = "comment-json"

inherit npmhelper
inherit native
