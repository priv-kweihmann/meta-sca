SUMMARY = "NPM: espree"
DESCRIPTION = "An Esprima-compatible JavaScript parser built on Acorn"
HOMEPAGE = "https://github.com/eslint/espree"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=31b28967d0717cf00f0d00d02b64c44b"

DEPENDS = "npm-acorn-jsx-native \
           npm-acorn-native \
           npm-eslint-visitor-keys-native"

SRC_URI = "https://registry.npmjs.org/espree/-/espree-9.2.0.tgz"
SRC_URI[md5sum] = "380e4ed7a74334b33769859d28b282d8"
SRC_URI[sha256sum] = "2c1650bff52aaf369a8c18b0ed0b3ebc028213748db1e71d64d06617e519725b"

NPM_PKGNAME = "espree"

inherit npmhelper
inherit native
