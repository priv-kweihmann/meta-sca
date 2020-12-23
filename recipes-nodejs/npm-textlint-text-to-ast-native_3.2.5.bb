SUMMARY = "NPM: @textlint/text-to-ast"
DESCRIPTION = "Parse plain text to AST with location info."
HOMEPAGE = "https://github.com/textlint/textlint/tree/master/packages/@textlint/text-to-ast/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e13f89c6c99507a95c450fa5e043b0cb"

DEPENDS = "npm-textlint-ast-node-types-native"

SRC_URI = "https://registry.npmjs.org/@textlint/text-to-ast/-/text-to-ast-3.2.5.tgz"
SRC_URI[md5sum] = "2b1afcd7f2b7ffbf6d3d92e615bd367a"
SRC_URI[sha256sum] = "eed37d2ebf029fd81de7826263e380d9d5964545fe22f17b91ff454202dece03"

NPM_PKGNAME = "@textlint/text-to-ast"

inherit npmhelper
inherit native
