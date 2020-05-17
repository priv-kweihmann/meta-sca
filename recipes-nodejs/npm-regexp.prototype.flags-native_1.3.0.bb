SUMMARY = "NPM: regexp.prototype.flags"
DESCRIPTION = "ES6 spec-compliant RegExp.prototype.flags shim."
HOMEPAGE = "https://github.com/es-shims/RegExp.prototype.flags#readme"

DEPENDS = "npm-define-properties-native npm-es-abstract-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=de214a0e2991ba4bb802f96348cbb1ce"

SRC_URI = "https://registry.npmjs.org/regexp.prototype.flags/-/regexp.prototype.flags-1.3.0.tgz"
SRC_URI[md5sum] = "c2a827b880aff43d16b39f50d9097920"
SRC_URI[sha256sum] = "a003b2b06eb982fa75d23f4effdeb9c252aa0cc897128427bb0474efcf4a2379"

NPM_PKGNAME = "regexp.prototype.flags"

inherit npmhelper
inherit native
