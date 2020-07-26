SUMMARY = "NPM: @textlint/textlint-plugin-text"
DESCRIPTION = "plain text plugin for textlint"
HOMEPAGE = "https://github.com/textlint/textlint/tree/master/packages/@textlint/textlint-plugin-text/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e13f89c6c99507a95c450fa5e043b0cb"

DEPENDS = "npm-textlint-text-to-ast-native"

SRC_URI = "https://registry.npmjs.org/@textlint/textlint-plugin-text/-/textlint-plugin-text-4.2.6.tgz"
SRC_URI[md5sum] = "e37463f3448fce4291bb0bef5320931f"
SRC_URI[sha256sum] = "b000a2461bdd3e489d033bec38ea7a6368ac8a25bef02d3d53e0621f94bebe39"

NPM_PKGNAME = "@textlint/textlint-plugin-text"

inherit npmhelper
inherit native
