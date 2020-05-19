SUMMARY = "NPM: import-local"
DESCRIPTION = "Let a globally installed package use a locally installed version of itself if available"
HOMEPAGE = "https://github.com/sindresorhus/import-local#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=915042b5df33c31a6db2b37eadaa00e3"

DEPENDS = "npm-pkg-dir-native \
           npm-resolve-cwd-native"

SRC_URI = "https://registry.npmjs.org/import-local/-/import-local-3.0.2.tgz"
SRC_URI[md5sum] = "c045858757a975650e91e04f0bd11c4b"
SRC_URI[sha256sum] = "c5a97e59fb214d9faefabfd2a4548a97d106a3a24523710f536e1930a97148ca"

NPM_PKGNAME = "import-local"

inherit npmhelper
inherit native
