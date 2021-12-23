SUMMARY = "NPM: import-local"
DESCRIPTION = "Let a globally installed package use a locally installed version of itself if available"
HOMEPAGE = "https://github.com/sindresorhus/import-local#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=915042b5df33c31a6db2b37eadaa00e3"

DEPENDS = "npm-pkg-dir-native \
           npm-resolve-cwd-native"

SRC_URI = "https://registry.npmjs.org/import-local/-/import-local-3.0.3.tgz"
SRC_URI[md5sum] = "76148786edcb6cb5ff9bb18ab55180f3"
SRC_URI[sha256sum] = "596fe60e2c2dcbacc888f6e046d7c024667e599ac7c559bced11f5c352123569"

NPM_PKGNAME = "import-local"

inherit npmhelper
inherit native
