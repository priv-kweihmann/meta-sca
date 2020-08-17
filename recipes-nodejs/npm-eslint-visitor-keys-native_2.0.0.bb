SUMMARY = "NPM: eslint-visitor-keys"
DESCRIPTION = "Constants and utilities about visitor keys to traverse AST."
HOMEPAGE = "https://github.com/eslint/eslint-visitor-keys#readme"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e93e1daed697456bb93ade9a07cd1816"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/eslint-visitor-keys/-/eslint-visitor-keys-2.0.0.tgz"
SRC_URI[md5sum] = "7600f943c90ec45341673760bc59837d"
SRC_URI[sha256sum] = "3127bc60871bdb4f7f730cf28193d649a2f2b297fac959e1299f25ed40e974c8"

NPM_PKGNAME = "eslint-visitor-keys"

inherit npmhelper
inherit native
