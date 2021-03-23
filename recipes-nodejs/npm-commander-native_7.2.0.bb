SUMMARY = "NPM: commander"
DESCRIPTION = "the complete solution for node.js command-line programs"
HOMEPAGE = "https://github.com/tj/commander.js#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=25851d4d10d6611a12d5571dab945a00"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/commander/-/commander-7.2.0.tgz"
SRC_URI[md5sum] = "49ef88709843b28e74c4178e3dbe0476"
SRC_URI[sha256sum] = "cbb0895e31309d01f270ba9e94a0bea386acab0165672f6a1539df8b3a6448f6"

NPM_PKGNAME = "commander"

inherit npmhelper
inherit native
