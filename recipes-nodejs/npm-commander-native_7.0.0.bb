SUMMARY = "NPM: commander"
DESCRIPTION = "the complete solution for node.js command-line programs"
HOMEPAGE = "https://github.com/tj/commander.js#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=25851d4d10d6611a12d5571dab945a00"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/commander/-/commander-7.0.0.tgz"
SRC_URI[md5sum] = "75f78e6a8dfd1004af1fa88eb04227f6"
SRC_URI[sha256sum] = "474e2fd806b3dad15f995c2dce03f2bce96a5e4b8bc81b911ca29e037e3073a8"

NPM_PKGNAME = "commander"

inherit npmhelper
inherit native
