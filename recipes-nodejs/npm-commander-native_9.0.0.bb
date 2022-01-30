SUMMARY = "NPM: commander"
DESCRIPTION = "the complete solution for node.js command-line programs"
HOMEPAGE = "https://github.com/tj/commander.js#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=25851d4d10d6611a12d5571dab945a00"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/commander/-/commander-9.0.0.tgz"
SRC_URI[md5sum] = "179a2f927073c3518f097f62d4623490"
SRC_URI[sha256sum] = "ce0f571f437fd74a663c049f9ac20ec259658bfc75b790d220dddd3b71727c8e"

NPM_PKGNAME = "commander"

inherit npmhelper
inherit native
