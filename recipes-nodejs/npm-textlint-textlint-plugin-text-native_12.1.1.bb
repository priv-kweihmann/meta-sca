SUMMARY = "NPM: @textlint/textlint-plugin-text"
DESCRIPTION = "plain text plugin for textlint"
HOMEPAGE = "https://github.com/textlint/textlint/tree/master/packages/@textlint/textlint-plugin-text/"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e13f89c6c99507a95c450fa5e043b0cb"

DEPENDS = "npm-textlint-text-to-ast-native"

SRC_URI = "https://registry.npmjs.org/@textlint/textlint-plugin-text/-/textlint-plugin-text-12.1.1.tgz"
SRC_URI[md5sum] = "37574025f59653ebf8282a47f6c8d025"
SRC_URI[sha256sum] = "63a8f86e2e70a3d0a216de486e503778d03df357b25d99a85ea1d57f27a5350a"

NPM_PKGNAME = "@textlint/textlint-plugin-text"

inherit npmhelper
inherit native
