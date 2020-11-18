SUMMARY = "NPM: cspell-util-bundle"
DESCRIPTION = "This is a bundle of external libraries used by cspell bundled into a single `.js`"
HOMEPAGE = "https://github.com/streetsidesoftware/cspell#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/cspell-util-bundle/-/cspell-util-bundle-4.1.8.tgz"
SRC_URI[md5sum] = "c060665eb672fc81bd80778de2c10b51"
SRC_URI[sha256sum] = "fbadf2f2f2d3c0bc12223ee888381b0d9658f35de996d68eb68c9fc657ed0590"

NPM_PKGNAME = "cspell-util-bundle"

inherit npmhelper
inherit native
