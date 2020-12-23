SUMMARY = "NPM: @textlint/textlint-plugin-text"
DESCRIPTION = "plain text plugin for textlint"
HOMEPAGE = "https://github.com/textlint/textlint/tree/master/packages/@textlint/textlint-plugin-text/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e13f89c6c99507a95c450fa5e043b0cb"

DEPENDS = "npm-textlint-text-to-ast-native"

SRC_URI = "https://registry.npmjs.org/@textlint/textlint-plugin-text/-/textlint-plugin-text-4.2.7.tgz"
SRC_URI[md5sum] = "b9e3a10d01fcdf069b059599d94ba41f"
SRC_URI[sha256sum] = "1c389b917841d618ee754f96270fa2950dcc238c65a3c7aa8ef5cff423a7c49e"

NPM_PKGNAME = "@textlint/textlint-plugin-text"

inherit npmhelper
inherit native
