SUMMARY = "NPM: @textlint/textlint-plugin-text"
DESCRIPTION = "plain text plugin for textlint"
HOMEPAGE = "https://github.com/textlint/textlint/tree/master/packages/@textlint/textlint-plugin-text/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e13f89c6c99507a95c450fa5e043b0cb"

DEPENDS = "npm-textlint-text-to-ast-native"

SRC_URI = "https://registry.npmjs.org/@textlint/textlint-plugin-text/-/textlint-plugin-text-4.3.3.tgz"
SRC_URI[md5sum] = "459573b1cb86cec0350fcfe82d013618"
SRC_URI[sha256sum] = "75ff5c504df41b2daa399b38a7f62d3c3d94f10fe29774ce3983306a27629622"

NPM_PKGNAME = "@textlint/textlint-plugin-text"

inherit npmhelper
inherit native
