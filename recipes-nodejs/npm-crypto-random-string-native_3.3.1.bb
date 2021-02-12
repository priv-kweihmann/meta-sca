SUMMARY = "NPM: crypto-random-string"
DESCRIPTION = "Generate a cryptographically strong random string"
HOMEPAGE = "https://github.com/sindresorhus/crypto-random-string#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=915042b5df33c31a6db2b37eadaa00e3"

DEPENDS = "npm-type-fest-native"

SRC_URI = "https://registry.npmjs.org/crypto-random-string/-/crypto-random-string-3.3.1.tgz"
SRC_URI[md5sum] = "e3f6b10d7ad5b2cfa9e07b967dbdf57a"
SRC_URI[sha256sum] = "c6b187ae647a319bf23097903b589d6a01bc6c192b9af19f161aa233c65941c9"

NPM_PKGNAME = "crypto-random-string"

inherit npmhelper
inherit native
