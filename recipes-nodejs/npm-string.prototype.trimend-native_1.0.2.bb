SUMMARY = "NPM: string.prototype.trimend"
DESCRIPTION = "ES2019 spec-compliant String.prototype.trimEnd shim."
HOMEPAGE = "https://github.com/es-shims/String.prototype.trimEnd#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1e241a19d2d112b1db1a5c1c23216939"

DEPENDS = "npm-define-properties-native"

SRC_URI = "https://registry.npmjs.org/string.prototype.trimend/-/string.prototype.trimend-1.0.2.tgz"
SRC_URI[md5sum] = "0431e5966810cafa7aa4c96096842cee"
SRC_URI[sha256sum] = "e062c955ff2f33a078a554feadf1b63b5477763eaadfc797ff5dfadf197b4b15"

NPM_PKGNAME = "string.prototype.trimend"

inherit npmhelper
inherit native
