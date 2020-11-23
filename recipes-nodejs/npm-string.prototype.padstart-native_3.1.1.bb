SUMMARY = "NPM: string.prototype.padstart"
DESCRIPTION = "ES2017 spec-compliant String.prototype.padStart shim."
HOMEPAGE = "https://github.com/es-shims/String.prototype.padStart#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=0d1020270dd80ad7a3a81ce3dbaeda22"

DEPENDS = "npm-call-bind-native \
           npm-define-properties-native \
           npm-es-abstract-native"

SRC_URI = "https://registry.npmjs.org/string.prototype.padstart/-/string.prototype.padstart-3.1.1.tgz"
SRC_URI[md5sum] = "3254e69cdd1a01c5ae4eb4453ad09b18"
SRC_URI[sha256sum] = "5a99ed507120bb1ef742547a7ca7623056acc9466f0aaab5d68502c7621d8743"

NPM_PKGNAME = "string.prototype.padstart"

inherit npmhelper
inherit native
