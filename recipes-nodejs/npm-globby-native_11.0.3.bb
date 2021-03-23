SUMMARY = "NPM: globby"
DESCRIPTION = "User-friendly glob matching"
HOMEPAGE = "https://github.com/sindresorhus/globby#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=915042b5df33c31a6db2b37eadaa00e3"

DEPENDS = "npm-array-union-native \
           npm-dir-glob-native \
           npm-fast-glob-native \
           npm-ignore-native \
           npm-merge2-native \
           npm-slash-native"

SRC_URI = "https://registry.npmjs.org/globby/-/globby-11.0.3.tgz"
SRC_URI[md5sum] = "ed64a29e1573fffdd5012c8775ad0bf1"
SRC_URI[sha256sum] = "23b6040fd922a3689277d60e814c83e8f80f014862759c95246839d8b2456634"

NPM_PKGNAME = "globby"

inherit npmhelper
inherit native
