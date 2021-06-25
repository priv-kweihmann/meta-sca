SUMMARY = "NPM: eslint-visitor-keys"
DESCRIPTION = "Constants and utilities about visitor keys to traverse AST."
HOMEPAGE = "https://github.com/eslint/eslint-visitor-keys#readme"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e93e1daed697456bb93ade9a07cd1816"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/eslint-visitor-keys/-/eslint-visitor-keys-3.0.0.tgz"
SRC_URI[md5sum] = "dd4e693dae609a7d4e18f480c68fed00"
SRC_URI[sha256sum] = "55b9025053e2952e3ffbfaa85c51a9e05316ca5f3a09433d8648a2c6463d69aa"

NPM_PKGNAME = "eslint-visitor-keys"

inherit npmhelper
inherit native
