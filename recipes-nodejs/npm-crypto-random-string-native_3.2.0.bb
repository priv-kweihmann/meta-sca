SUMMARY = "NPM: crypto-random-string"
DESCRIPTION = "Generate a cryptographically strong random string"
HOMEPAGE = "https://github.com/sindresorhus/crypto-random-string#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=915042b5df33c31a6db2b37eadaa00e3"

DEPENDS = "npm-type-fest-native"

SRC_URI = "https://registry.npmjs.org/crypto-random-string/-/crypto-random-string-3.2.0.tgz"
SRC_URI[md5sum] = "021e207bf505a67c495b49b4c99db3df"
SRC_URI[sha256sum] = "e4f8adfc1811063e16f69b236c173fc9744815cdc7f78139fabb2dc76862816c"

NPM_PKGNAME = "crypto-random-string"

inherit npmhelper
inherit native
