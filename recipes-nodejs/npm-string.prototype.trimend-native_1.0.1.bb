SUMMARY = "NPM: string.prototype.trimend"
DESCRIPTION = "ES2019 spec-compliant String.prototype.trimEnd shim."
HOMEPAGE = "https://github.com/es-shims/String.prototype.trimEnd#readme"

# To avoid dep loop remove npm-es-abstract-native
DEPENDS = "npm-define-properties-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1e241a19d2d112b1db1a5c1c23216939"

SRC_URI = "https://registry.npmjs.org/string.prototype.trimend/-/string.prototype.trimend-1.0.1.tgz"
SRC_URI[md5sum] = "b0179453c3f5fa12c292fcfc3287fa6e"
SRC_URI[sha256sum] = "e98726e0c1c5e6cdcd9a2ed7040db7a4e6d3c7e6d97d561d51baad29378dd529"

NPM_PKGNAME = "string.prototype.trimend"

inherit npmhelper
inherit native
