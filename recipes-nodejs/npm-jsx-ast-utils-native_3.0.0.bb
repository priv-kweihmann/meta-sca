SUMMARY = "NPM: jsx-ast-utils"
DESCRIPTION = "AST utility module for statically analyzing JSX"
HOMEPAGE = "https://github.com/evcohen/jsx-ast-utils#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=8a54d70af8daeb4ac38a9b28b2f24dee"

DEPENDS = "npm-array-includes-native \
           npm-object.assign-native"

SRC_URI = "https://registry.npmjs.org/jsx-ast-utils/-/jsx-ast-utils-3.0.0.tgz"
SRC_URI[md5sum] = "8d0e5996d9859641f121ca4d9cc98ef3"
SRC_URI[sha256sum] = "ae23511ce531894ea1eaa6dcadb952f6132dde17b7a63d182cc8a0b6bf43008b"

NPM_PKGNAME = "jsx-ast-utils"

inherit npmhelper
inherit native
