SUMMARY = "NPM: cspell-util-bundle"
DESCRIPTION = "This is a bundle of external libraries used by cspell bundled into a single `.js`"
HOMEPAGE = "https://github.com/streetsidesoftware/cspell#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/cspell-util-bundle/-/cspell-util-bundle-4.1.6.tgz"
SRC_URI[md5sum] = "46784991811bfc4cc2ad2c2c4393c4c2"
SRC_URI[sha256sum] = "9e716fc9296aa6891b508b0814b2b41ee9a1d86e63c419949921da48b704f28d"

NPM_PKGNAME = "cspell-util-bundle"

inherit npmhelper
inherit native
