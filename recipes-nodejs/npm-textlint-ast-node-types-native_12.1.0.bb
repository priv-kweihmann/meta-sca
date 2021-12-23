SUMMARY = "NPM: @textlint/ast-node-types"
DESCRIPTION = "textlint AST node type definition."
HOMEPAGE = "https://github.com/textlint/textlint#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=f3452a94937d21f84bc38880f636e3ba"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@textlint/ast-node-types/-/ast-node-types-12.1.0.tgz"
SRC_URI[md5sum] = "51c37119efe553e11b9af7e2cbc6c43a"
SRC_URI[sha256sum] = "6c0d32650acb800a4aa9c6a56373c47b2d9f78d7e54fa2bb12ca434365bd9636"

NPM_PKGNAME = "@textlint/ast-node-types"

inherit npmhelper
inherit native
