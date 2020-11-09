SUMMARY = "NPM: cspell-util-bundle"
DESCRIPTION = "This is a bundle of external libraries used by cspell bundled into a single `.js`"
HOMEPAGE = "https://github.com/streetsidesoftware/cspell#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/cspell-util-bundle/-/cspell-util-bundle-4.1.4.tgz"
SRC_URI[md5sum] = "f508ebe43aded37c0c228faa1c156b17"
SRC_URI[sha256sum] = "d67ba5ac6dffbb22fcbd37b90a7aa76e2deee5b4e4d31d087d6e0d5a45efdda2"

NPM_PKGNAME = "cspell-util-bundle"

inherit npmhelper
inherit native
