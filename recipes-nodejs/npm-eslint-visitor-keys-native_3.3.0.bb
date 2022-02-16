SUMMARY = "NPM: eslint-visitor-keys"
DESCRIPTION = "Constants and utilities about visitor keys to traverse AST."
HOMEPAGE = "https://github.com/eslint/eslint-visitor-keys#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e93e1daed697456bb93ade9a07cd1816"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/eslint-visitor-keys/-/eslint-visitor-keys-3.3.0.tgz"
SRC_URI[md5sum] = "6055e72164712a3b8cf4943739a6e7b7"
SRC_URI[sha256sum] = "e8dfee6f4deafb6fb809793d2243db10fe9df064282824cbf3c1652a3189105d"

NPM_PKGNAME = "eslint-visitor-keys"

inherit npmhelper
inherit native
