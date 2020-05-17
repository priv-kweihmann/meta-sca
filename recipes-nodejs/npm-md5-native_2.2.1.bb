SUMMARY = "NPM: md5"
DESCRIPTION = "js function for hashing messages with MD5"
HOMEPAGE = "https://github.com/pvorb/node-md5#readme"

DEPENDS = "npm-charenc-native npm-crypt-native npm-is-buffer-native"

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=f975764919f5b2859c839414bb6a6f3a"

SRC_URI = "https://registry.npmjs.org/md5/-/md5-2.2.1.tgz"
SRC_URI[md5sum] = "44b10df64d57612f378e100c387860ba"
SRC_URI[sha256sum] = "17c5bd84868e9987cbb2b656ad80ef0087279cf1f0139c596783df1dffbf42da"

NPM_PKGNAME = "md5"

inherit npmhelper
inherit native
