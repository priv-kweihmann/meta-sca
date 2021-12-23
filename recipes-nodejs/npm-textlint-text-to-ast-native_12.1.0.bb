SUMMARY = "NPM: @textlint/text-to-ast"
DESCRIPTION = "Parse plain text to AST with location info."
HOMEPAGE = "https://github.com/textlint/textlint/tree/master/packages/@textlint/text-to-ast/"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e13f89c6c99507a95c450fa5e043b0cb"

DEPENDS = "npm-textlint-ast-node-types-native"

SRC_URI = "https://registry.npmjs.org/@textlint/text-to-ast/-/text-to-ast-12.1.0.tgz"
SRC_URI[md5sum] = "ec73e7a2acaa7992fff4472c09d11b8c"
SRC_URI[sha256sum] = "a13b913026d1980f8b08da0c0d55dd2e16e40d51bbcd58bbcc4254b1027a0cd7"

NPM_PKGNAME = "@textlint/text-to-ast"

inherit npmhelper
inherit native
