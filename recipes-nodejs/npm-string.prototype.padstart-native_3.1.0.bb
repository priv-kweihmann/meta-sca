SUMMARY = "NPM: string.prototype.padstart"
DESCRIPTION = "ES2017 spec-compliant String.prototype.padStart shim."
HOMEPAGE = "https://github.com/es-shims/String.prototype.padStart#readme"

DEPENDS = "npm-define-properties-native npm-es-abstract-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=0d1020270dd80ad7a3a81ce3dbaeda22"

SRC_URI = "https://registry.npmjs.org/string.prototype.padstart/-/string.prototype.padstart-3.1.0.tgz"
SRC_URI[md5sum] = "3a3f44d8c831b4b3c4eea6f2726ecd40"
SRC_URI[sha256sum] = "883618864ba4af261f6d44a41757ddb335332e77b08059674d46eab5a7ba7c2b"

NPM_PKGNAME = "string.prototype.padstart"

inherit npmhelper
inherit native
