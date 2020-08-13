SUMMARY = "NPM: cspell-util-bundle"
DESCRIPTION = "This is a bundle of external libraries used by cspell bundled into a single `.js`"
HOMEPAGE = "https://github.com/streetsidesoftware/cspell#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/cspell-util-bundle/-/cspell-util-bundle-4.1.0.tgz"
SRC_URI[md5sum] = "66222aff197712242387f52d4c67c55d"
SRC_URI[sha256sum] = "da2f08d5a5b071dadc80ec04c8a4e37a0c65508b08fdbabc4879e3ec97d3c2a6"

NPM_PKGNAME = "cspell-util-bundle"

inherit npmhelper
inherit native
