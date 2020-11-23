SUMMARY = "NPM: string.prototype.trimend"
DESCRIPTION = "ES2019 spec-compliant String.prototype.trimEnd shim."
HOMEPAGE = "https://github.com/es-shims/String.prototype.trimEnd#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1e241a19d2d112b1db1a5c1c23216939"

DEPENDS = "npm-call-bind-native \
           npm-define-properties-native"

SRC_URI = "https://registry.npmjs.org/string.prototype.trimend/-/string.prototype.trimend-1.0.3.tgz"
SRC_URI[md5sum] = "149911004b781e0d4aa019c44e6772a3"
SRC_URI[sha256sum] = "bd2c7cf1cf1b584de9b4b4c5d1b9895e152eee4e776681cb27bcc8e2fa213f4a"

NPM_PKGNAME = "string.prototype.trimend"

inherit npmhelper
inherit native
