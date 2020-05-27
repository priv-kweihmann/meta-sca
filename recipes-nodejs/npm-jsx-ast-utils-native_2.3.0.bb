SUMMARY = "NPM: jsx-ast-utils"
DESCRIPTION = "AST utility module for statically analyzing JSX"
HOMEPAGE = "https://github.com/evcohen/jsx-ast-utils#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=8a54d70af8daeb4ac38a9b28b2f24dee"

DEPENDS = "npm-array-includes-native \
           npm-object.assign-native"

SRC_URI = "https://registry.npmjs.org/jsx-ast-utils/-/jsx-ast-utils-2.3.0.tgz"
SRC_URI[md5sum] = "6ba9665f5371c173aae0555cce1ef4a4"
SRC_URI[sha256sum] = "d18ee0376d047c303bfd21f50fa6ac8df0281ea38650fc008ed4928c3a1cabd4"

NPM_PKGNAME = "jsx-ast-utils"

inherit npmhelper
inherit native
