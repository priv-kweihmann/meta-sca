SUMMARY = "NPM: crypto-random-string"
DESCRIPTION = "Generate a cryptographically strong random string"
HOMEPAGE = "https://github.com/sindresorhus/crypto-random-string#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=915042b5df33c31a6db2b37eadaa00e3"

DEPENDS = "npm-type-fest-native"

SRC_URI = "https://registry.npmjs.org/crypto-random-string/-/crypto-random-string-3.3.0.tgz"
SRC_URI[md5sum] = "e58a466cb47379dd4a5ce7dc19a5d94f"
SRC_URI[sha256sum] = "d38852aa57ebd17187474faf8c52dd867e2b4ebba03859ec2a6615469940abe9"

NPM_PKGNAME = "crypto-random-string"

inherit npmhelper
inherit native
