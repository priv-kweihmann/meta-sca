SUMMARY = "NPM: @textlint/text-to-ast"
DESCRIPTION = "Parse plain text to AST with location info."
HOMEPAGE = "https://github.com/textlint/textlint/tree/master/packages/@textlint/text-to-ast/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e13f89c6c99507a95c450fa5e043b0cb"

DEPENDS = "npm-textlint-ast-node-types-native"

SRC_URI = "https://registry.npmjs.org/@textlint/text-to-ast/-/text-to-ast-3.2.4.tgz"
SRC_URI[md5sum] = "b5f9938de9e99cb0282c440a150906c8"
SRC_URI[sha256sum] = "f32b94fe7aafb754268b0834e066a86a423bf74e0816e5446946ec539b0f6cf3"

NPM_PKGNAME = "@textlint/text-to-ast"

inherit npmhelper
inherit native
