SUMMARY = "NPM: cspell-util-bundle"
DESCRIPTION = "This is a bundle of external libraries used by cspell bundled into a single `.js`"
HOMEPAGE = "https://github.com/streetsidesoftware/cspell#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/cspell-util-bundle/-/cspell-util-bundle-4.0.12.tgz"
SRC_URI[md5sum] = "9b8d64fd7ce75604998cfd5ffcb0177d"
SRC_URI[sha256sum] = "2a86b79c5fa0bcc4c419dd6e5f0d6f71284283b6755e9beecb060d0590f69be9"

NPM_PKGNAME = "cspell-util-bundle"

inherit npmhelper
inherit native
