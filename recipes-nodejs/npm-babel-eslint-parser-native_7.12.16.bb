SUMMARY = "NPM: @babel/eslint-parser"
DESCRIPTION = "ESLint parser that allows for linting of experimental syntax transformed by Babel"
HOMEPAGE = "https://babel.dev/"

LICENSE = "MIT"
# does not provide a license file
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

DEPENDS = "npm-eslint-scope-native \
           npm-eslint-visitor-keys-native \
           npm-semver-native"

SRC_URI = "https://registry.npmjs.org/@babel/eslint-parser/-/eslint-parser-7.12.16.tgz"
SRC_URI[md5sum] = "375ce39115a218071bc93d32cb649f05"
SRC_URI[sha256sum] = "471b1e5c9e5131bc1006a01d580940ff79f475b62c7090b8d5e5302161451055"

NPM_PKGNAME = "@babel/eslint-parser"

inherit npmhelper
inherit native
