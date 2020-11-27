SUMMARY = "NPM: cspell-util-bundle"
DESCRIPTION = "This is a bundle of external libraries used by cspell bundled into a single `.js`"
HOMEPAGE = "https://github.com/streetsidesoftware/cspell#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/cspell-util-bundle/-/cspell-util-bundle-5.0.2.tgz"
SRC_URI[md5sum] = "48299e94baee42bcbbb3f47a213f70ae"
SRC_URI[sha256sum] = "a039367cfd649d55405265f125201278a337c32372c86ee01172208a1b6fb11c"

NPM_PKGNAME = "cspell-util-bundle"

inherit npmhelper
inherit native
