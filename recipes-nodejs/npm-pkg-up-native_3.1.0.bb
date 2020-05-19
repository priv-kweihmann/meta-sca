SUMMARY = "NPM: pkg-up"
DESCRIPTION = "Find the closest package.json file"
HOMEPAGE = "https://github.com/sindresorhus/pkg-up#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=915042b5df33c31a6db2b37eadaa00e3"

DEPENDS = "npm-find-up-native"

SRC_URI = "https://registry.npmjs.org/pkg-up/-/pkg-up-3.1.0.tgz"
SRC_URI[md5sum] = "792ce2ec77b722cd3dfcc8b65db014a4"
SRC_URI[sha256sum] = "b4d7bf6cd49a51e8df53c500108585898d121b6bb2e5cd7d0044b3929267760c"

NPM_PKGNAME = "pkg-up"

inherit npmhelper
inherit native
