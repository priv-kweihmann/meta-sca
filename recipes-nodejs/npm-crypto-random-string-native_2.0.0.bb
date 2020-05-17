SUMMARY = "NPM: crypto-random-string"
DESCRIPTION = "Generate a cryptographically strong random string"
HOMEPAGE = "https://github.com/sindresorhus/crypto-random-string#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=915042b5df33c31a6db2b37eadaa00e3"

SRC_URI = "https://registry.npmjs.org/crypto-random-string/-/crypto-random-string-2.0.0.tgz"
SRC_URI[md5sum] = "a944d9336278ebdef4bb8974d6baa551"
SRC_URI[sha256sum] = "5568339dadf0c073bb4380c1f59a1c537045c2edaac445858d1127d6f9efcfaa"

S = "${WORKDIR}/package"

NPM_PKGNAME = "crypto-random-string"

inherit npmhelper
inherit native
