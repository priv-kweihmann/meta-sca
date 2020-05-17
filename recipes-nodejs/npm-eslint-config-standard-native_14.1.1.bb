SUMMARY = "NPM: eslint-config-standard"
DESCRIPTION = "JavaScript Standard Style - ESLint Shareable Config"
HOMEPAGE = "https://github.com/standard/eslint-config-standard"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fb42e5aa12bb9e365d38b4b5691d6984"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/eslint-config-standard/-/eslint-config-standard-14.1.1.tgz"
SRC_URI[md5sum] = "fcd30df6d2f456f3dd830b9a86c1e714"
SRC_URI[sha256sum] = "9ecc2dc4279f4f1ef9ef7ea055754c3a61ffb4d378ef0e03fe003a4490024c7b"

NPM_PKGNAME = "eslint-config-standard"

inherit npmhelper
inherit native
