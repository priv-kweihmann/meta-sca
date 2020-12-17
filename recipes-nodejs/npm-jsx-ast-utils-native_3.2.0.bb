SUMMARY = "NPM: jsx-ast-utils"
DESCRIPTION = "AST utility module for statically analyzing JSX"
HOMEPAGE = "https://github.com/evcohen/jsx-ast-utils#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=8a54d70af8daeb4ac38a9b28b2f24dee"

DEPENDS = "npm-array-includes-native \
           npm-object.assign-native"

SRC_URI = "https://registry.npmjs.org/jsx-ast-utils/-/jsx-ast-utils-3.2.0.tgz"
SRC_URI[md5sum] = "c2fec533f3e71080e36eb50031754d46"
SRC_URI[sha256sum] = "6e01f5394d4660d3d1f31c3c0114374a320de568de0012d11a381efd6c5622ba"

NPM_PKGNAME = "jsx-ast-utils"

inherit npmhelper
inherit native
