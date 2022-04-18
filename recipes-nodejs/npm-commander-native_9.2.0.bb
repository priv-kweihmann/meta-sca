SUMMARY = "NPM: commander"
DESCRIPTION = "the complete solution for node.js command-line programs"
HOMEPAGE = "https://github.com/tj/commander.js#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=25851d4d10d6611a12d5571dab945a00"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/commander/-/commander-9.2.0.tgz"
SRC_URI[md5sum] = "61b5bb73b510c537c8138071e48a3cb9"
SRC_URI[sha256sum] = "6a4e7d8b81c79a781bd037ee9649251d0b5b0e876f66686f9d92fe1c36824f4f"

NPM_PKGNAME = "commander"

inherit npmhelper
inherit native
