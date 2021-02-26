SUMMARY = "NPM: string.prototype.trimend"
DESCRIPTION = "ES2019 spec-compliant String.prototype.trimEnd shim."
HOMEPAGE = "https://github.com/es-shims/String.prototype.trimEnd#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1e241a19d2d112b1db1a5c1c23216939"

DEPENDS = "npm-call-bind-native \
           npm-define-properties-native"

SRC_URI = "https://registry.npmjs.org/string.prototype.trimend/-/string.prototype.trimend-1.0.4.tgz"
SRC_URI[md5sum] = "88b629f9cb3e49990b0fbd7c2c06a4f9"
SRC_URI[sha256sum] = "984cce7dab0d22dfe19301aeedfca180c9243c97d16cdd7c0f31c7be744e6710"

NPM_PKGNAME = "string.prototype.trimend"

inherit npmhelper
inherit native
