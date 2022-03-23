SUMMARY = "NPM: commander"
DESCRIPTION = "the complete solution for node.js command-line programs"
HOMEPAGE = "https://github.com/tj/commander.js#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=25851d4d10d6611a12d5571dab945a00"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/commander/-/commander-9.1.0.tgz"
SRC_URI[md5sum] = "cb55fcd263e6c961781cef255c763ec6"
SRC_URI[sha256sum] = "218e4841a01b994a47ae480b1319032170df385e2269d57b38612e6df2feb1da"

NPM_PKGNAME = "commander"

inherit npmhelper
inherit native
