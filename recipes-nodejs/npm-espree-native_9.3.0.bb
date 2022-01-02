SUMMARY = "NPM: espree"
DESCRIPTION = "An Esprima-compatible JavaScript parser built on Acorn"
HOMEPAGE = "https://github.com/eslint/espree"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=31b28967d0717cf00f0d00d02b64c44b"

DEPENDS = "npm-acorn-jsx-native \
           npm-acorn-native \
           npm-eslint-visitor-keys-native"

SRC_URI = "https://registry.npmjs.org/espree/-/espree-9.3.0.tgz"
SRC_URI[md5sum] = "85b3269a402e0cea51ebc403906c38dd"
SRC_URI[sha256sum] = "eac71fd8a9c0f91d0d05f1060c8231d690eb887585eaa559ec4bae5cbf35c210"

NPM_PKGNAME = "espree"

inherit npmhelper
inherit native
