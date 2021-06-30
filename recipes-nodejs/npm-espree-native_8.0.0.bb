SUMMARY = "NPM: espree"
DESCRIPTION = "An Esprima-compatible JavaScript parser built on Acorn"
HOMEPAGE = "https://github.com/eslint/espree"

LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=31b28967d0717cf00f0d00d02b64c44b"

DEPENDS = "npm-acorn-jsx-native \
           npm-acorn-native \
           npm-eslint-visitor-keys-native"

SRC_URI = "https://registry.npmjs.org/espree/-/espree-8.0.0.tgz"
SRC_URI[md5sum] = "ff75f867323484bfc8a0e6331b417af7"
SRC_URI[sha256sum] = "57f43ef12697755aca0a5e1538ec7c1b8ca22f6badaf376f97263bd95aee6597"

NPM_PKGNAME = "espree"

inherit npmhelper
inherit native
