SUMMARY = "NPM: @textlint/ast-node-types"
DESCRIPTION = "textlint AST node type definition."
HOMEPAGE = "https://github.com/textlint/textlint#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=f3452a94937d21f84bc38880f636e3ba"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@textlint/ast-node-types/-/ast-node-types-12.1.1.tgz"
SRC_URI[md5sum] = "01f2d67aa68b8bbe36639d4c8e1f0f7b"
SRC_URI[sha256sum] = "837e72bf78bb633adab2198de84a0e27faecb3bcf694eb41df8f0c0786f7d1e6"

NPM_PKGNAME = "@textlint/ast-node-types"

inherit npmhelper
inherit native
