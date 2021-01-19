SUMMARY = "NPM: regexp.prototype.flags"
DESCRIPTION = "ES6 spec-compliant RegExp.prototype.flags shim."
HOMEPAGE = "https://github.com/es-shims/RegExp.prototype.flags#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=de214a0e2991ba4bb802f96348cbb1ce"

DEPENDS = "npm-call-bind-native \
           npm-define-properties-native"

SRC_URI = "https://registry.npmjs.org/regexp.prototype.flags/-/regexp.prototype.flags-1.3.1.tgz"
SRC_URI[md5sum] = "9c183a4f7c946dbf79ec656ffb9c0145"
SRC_URI[sha256sum] = "b5e66bb0f0689d2056ea77838921936d061b8a592ff65034840d79c81514f450"

NPM_PKGNAME = "regexp.prototype.flags"

inherit npmhelper
inherit native
