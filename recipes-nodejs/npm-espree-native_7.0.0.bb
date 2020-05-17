SUMMARY = "NPM: espree"
DESCRIPTION = "An Esprima-compatible JavaScript parser built on Acorn"
HOMEPAGE = "https://github.com/eslint/espree"

LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a5ecf182a71b918e8375ab67f2cc85e7"

DEPENDS = "npm-acorn-jsx-native \
           npm-acorn-native \
           npm-eslint-visitor-keys-native"

SRC_URI = "https://registry.npmjs.org/espree/-/espree-7.0.0.tgz"
SRC_URI[md5sum] = "139d0ac1e240f1a008d4f48d74264210"
SRC_URI[sha256sum] = "4aaaabdad81ddc70dee728a9785e5f93e7e4385b9a9c211b170cceabf7ed15a1"

NPM_PKGNAME = "espree"

inherit npmhelper
inherit native
