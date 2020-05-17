SUMMARY = "NPM: @textlint/textlint-plugin-text"
DESCRIPTION = "plain text plugin for textlint"
HOMEPAGE = "https://github.com/textlint/textlint/tree/master/packages/@textlint/textlint-plugin-text/"

DEPENDS = "npm-textlint-text-to-ast-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e13f89c6c99507a95c450fa5e043b0cb"

SRC_URI = "https://registry.npmjs.org/@textlint/textlint-plugin-text/-/textlint-plugin-text-4.1.13.tgz"
SRC_URI[md5sum] = "e65a030c4d65c4764e85161c1cd4efc7"
SRC_URI[sha256sum] = "daf6b9c8d9d3f39eb8b0504d5696530eb60571dfe75366425e9fd138074eb088"

NPM_PKGNAME = "@textlint/textlint-plugin-text"

inherit npmhelper
inherit native
