SUMMARY = "NPM: string.prototype.trimstart"
DESCRIPTION = "ES2019 spec-compliant String.prototype.trimStart shim."
HOMEPAGE = "https://github.com/es-shims/String.prototype.trimStart#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1e241a19d2d112b1db1a5c1c23216939"

DEPENDS = "npm-call-bind-native \
           npm-define-properties-native"

SRC_URI = "https://registry.npmjs.org/string.prototype.trimstart/-/string.prototype.trimstart-1.0.3.tgz"
SRC_URI[md5sum] = "57ee92e6b2a035161f6411e26d62fc79"
SRC_URI[sha256sum] = "5b77d54389cc5f3190f24dd32a15e5e87093ab3226248e3243d2347f4ed502a0"

NPM_PKGNAME = "string.prototype.trimstart"

inherit npmhelper
inherit native
