SUMMARY = "NPM: espree"
DESCRIPTION = "An Esprima-compatible JavaScript parser built on Acorn"
HOMEPAGE = "https://github.com/eslint/espree"

LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=31b28967d0717cf00f0d00d02b64c44b"

DEPENDS = "npm-acorn-jsx-native \
           npm-acorn-native \
           npm-eslint-visitor-keys-native"

SRC_URI = "https://registry.npmjs.org/espree/-/espree-7.3.1.tgz"
SRC_URI[md5sum] = "5e8b5890447fa7fe41284a1212076261"
SRC_URI[sha256sum] = "8a44cbd02da43447ab6b76176c88537174c3a9aad27526390ef2ef6a87010b3b"

NPM_PKGNAME = "espree"

inherit npmhelper
inherit native
