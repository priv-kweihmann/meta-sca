SUMMARY = "NPM: semver-diff"
DESCRIPTION = "Get the diff type of two semver versions: 0.0.1 0.0.2 → patch"
HOMEPAGE = "https://github.com/sindresorhus/semver-diff"

DEPENDS = "npm-semver-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=a12ebca0510a773644101a99a867d210"

SRC_URI = "https://registry.npmjs.org/semver-diff/-/semver-diff-2.1.0.tgz"
SRC_URI[md5sum] = "72d351d9302c264fe3afd00265712d40"
SRC_URI[sha256sum] = "eeb2dd0d6714b8fe33f35ecfa321efa502defc2299437ba44da3209142c8a1ea"

NPM_PKGNAME = "semver-diff"

inherit npmhelper
inherit native
