SUMMARY = "NPM: string.prototype.trimleft"
DESCRIPTION = "ES2019 spec-compliant String.prototype.trimLeft shim."
HOMEPAGE = "https://github.com/es-shims/String.prototype.trimLeft#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=5db8fa3e421a3211e6a3dc68544da455"

DEPENDS = "npm-call-bind-native \
           npm-define-properties-native \
           npm-string.prototype.trimstart-native"

SRC_URI = "https://registry.npmjs.org/string.prototype.trimleft/-/string.prototype.trimleft-2.1.3.tgz"
SRC_URI[md5sum] = "c8453fd91576fdc20eef899e88c852a0"
SRC_URI[sha256sum] = "e38ee7ff9d0cb2b3c3e85d9d39abf481c41347aec810969186769d791c56c79e"

NPM_PKGNAME = "string.prototype.trimleft"

inherit npmhelper
inherit native
