SUMMARY = "NPM: commander"
DESCRIPTION = "the complete solution for node.js command-line programs"
HOMEPAGE = "https://github.com/tj/commander.js#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=25851d4d10d6611a12d5571dab945a00"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/commander/-/commander-5.1.0.tgz"
SRC_URI[md5sum] = "9f667bf7f00d9ad2dabbcf4fb947db1e"
SRC_URI[sha256sum] = "c2e7c6dc8c54e4159bf2e65b314f595d1c7ee98f7529b4b6ef1d0979b4834564"

NPM_PKGNAME = "commander"

inherit npmhelper
inherit native
