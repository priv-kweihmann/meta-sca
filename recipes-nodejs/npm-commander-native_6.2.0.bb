SUMMARY = "NPM: commander"
DESCRIPTION = "the complete solution for node.js command-line programs"
HOMEPAGE = "https://github.com/tj/commander.js#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=25851d4d10d6611a12d5571dab945a00"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/commander/-/commander-6.2.0.tgz"
SRC_URI[md5sum] = "646961e5c251c37c4c294ebe319b26bd"
SRC_URI[sha256sum] = "f57dde3beb1bf6e926d83f35688a55374731ad5af60dcc5da2c9daea09d3e4b3"

NPM_PKGNAME = "commander"

inherit npmhelper
inherit native
