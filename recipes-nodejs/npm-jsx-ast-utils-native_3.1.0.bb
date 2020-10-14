SUMMARY = "NPM: jsx-ast-utils"
DESCRIPTION = "AST utility module for statically analyzing JSX"
HOMEPAGE = "https://github.com/evcohen/jsx-ast-utils#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=8a54d70af8daeb4ac38a9b28b2f24dee"

DEPENDS = "npm-array-includes-native \
           npm-object.assign-native"

SRC_URI = "https://registry.npmjs.org/jsx-ast-utils/-/jsx-ast-utils-3.1.0.tgz"
SRC_URI[md5sum] = "ed8635cbf236e11808a999c6233bd205"
SRC_URI[sha256sum] = "c8099130b57c416613f5cc52eca55e99e776b933bee227e238b3afa70c9dc6e7"

NPM_PKGNAME = "jsx-ast-utils"

inherit npmhelper
inherit native
