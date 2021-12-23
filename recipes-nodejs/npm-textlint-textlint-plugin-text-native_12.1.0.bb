SUMMARY = "NPM: @textlint/textlint-plugin-text"
DESCRIPTION = "plain text plugin for textlint"
HOMEPAGE = "https://github.com/textlint/textlint/tree/master/packages/@textlint/textlint-plugin-text/"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e13f89c6c99507a95c450fa5e043b0cb"

DEPENDS = "npm-textlint-text-to-ast-native"

SRC_URI = "https://registry.npmjs.org/@textlint/textlint-plugin-text/-/textlint-plugin-text-12.1.0.tgz"
SRC_URI[md5sum] = "9a95de554af442818f4fa52e6100f0af"
SRC_URI[sha256sum] = "2a99ff0ae1f4e2b08357a4a7b320b60d0fba3b525823f6d493de910e326f0476"

NPM_PKGNAME = "@textlint/textlint-plugin-text"

inherit npmhelper
inherit native
