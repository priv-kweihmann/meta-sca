SUMMARY = "NPM: jsx-ast-utils"
DESCRIPTION = "AST utility module for statically analyzing JSX"
HOMEPAGE = "https://github.com/jsx-eslint/jsx-ast-utils#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=8a54d70af8daeb4ac38a9b28b2f24dee"

DEPENDS = "npm-array-includes-native \
           npm-object.assign-native"

SRC_URI = "https://registry.npmjs.org/jsx-ast-utils/-/jsx-ast-utils-3.2.1.tgz"
SRC_URI[md5sum] = "d7666de3f83e7942ddf95e7aa3135fd3"
SRC_URI[sha256sum] = "79156b9da63155fb9c0a205fdd1a4a8ae0fe6142d70db4a00423a334e16e1775"

NPM_PKGNAME = "jsx-ast-utils"

inherit npmhelper
inherit native
