SUMMARY = "NPM: string.prototype.trimright"
DESCRIPTION = "ES2019 spec-compliant String.prototype.trimLeft shim."
HOMEPAGE = "https://github.com/es-shims/String.prototype.trimRight#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=5db8fa3e421a3211e6a3dc68544da455"

DEPENDS = "npm-call-bind-native \
           npm-define-properties-native \
           npm-string.prototype.trimend-native"

SRC_URI = "https://registry.npmjs.org/string.prototype.trimright/-/string.prototype.trimright-2.1.3.tgz"
SRC_URI[md5sum] = "dedb7a05ef2ec7fff038f755113a42d1"
SRC_URI[sha256sum] = "e25e4c55ee6117fed561e8da8847d17e59593c5958a8747d140ddac65ca8e18c"

NPM_PKGNAME = "string.prototype.trimright"

inherit npmhelper
inherit native
