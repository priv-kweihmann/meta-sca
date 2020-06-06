SUMMARY = "NPM: eslint-visitor-keys"
DESCRIPTION = "Constants and utilities about visitor keys to traverse AST."
HOMEPAGE = "https://github.com/eslint/eslint-visitor-keys#readme"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e93e1daed697456bb93ade9a07cd1816"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/eslint-visitor-keys/-/eslint-visitor-keys-1.2.0.tgz"
SRC_URI[md5sum] = "e9a7858ea773a40951c9acd106da8901"
SRC_URI[sha256sum] = "fe90e086269579ebd1c397dc65ae663ce2e8f08e376c814573a3b9ecd665d711"

NPM_PKGNAME = "eslint-visitor-keys"

inherit npmhelper
inherit native
