SUMMARY = "NPM: commander"
DESCRIPTION = "the complete solution for node.js command-line programs"
HOMEPAGE = "https://github.com/tj/commander.js#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=25851d4d10d6611a12d5571dab945a00"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/commander/-/commander-8.3.0.tgz"
SRC_URI[md5sum] = "a32006563b3734e8195dd3881d1e5d7b"
SRC_URI[sha256sum] = "1b38e65f9229a84060ca5d041a58e3bc1ea374da6d933f9060ca86a67949c10b"

NPM_PKGNAME = "commander"

inherit npmhelper
inherit native
