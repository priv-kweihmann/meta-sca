SUMMARY = "NPM: commander"
DESCRIPTION = "the complete solution for node.js command-line programs"
HOMEPAGE = "https://github.com/tj/commander.js#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=25851d4d10d6611a12d5571dab945a00"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/commander/-/commander-6.0.0.tgz"
SRC_URI[md5sum] = "0b4418f2a81fb66f4e38a88c399caab9"
SRC_URI[sha256sum] = "a8d8c7f8213ee892aa067985659570a5e46f443559fe405af922059b3d8a2c8e"

NPM_PKGNAME = "commander"

inherit npmhelper
inherit native
