SUMMARY = "NPM: cspell-util-bundle"
DESCRIPTION = "This is a bundle of external libraries used by cspell bundled into a single `.js`"
HOMEPAGE = "https://github.com/streetsidesoftware/cspell#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/cspell-util-bundle/-/cspell-util-bundle-5.0.1.tgz"
SRC_URI[md5sum] = "ecaa3747616859b24a112c023263331b"
SRC_URI[sha256sum] = "eeacc36c0474876d8321f1b1a6ef0e1db80517ad9f41310ae005e177e970d221"

NPM_PKGNAME = "cspell-util-bundle"

inherit npmhelper
inherit native
