SUMMARY = "NPM: eslint-visitor-keys"
DESCRIPTION = "Constants and utilities about visitor keys to traverse AST."
HOMEPAGE = "https://github.com/eslint/eslint-visitor-keys#readme"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e93e1daed697456bb93ade9a07cd1816"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/eslint-visitor-keys/-/eslint-visitor-keys-2.1.0.tgz"
SRC_URI[md5sum] = "fd3ac858b0b57c43232a7e3da0614582"
SRC_URI[sha256sum] = "e040bbbd24d65c93a7c22474176d6a47d40d5339db94ee87fe185fd84d86b918"

NPM_PKGNAME = "eslint-visitor-keys"

inherit npmhelper
inherit native
