SUMMARY = "NPM: @textlint/textlint-plugin-text"
DESCRIPTION = "plain text plugin for textlint"
HOMEPAGE = "https://github.com/textlint/textlint/tree/master/packages/@textlint/textlint-plugin-text/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e13f89c6c99507a95c450fa5e043b0cb"

DEPENDS = "npm-textlint-text-to-ast-native"

SRC_URI = "https://registry.npmjs.org/@textlint/textlint-plugin-text/-/textlint-plugin-text-4.3.1.tgz"
SRC_URI[md5sum] = "22128a77ddafc2260219cda518bda5f9"
SRC_URI[sha256sum] = "eece730b4f295e03bc25d3774815b7a1b08dbf1eaa8247966a842c64e98237c3"

NPM_PKGNAME = "@textlint/textlint-plugin-text"

inherit npmhelper
inherit native
