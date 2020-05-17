SUMMARY = "NPM: global-dirs"
DESCRIPTION = "Get the directory of globally installed packages and binaries"
HOMEPAGE = "https://github.com/sindresorhus/global-dirs#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=915042b5df33c31a6db2b37eadaa00e3"

DEPENDS = "npm-ini-native"

SRC_URI = "https://registry.npmjs.org/global-dirs/-/global-dirs-2.0.1.tgz"
SRC_URI[md5sum] = "21121a74c6b2a9eaf649bf273c7535c3"
SRC_URI[sha256sum] = "9c0a3cd9d02eaaa2152e4ede08e62a411d148762ca09c142234255d482909779"

NPM_PKGNAME = "global-dirs"

inherit npmhelper
inherit native
