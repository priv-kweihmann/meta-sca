SUMMARY = "NPM: jsx-ast-utils"
DESCRIPTION = "AST utility module for statically analyzing JSX"
HOMEPAGE = "https://github.com/jsx-eslint/jsx-ast-utils#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=8a54d70af8daeb4ac38a9b28b2f24dee"

DEPENDS = "npm-array-includes-native \
           npm-object.assign-native"

SRC_URI = "https://registry.npmjs.org/jsx-ast-utils/-/jsx-ast-utils-3.2.2.tgz"
SRC_URI[md5sum] = "a5c4094d38c4e4af26a9116d081303a6"
SRC_URI[sha256sum] = "1c92546b66ab44fae3619c87372ae6a4d2aab12c25b1c18c830c129950421df2"

NPM_PKGNAME = "jsx-ast-utils"

inherit npmhelper
inherit native
