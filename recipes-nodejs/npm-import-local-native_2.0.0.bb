SUMMARY = "NPM: import-local"
DESCRIPTION = "Let a globally installed package use a locally installed version of itself if available"
HOMEPAGE = "https://github.com/sindresorhus/import-local#readme"

DEPENDS = "npm-pkg-dir-native npm-resolve-cwd-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=915042b5df33c31a6db2b37eadaa00e3"

SRC_URI = "https://registry.npmjs.org/import-local/-/import-local-2.0.0.tgz"
SRC_URI[md5sum] = "f0429594f765b5fdaa1d5ffff2e8ee98"
SRC_URI[sha256sum] = "b4896047f68fcd44fcfdd85450d04490b50dd45cf3308f5dabf3f91f03821690"

NPM_PKGNAME = "import-local"

inherit npmhelper
inherit native
