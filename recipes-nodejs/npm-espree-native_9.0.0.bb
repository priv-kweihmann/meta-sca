SUMMARY = "NPM: espree"
DESCRIPTION = "An Esprima-compatible JavaScript parser built on Acorn"
HOMEPAGE = "https://github.com/eslint/espree"

LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=31b28967d0717cf00f0d00d02b64c44b"

DEPENDS = "npm-acorn-jsx-native \
           npm-acorn-native \
           npm-eslint-visitor-keys-native"

SRC_URI = "https://registry.npmjs.org/espree/-/espree-9.0.0.tgz"
SRC_URI[md5sum] = "c8fac271575a841caa8bc864135b63f2"
SRC_URI[sha256sum] = "ba232df89dad4eb0a9ae169ea775c0d8be250babb6d38a6f606705a1eac47284"

NPM_PKGNAME = "espree"

inherit npmhelper
inherit native
