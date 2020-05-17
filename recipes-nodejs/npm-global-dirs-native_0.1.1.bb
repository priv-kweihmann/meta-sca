SUMMARY = "NPM: global-dirs"
DESCRIPTION = "Get the directory of globally installed packages and binaries"
HOMEPAGE = "https://github.com/sindresorhus/global-dirs#readme"

DEPENDS = "npm-ini-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=915042b5df33c31a6db2b37eadaa00e3"

SRC_URI = "https://registry.npmjs.org/global-dirs/-/global-dirs-0.1.1.tgz"
SRC_URI[md5sum] = "70d662c96b8384bed717bce611ca68af"
SRC_URI[sha256sum] = "aab622fe018e20d46f810c7df7386ce2f4befd42a60d80e24dd47acbe844ebcf"

NPM_PKGNAME = "global-dirs"

inherit npmhelper
inherit native
