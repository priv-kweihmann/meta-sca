SUMMARY = "NPM: chrono-node"
DESCRIPTION = "A natural language date parser in Javascript"
HOMEPAGE = "http://github.com/wanasit/chrono"

DEFAULT_PREFERENCE = "-1"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=8e0bb9fdc6803a6d8b47b24d0673c684"

DEPENDS = "npm-dayjs-native"

SRC_URI = "https://registry.npmjs.org/chrono-node/-/chrono-node-2.3.3.tgz"
SRC_URI[md5sum] = "e631a53573212d30e4f3f56af7bb3405"
SRC_URI[sha256sum] = "fdffc1ff5c62f5cb518d8ae6c841ac24fdb0ac0eaa155f49631c8e068e2b535f"

NPM_PKGNAME = "chrono-node"

inherit npmhelper
inherit native
