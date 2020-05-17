SUMMARY = "NPM: string.prototype.trimleft"
DESCRIPTION = "ES2019 spec-compliant String.prototype.trimLeft shim."
HOMEPAGE = "https://github.com/es-shims/String.prototype.trimLeft#readme"

# To avoid dep loop remove npm-es-abstract-native
DEPENDS = "npm-define-properties-native npm-string.prototype.trimstart-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=5db8fa3e421a3211e6a3dc68544da455"

SRC_URI = "https://registry.npmjs.org/string.prototype.trimleft/-/string.prototype.trimleft-2.1.2.tgz"
SRC_URI[md5sum] = "8a58f5e8060f4fc76e077e62b437a041"
SRC_URI[sha256sum] = "7990302ecd0e93f6ac2bf412a1e68bc466143940cb652bbdaef95ec29d89b67d"

NPM_PKGNAME = "string.prototype.trimleft"

inherit npmhelper
inherit native
