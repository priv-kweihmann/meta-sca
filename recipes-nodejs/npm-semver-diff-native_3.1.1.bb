SUMMARY = "NPM: semver-diff"
DESCRIPTION = "Get the diff type of two semver versions: 0.0.1 0.0.2 → patch"
HOMEPAGE = "https://github.com/sindresorhus/semver-diff#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=915042b5df33c31a6db2b37eadaa00e3"

DEPENDS = "npm-semver-native"

SRC_URI = "https://registry.npmjs.org/semver-diff/-/semver-diff-3.1.1.tgz"
SRC_URI[md5sum] = "baf58a0f54b3a3bab5962774ade946ed"
SRC_URI[sha256sum] = "91098ff2de4d77922b3ae21d5a93458cb448954bbd59985111e285687a92116b"

NPM_PKGNAME = "semver-diff"

inherit npmhelper
inherit native
