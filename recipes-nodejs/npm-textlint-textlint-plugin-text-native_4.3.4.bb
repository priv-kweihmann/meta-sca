SUMMARY = "NPM: @textlint/textlint-plugin-text"
DESCRIPTION = "plain text plugin for textlint"
HOMEPAGE = "https://github.com/textlint/textlint/tree/master/packages/@textlint/textlint-plugin-text/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e13f89c6c99507a95c450fa5e043b0cb"

DEPENDS = "npm-textlint-text-to-ast-native"

SRC_URI = "https://registry.npmjs.org/@textlint/textlint-plugin-text/-/textlint-plugin-text-4.3.4.tgz"
SRC_URI[md5sum] = "da41581092134dd8029dc0920d4f705d"
SRC_URI[sha256sum] = "1c4c1cb2427d608a3fed9a6a8923fb87f5d2fbf2f07afc77d774e1792d2177c7"

NPM_PKGNAME = "@textlint/textlint-plugin-text"

inherit npmhelper
inherit native
