SUMMARY = "NPM: espree"
DESCRIPTION = "An Esprima-compatible JavaScript parser built on Acorn"
HOMEPAGE = "https://github.com/eslint/espree"

LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=31b28967d0717cf00f0d00d02b64c44b"

DEPENDS = "npm-acorn-jsx-native \
           npm-acorn-native \
           npm-eslint-visitor-keys-native"

SRC_URI = "https://registry.npmjs.org/espree/-/espree-9.1.0.tgz"
SRC_URI[md5sum] = "13e85b18eed736d24650ce5eafaf5397"
SRC_URI[sha256sum] = "c2c41548be4e36182c5f88a5661486ba97542eeee237cbc402049515a064ff8b"

NPM_PKGNAME = "espree"

inherit npmhelper
inherit native
