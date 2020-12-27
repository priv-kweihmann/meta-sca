SUMMARY = "NPM: cspell-util-bundle"
DESCRIPTION = "This is a bundle of external libraries used by cspell bundled into a single `.js`"
HOMEPAGE = "https://github.com/streetsidesoftware/cspell#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/cspell-util-bundle/-/cspell-util-bundle-5.1.0.tgz"
SRC_URI[md5sum] = "8f8a243eca091d00f804a8341c91a08a"
SRC_URI[sha256sum] = "02453f209760f7f913f98f5aeb592f877b6f399ba0ebec9de38cbedf07d0a42e"

NPM_PKGNAME = "cspell-util-bundle"

inherit npmhelper
inherit native
