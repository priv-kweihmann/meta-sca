SUMMARY = "NPM: commander"
DESCRIPTION = "the complete solution for node.js command-line programs"
HOMEPAGE = "https://github.com/tj/commander.js#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=25851d4d10d6611a12d5571dab945a00"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/commander/-/commander-7.1.0.tgz"
SRC_URI[md5sum] = "0f98b403bb1e28d700d8723e6782969d"
SRC_URI[sha256sum] = "a960dbaa154211f3e293de48053f2a1201c6b19e518e74e73c968fae9d1f7210"

NPM_PKGNAME = "commander"

inherit npmhelper
inherit native
