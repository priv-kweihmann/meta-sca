SUMMARY = "NPM: unique-string"
DESCRIPTION = "Generate a unique random string"
HOMEPAGE = "https://github.com/sindresorhus/unique-string#readme"

DEPENDS = "npm-crypto-random-string-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=915042b5df33c31a6db2b37eadaa00e3"

SRC_URI = "https://registry.npmjs.org/unique-string/-/unique-string-2.0.0.tgz"
SRC_URI[md5sum] = "1e611aa62235fec1363b2c2924cacad4"
SRC_URI[sha256sum] = "8ebeaee7eb50d932e6654a18ff25d12a4631c8aa9129322510b6cd7dcbde87b5"

S = "${WORKDIR}/package"

NPM_PKGNAME = "unique-string"

inherit npmhelper
inherit native
