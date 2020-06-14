SUMMARY = "NPM: jsx-ast-utils"
DESCRIPTION = "AST utility module for statically analyzing JSX"
HOMEPAGE = "https://github.com/evcohen/jsx-ast-utils#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=8a54d70af8daeb4ac38a9b28b2f24dee"

DEPENDS = "npm-array-includes-native \
           npm-object.assign-native"

SRC_URI = "https://registry.npmjs.org/jsx-ast-utils/-/jsx-ast-utils-2.4.1.tgz"
SRC_URI[md5sum] = "f9d4f86ec0b52a2fb2c9c19a44fba400"
SRC_URI[sha256sum] = "3adb2fcc87f55ee5f7edd3ac251470f7528fda97a3a9ac831e95f2c19244fd0c"

NPM_PKGNAME = "jsx-ast-utils"

inherit npmhelper
inherit native
