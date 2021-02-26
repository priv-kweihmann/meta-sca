SUMMARY = "NPM: string.prototype.trimstart"
DESCRIPTION = "ES2019 spec-compliant String.prototype.trimStart shim."
HOMEPAGE = "https://github.com/es-shims/String.prototype.trimStart#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1e241a19d2d112b1db1a5c1c23216939"

DEPENDS = "npm-call-bind-native \
           npm-define-properties-native"

SRC_URI = "https://registry.npmjs.org/string.prototype.trimstart/-/string.prototype.trimstart-1.0.4.tgz"
SRC_URI[md5sum] = "ad7c83cedfcdcafa713e957c027893c6"
SRC_URI[sha256sum] = "8f5bffcc06a218d0106e9aba6216621e4f7e12667470e9b25d1ae3d4b13be75a"

NPM_PKGNAME = "string.prototype.trimstart"

inherit npmhelper
inherit native
