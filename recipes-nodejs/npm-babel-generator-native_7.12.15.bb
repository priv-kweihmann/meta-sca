SUMMARY = "NPM: @babel/generator"
DESCRIPTION = "Turns an AST into code."
HOMEPAGE = "https://babel.dev/docs/en/next/babel-generator"

LICENSE = "MIT"
# does not provide a license file
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

DEPENDS = "npm-babel-types-native \
           npm-jsesc-native \
           npm-source-map-native"

SRC_URI = "https://registry.npmjs.org/@babel/generator/-/generator-7.12.15.tgz"
SRC_URI[md5sum] = "76f9f743c12a36ed324ac0957e3194ff"
SRC_URI[sha256sum] = "c0c80724343fde3d974a40d37dc1362473fa078f85eccdda032190e827146a16"

NPM_PKGNAME = "@babel/generator"

inherit npmhelper
inherit native
