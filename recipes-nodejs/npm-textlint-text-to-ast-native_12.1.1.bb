SUMMARY = "NPM: @textlint/text-to-ast"
DESCRIPTION = "Parse plain text to AST with location info."
HOMEPAGE = "https://github.com/textlint/textlint/tree/master/packages/@textlint/text-to-ast/"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e13f89c6c99507a95c450fa5e043b0cb"

DEPENDS = "npm-textlint-ast-node-types-native"

SRC_URI = "https://registry.npmjs.org/@textlint/text-to-ast/-/text-to-ast-12.1.1.tgz"
SRC_URI[md5sum] = "c3b0b9b7fed4bfd584b61c9b7de70fb0"
SRC_URI[sha256sum] = "ade6ca4e75e8bc8d9004778ada3ec2447b6184a036af158c4261286daed81bbb"

NPM_PKGNAME = "@textlint/text-to-ast"

inherit npmhelper
inherit native
