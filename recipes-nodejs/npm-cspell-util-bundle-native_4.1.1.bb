SUMMARY = "NPM: cspell-util-bundle"
DESCRIPTION = "This is a bundle of external libraries used by cspell bundled into a single `.js`"
HOMEPAGE = "https://github.com/streetsidesoftware/cspell#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/cspell-util-bundle/-/cspell-util-bundle-4.1.1.tgz"
SRC_URI[md5sum] = "9ee162e2e1f35c8e8ee6a0f4ba6c625e"
SRC_URI[sha256sum] = "aeab6a4775332649e6940b319f312350771e7dbcbc964077e445d90404996af5"

NPM_PKGNAME = "cspell-util-bundle"

inherit npmhelper
inherit native
