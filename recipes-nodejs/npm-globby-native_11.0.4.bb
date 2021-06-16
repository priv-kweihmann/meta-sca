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

SRC_URI = "https://registry.npmjs.org/globby/-/globby-11.0.4.tgz"
SRC_URI[md5sum] = "582fca60453ce8dcb7887a8669e41aad"
SRC_URI[sha256sum] = "8006c45c11709066ab144908f9a40da3b08660d88ece6db9f2623d417d9cc8d4"

NPM_PKGNAME = "globby"

inherit npmhelper
inherit native
