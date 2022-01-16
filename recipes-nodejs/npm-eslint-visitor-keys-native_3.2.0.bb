SUMMARY = "NPM: eslint-visitor-keys"
DESCRIPTION = "Constants and utilities about visitor keys to traverse AST."
HOMEPAGE = "https://github.com/eslint/eslint-visitor-keys#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e93e1daed697456bb93ade9a07cd1816"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/eslint-visitor-keys/-/eslint-visitor-keys-3.2.0.tgz"
SRC_URI[md5sum] = "8a2ec217e7ace69f2d961bba969ffbd5"
SRC_URI[sha256sum] = "01ab2e221018d4b9cffbd2d8a4ed8f50b11995d506c07a416429de0b79a6580a"

NPM_PKGNAME = "eslint-visitor-keys"

inherit npmhelper
inherit native
