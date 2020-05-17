SUMMARY = "NPM: make-dir"
DESCRIPTION = "Make a directory and its parents if needed - Think `mkdir -p`"
HOMEPAGE = "https://github.com/sindresorhus/make-dir#readme"

DEPENDS = "npm-semver-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=915042b5df33c31a6db2b37eadaa00e3"

SRC_URI = "https://registry.npmjs.org/make-dir/-/make-dir-3.1.0.tgz"
SRC_URI[md5sum] = "e47d13370c2b27671a13f28ebc27585f"
SRC_URI[sha256sum] = "ec54ab8aa54b1161fd346e870e587be6595d9c8ea90f5485b7367df7575674dc"

S = "${WORKDIR}/package"

NPM_PKGNAME = "make-dir"

inherit npmhelper
inherit native
