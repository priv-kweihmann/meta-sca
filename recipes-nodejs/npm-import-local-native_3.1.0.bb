SUMMARY = "NPM: import-local"
DESCRIPTION = "Let a globally installed package use a locally installed version of itself if available"
HOMEPAGE = "https://github.com/sindresorhus/import-local#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=915042b5df33c31a6db2b37eadaa00e3"

DEPENDS = "npm-pkg-dir-native \
           npm-resolve-cwd-native"

SRC_URI = "https://registry.npmjs.org/import-local/-/import-local-3.1.0.tgz"
SRC_URI[md5sum] = "5145447e16b2d378b350ecfa34abcdd6"
SRC_URI[sha256sum] = "699af8f346cf3b646f631038137bf679890e51ec449384856141a2cdeafc4de7"

NPM_PKGNAME = "import-local"

inherit npmhelper
inherit native
