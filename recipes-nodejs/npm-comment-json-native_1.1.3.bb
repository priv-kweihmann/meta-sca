SUMMARY = "NPM: comment-json"
DESCRIPTION = "Parse and stringify JSON file with comments"
HOMEPAGE = "https://github.com/kaelzhang/node-comment-json"

DEPENDS = "npm-json-parser-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE-MIT;md5=982cb25c0938491dede8c0edb76f2061"

SRC_URI = "https://registry.npmjs.org/comment-json/-/comment-json-1.1.3.tgz"
SRC_URI[md5sum] = "ccd26dcca7df02c71c6058f8193e4b02"
SRC_URI[sha256sum] = "6d2a2c576970b46ca29c7bb84d76aec868823b7f6b24f887e11d4cb9b12e95e7"

S = "${WORKDIR}/package"

NPM_PKGNAME = "comment-json"

inherit npmhelper
inherit native
