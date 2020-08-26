SUMMARY = "NPM: espree"
DESCRIPTION = "An Esprima-compatible JavaScript parser built on Acorn"
HOMEPAGE = "https://github.com/eslint/espree"

LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=31b28967d0717cf00f0d00d02b64c44b"

DEPENDS = "npm-acorn-jsx-native \
           npm-acorn-native \
           npm-eslint-visitor-keys-native"

SRC_URI = "https://registry.npmjs.org/espree/-/espree-7.3.0.tgz"
SRC_URI[md5sum] = "408f6bcb23a5e05241cb5d38d1d61fa2"
SRC_URI[sha256sum] = "22a4e80b5150c3a01fc7cb912f1c6f511467cb9b2f28ba22f9370a8d063cc357"

NPM_PKGNAME = "espree"

inherit npmhelper
inherit native
