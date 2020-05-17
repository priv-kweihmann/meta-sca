SUMMARY = "NPM: package-json"
DESCRIPTION = "Get metadata of a package from the npm registry"
HOMEPAGE = "https://github.com/sindresorhus/package-json#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=915042b5df33c31a6db2b37eadaa00e3"

DEPENDS = "npm-got-native \
           npm-registry-auth-token-native \
           npm-registry-url-native \
           npm-semver-native"

SRC_URI = "https://registry.npmjs.org/package-json/-/package-json-6.5.0.tgz"
SRC_URI[md5sum] = "a250c5e2eb164f9a0a05dddcaf079259"
SRC_URI[sha256sum] = "d00a4ef67991364db540318808d9a49c0cbfeab18a9585222fdb4b1d1d787404"

NPM_PKGNAME = "package-json"

inherit npmhelper
inherit native
