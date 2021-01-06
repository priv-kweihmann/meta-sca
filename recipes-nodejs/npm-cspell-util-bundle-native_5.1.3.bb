SUMMARY = "NPM: cspell-util-bundle"
DESCRIPTION = "This is a bundle of external libraries used by cspell bundled into a single `.js`"
HOMEPAGE = "https://github.com/streetsidesoftware/cspell#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/cspell-util-bundle/-/cspell-util-bundle-5.1.3.tgz"
SRC_URI[md5sum] = "122783c9a013d33ff016d3a2030b351f"
SRC_URI[sha256sum] = "f0c0241222b452fba6ffa61cb18cc3eb7c0989be56ef6761ac283649a221bdee"

NPM_PKGNAME = "cspell-util-bundle"

inherit npmhelper
inherit native
