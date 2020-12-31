SUMMARY = "NPM: cspell-util-bundle"
DESCRIPTION = "This is a bundle of external libraries used by cspell bundled into a single `.js`"
HOMEPAGE = "https://github.com/streetsidesoftware/cspell#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/cspell-util-bundle/-/cspell-util-bundle-5.1.1.tgz"
SRC_URI[md5sum] = "bb68c3512175f9cc63a255b0c3cf3b9f"
SRC_URI[sha256sum] = "c4abb8e1124fc7b4128a65936cb739c202f21be5d552737b88fdde451f3a7fe5"

NPM_PKGNAME = "cspell-util-bundle"

inherit npmhelper
inherit native
