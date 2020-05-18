SUMMARY = "NPM: libnpmconfig"
DESCRIPTION = "Standalone library for reading/writing/managing npm configurations"
HOMEPAGE = "https://npmjs.com/package/libnpmconfig"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=be1bbe8581bef10553c830d3fb13c82d"

DEPENDS = "npm-figgy-pudding-native \
           npm-find-up-native \
           npm-ini-native"

SRC_URI = "https://registry.npmjs.org/libnpmconfig/-/libnpmconfig-1.2.1.tgz"
SRC_URI[md5sum] = "7393be456f2c88a49c35879c05f1a964"
SRC_URI[sha256sum] = "07d882886e9641375f59404d54f25f4dbda4ec08b1057060b873c79c9664a5d6"

NPM_PKGNAME = "libnpmconfig"

inherit npmhelper
inherit native
