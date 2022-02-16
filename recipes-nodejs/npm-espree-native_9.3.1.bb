SUMMARY = "NPM: espree"
DESCRIPTION = "An Esprima-compatible JavaScript parser built on Acorn"
HOMEPAGE = "https://github.com/eslint/espree"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=31b28967d0717cf00f0d00d02b64c44b"

DEPENDS = "npm-acorn-jsx-native \
           npm-acorn-native \
           npm-eslint-visitor-keys-native"

SRC_URI = "https://registry.npmjs.org/espree/-/espree-9.3.1.tgz"
SRC_URI[md5sum] = "b00445c7eae85238b67238662d926b58"
SRC_URI[sha256sum] = "3ddfd31319b484a8aab1ddfce2c28b19acdf79af437ffcd99662a7c2e395e39b"

NPM_PKGNAME = "espree"

inherit npmhelper
inherit native
