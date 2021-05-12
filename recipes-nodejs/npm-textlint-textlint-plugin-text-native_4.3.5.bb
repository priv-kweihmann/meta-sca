SUMMARY = "NPM: @textlint/textlint-plugin-text"
DESCRIPTION = "plain text plugin for textlint"
HOMEPAGE = "https://github.com/textlint/textlint/tree/master/packages/@textlint/textlint-plugin-text/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e13f89c6c99507a95c450fa5e043b0cb"

DEPENDS = "npm-textlint-text-to-ast-native"

SRC_URI = "https://registry.npmjs.org/@textlint/textlint-plugin-text/-/textlint-plugin-text-4.3.5.tgz"
SRC_URI[md5sum] = "baf31565b8024cde022e445a1f9babf7"
SRC_URI[sha256sum] = "12aac2ad2733872b002e0c4ec5ac42de79da47a350f9a6d7ed6da177117a21a3"

NPM_PKGNAME = "@textlint/textlint-plugin-text"

inherit npmhelper
inherit native
