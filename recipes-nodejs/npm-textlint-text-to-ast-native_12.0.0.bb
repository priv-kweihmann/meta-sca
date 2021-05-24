SUMMARY = "NPM: @textlint/text-to-ast"
DESCRIPTION = "Parse plain text to AST with location info."
HOMEPAGE = "https://github.com/textlint/textlint/tree/master/packages/@textlint/text-to-ast/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e13f89c6c99507a95c450fa5e043b0cb"

DEPENDS = "npm-textlint-ast-node-types-native"

SRC_URI = "https://registry.npmjs.org/@textlint/text-to-ast/-/text-to-ast-12.0.0.tgz"
SRC_URI[md5sum] = "ced8a2588121f1a37dca1951d18fc912"
SRC_URI[sha256sum] = "90752f624e636f57ceef9b35b4dd95cf4d89c96d49b4d74b91aa818322bf38b3"

NPM_PKGNAME = "@textlint/text-to-ast"

inherit npmhelper
inherit native
