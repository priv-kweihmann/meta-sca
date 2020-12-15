SUMMARY = "NPM: global-dirs"
DESCRIPTION = "Get the directory of globally installed packages and binaries"
HOMEPAGE = "https://github.com/sindresorhus/global-dirs#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = "npm-ini-native"

SRC_URI = "https://registry.npmjs.org/global-dirs/-/global-dirs-2.1.0.tgz"
SRC_URI[md5sum] = "acc009b79ff8c293ff8c3347fd8fbed0"
SRC_URI[sha256sum] = "0f27f7377d76f96f51d05df6f667cd81b00913e8cae90bdcbc351ea6ad57e64f"

NPM_PKGNAME = "global-dirs"

inherit npmhelper
inherit native
