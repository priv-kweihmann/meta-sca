SUMMARY = "NPM: @textlint/ast-node-types"
DESCRIPTION = "textlint AST node type definition."
HOMEPAGE = "https://github.com/textlint/textlint#readme"

DEFAULT_PREFERENCE = "-1"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=f3452a94937d21f84bc38880f636e3ba"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@textlint/ast-node-types/-/ast-node-types-12.0.0.tgz"
SRC_URI[md5sum] = "a4ab16404d8fefa268aa29579a157271"
SRC_URI[sha256sum] = "487f07e2af0102ac5b3459486293bc6a3394bab3579fbdb0635bb29ae275a9ad"

NPM_PKGNAME = "@textlint/ast-node-types"

inherit npmhelper
inherit native
