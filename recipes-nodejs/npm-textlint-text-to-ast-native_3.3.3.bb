SUMMARY = "NPM: @textlint/text-to-ast"
DESCRIPTION = "Parse plain text to AST with location info."
HOMEPAGE = "https://github.com/textlint/textlint/tree/master/packages/@textlint/text-to-ast/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e13f89c6c99507a95c450fa5e043b0cb"

DEPENDS = "npm-textlint-ast-node-types-native"

SRC_URI = "https://registry.npmjs.org/@textlint/text-to-ast/-/text-to-ast-3.3.3.tgz"
SRC_URI[md5sum] = "726315e51347c3d83eb76b41f509213a"
SRC_URI[sha256sum] = "d06e94bec89a8eb3034818fd8c5071717b9bf260baefc075f58946ebe961e51c"

NPM_PKGNAME = "@textlint/text-to-ast"

inherit npmhelper
inherit native
