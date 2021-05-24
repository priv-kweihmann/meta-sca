SUMMARY = "NPM: @textlint/textlint-plugin-text"
DESCRIPTION = "plain text plugin for textlint"
HOMEPAGE = "https://github.com/textlint/textlint/tree/master/packages/@textlint/textlint-plugin-text/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e13f89c6c99507a95c450fa5e043b0cb"

DEPENDS = "npm-textlint-text-to-ast-native"

SRC_URI = "https://registry.npmjs.org/@textlint/textlint-plugin-text/-/textlint-plugin-text-12.0.0.tgz"
SRC_URI[md5sum] = "0856570c7c1a970ca74154232589c167"
SRC_URI[sha256sum] = "2fbc3738f6637cb7d1175543d2dd5467d4c2e0f203a93221b23f70b1afb84e73"

NPM_PKGNAME = "@textlint/textlint-plugin-text"

inherit npmhelper
inherit native
