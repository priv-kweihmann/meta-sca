SUMMARY = "NPM: @textlint/text-to-ast"
DESCRIPTION = "Parse plain text to AST with location info."
HOMEPAGE = "https://github.com/textlint/textlint/tree/master/packages/@textlint/text-to-ast/"

DEFAULT_PREFERENCE = "-1"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e13f89c6c99507a95c450fa5e043b0cb"

DEPENDS = "npm-textlint-ast-node-types-native"

SRC_URI = "https://registry.npmjs.org/@textlint/text-to-ast/-/text-to-ast-12.0.2.tgz"
SRC_URI[md5sum] = "e4613b53a0a020d917aa0e0c1009b351"
SRC_URI[sha256sum] = "89f163a49c964e6eadd8a9b9c610e7aaee3ae7e343f6413bae80fe90a2b9b8d3"

NPM_PKGNAME = "@textlint/text-to-ast"

inherit npmhelper
inherit native
