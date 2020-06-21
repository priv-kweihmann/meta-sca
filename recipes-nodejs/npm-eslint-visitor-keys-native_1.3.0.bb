SUMMARY = "NPM: eslint-visitor-keys"
DESCRIPTION = "Constants and utilities about visitor keys to traverse AST."
HOMEPAGE = "https://github.com/eslint/eslint-visitor-keys#readme"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e93e1daed697456bb93ade9a07cd1816"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/eslint-visitor-keys/-/eslint-visitor-keys-1.3.0.tgz"
SRC_URI[md5sum] = "b1aa10f7ef6a6a7964ab0a51a3c0d956"
SRC_URI[sha256sum] = "a9d7e840305df2cb16ff6be0fdd3e7b69db54fef607cd02f500f8183867eab36"

NPM_PKGNAME = "eslint-visitor-keys"

inherit npmhelper
inherit native
