SUMMARY = "NPM: cspell-util-bundle"
DESCRIPTION = "This is a bundle of external libraries used by cspell bundled into a single `.js`"
HOMEPAGE = "https://github.com/streetsidesoftware/cspell#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/cspell-util-bundle/-/cspell-util-bundle-4.1.2.tgz"
SRC_URI[md5sum] = "87027ed019a1e4919ed59196580b13d3"
SRC_URI[sha256sum] = "257378c07325e6c828f9006cf864eeb120c0a2136eb7ddc646906c19438535bd"

NPM_PKGNAME = "cspell-util-bundle"

inherit npmhelper
inherit native
