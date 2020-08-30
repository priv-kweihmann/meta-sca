SUMMARY = "NPM: commander"
DESCRIPTION = "the complete solution for node.js command-line programs"
HOMEPAGE = "https://github.com/tj/commander.js#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=25851d4d10d6611a12d5571dab945a00"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/commander/-/commander-6.1.0.tgz"
SRC_URI[md5sum] = "43e42575fcad1ae7406aedf15a36ff82"
SRC_URI[sha256sum] = "98c620c33d5043e2f1dac03dd215c298bc082a3d5c98adac1e4d397cff101dad"

NPM_PKGNAME = "commander"

inherit npmhelper
inherit native
