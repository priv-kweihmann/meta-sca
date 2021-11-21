SUMMARY = "NPM: @textlint/textlint-plugin-text"
DESCRIPTION = "plain text plugin for textlint"
HOMEPAGE = "https://github.com/textlint/textlint/tree/master/packages/@textlint/textlint-plugin-text/"

DEFAULT_PREFERENCE = "-1"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e13f89c6c99507a95c450fa5e043b0cb"

DEPENDS = "npm-textlint-text-to-ast-native"

SRC_URI = "https://registry.npmjs.org/@textlint/textlint-plugin-text/-/textlint-plugin-text-12.0.2.tgz"
SRC_URI[md5sum] = "30efba0c03e9291aaa2631e7048065d6"
SRC_URI[sha256sum] = "14c42da2d57f5d14664683b0134e1059f706a7b43209a8d6b99b19244729e2d5"

NPM_PKGNAME = "@textlint/textlint-plugin-text"

inherit npmhelper
inherit native
