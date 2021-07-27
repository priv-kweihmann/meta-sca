SUMMARY = "NPM: commander"
DESCRIPTION = "the complete solution for node.js command-line programs"
HOMEPAGE = "https://github.com/tj/commander.js#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=25851d4d10d6611a12d5571dab945a00"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/commander/-/commander-8.1.0.tgz"
SRC_URI[md5sum] = "fd7c02f8dab36651908d9535fe5c2d68"
SRC_URI[sha256sum] = "74c41138a8d11e0e8dc0b7120dd3fd84c8217e727d0e61dc60d86a9a69b6de27"

NPM_PKGNAME = "commander"

inherit npmhelper
inherit native
