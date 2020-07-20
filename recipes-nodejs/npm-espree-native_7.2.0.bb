SUMMARY = "NPM: espree"
DESCRIPTION = "An Esprima-compatible JavaScript parser built on Acorn"
HOMEPAGE = "https://github.com/eslint/espree"

LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=31b28967d0717cf00f0d00d02b64c44b"

DEPENDS = "npm-acorn-jsx-native \
           npm-acorn-native \
           npm-eslint-visitor-keys-native"

SRC_URI = "https://registry.npmjs.org/espree/-/espree-7.2.0.tgz"
SRC_URI[md5sum] = "89e4842b381daf0f42cb85c8750a8319"
SRC_URI[sha256sum] = "df72ca3a10d48e453c7bb8aa48e9724786623663c548ef14fe8f6033ec17140e"

NPM_PKGNAME = "espree"

inherit npmhelper
inherit native
