SUMMARY = "NPM: pkg-dir"
DESCRIPTION = "Find the root directory of a Node.js project or npm package"
HOMEPAGE = "https://github.com/sindresorhus/pkg-dir#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = "npm-find-up-native"

SRC_URI = "https://registry.npmjs.org/pkg-dir/-/pkg-dir-6.0.0.tgz"
SRC_URI[md5sum] = "56bab532f14be533aea3c870b45949e7"
SRC_URI[sha256sum] = "11bad6f0e603ee79b6571f68ac911237eb0475db87860b705fbd033d43df507f"

NPM_PKGNAME = "pkg-dir"

inherit npmhelper
inherit native
