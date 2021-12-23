SUMMARY = "NPM: eslint-visitor-keys"
DESCRIPTION = "Constants and utilities about visitor keys to traverse AST."
HOMEPAGE = "https://github.com/eslint/eslint-visitor-keys#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e93e1daed697456bb93ade9a07cd1816"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/eslint-visitor-keys/-/eslint-visitor-keys-3.1.0.tgz"
SRC_URI[md5sum] = "465c158daa92425bd6e2c29afbd3d539"
SRC_URI[sha256sum] = "a10aeee307c61cef3d64796fe3c641761862b71548fd9c813ae160773a0d66c3"

NPM_PKGNAME = "eslint-visitor-keys"

inherit npmhelper
inherit native
