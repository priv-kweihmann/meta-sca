SUMMARY = "NPM: cspell-glob"
DESCRIPTION = "Glob matcher for cspell"
HOMEPAGE = "https://github.com/streetsidesoftware/cspell/tree/main/packages/cspell-glob#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = "npm-micromatch-native"

SRC_URI = "https://registry.npmjs.org/cspell-glob/-/cspell-glob-5.19.3.tgz"
SRC_URI[md5sum] = "ccfd0fe92c015624b77827dccb33f9aa"
SRC_URI[sha256sum] = "4cd79b56615796848528ec61f913cb0bf6af4148d65f381ed5b8483ffd6cbca2"

NPM_PKGNAME = "cspell-glob"

inherit npmhelper
inherit native
