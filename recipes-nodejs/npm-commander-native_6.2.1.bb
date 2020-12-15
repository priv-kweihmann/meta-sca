SUMMARY = "NPM: commander"
DESCRIPTION = "the complete solution for node.js command-line programs"
HOMEPAGE = "https://github.com/tj/commander.js#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=25851d4d10d6611a12d5571dab945a00"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/commander/-/commander-6.2.1.tgz"
SRC_URI[md5sum] = "46788bd557ba126179ff4768f8e9ae26"
SRC_URI[sha256sum] = "e21f2f185d897142dc98b63adc031a9753f5943db4c1bc09dc476a33020db13a"

NPM_PKGNAME = "commander"

inherit npmhelper
inherit native
