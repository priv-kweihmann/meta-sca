SUMMARY = "NPM: semver-diff"
DESCRIPTION = "Get the diff type of two semver versions: 0.0.1 0.0.2 → patch"
HOMEPAGE = "https://github.com/sindresorhus/semver-diff#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = "npm-semver-native"

SRC_URI = "https://registry.npmjs.org/semver-diff/-/semver-diff-4.0.0.tgz"
SRC_URI[md5sum] = "96d85b21bb827be52d72c7920ea11ee1"
SRC_URI[sha256sum] = "19220a29da10774cd657640c0e605c7b4570d91909c7239759ba22a9c147f28c"

NPM_PKGNAME = "semver-diff"

inherit npmhelper
inherit native
