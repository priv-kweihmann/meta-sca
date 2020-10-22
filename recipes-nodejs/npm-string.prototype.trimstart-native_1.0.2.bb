SUMMARY = "NPM: string.prototype.trimstart"
DESCRIPTION = "ES2019 spec-compliant String.prototype.trimStart shim."
HOMEPAGE = "https://github.com/es-shims/String.prototype.trimStart#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1e241a19d2d112b1db1a5c1c23216939"

DEPENDS = "npm-define-properties-native"

SRC_URI = "https://registry.npmjs.org/string.prototype.trimstart/-/string.prototype.trimstart-1.0.2.tgz"
SRC_URI[md5sum] = "8d0d80e7a61305fca0b45594a2bb9197"
SRC_URI[sha256sum] = "8640760616dd88678dc26bbf79a0121f5c47f92acea48306f2f0d3f8423270c6"

NPM_PKGNAME = "string.prototype.trimstart"

inherit npmhelper
inherit native
