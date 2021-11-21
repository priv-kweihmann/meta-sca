SUMMARY = "NPM: cspell-glob"
DESCRIPTION = "Glob matcher for cspell"
HOMEPAGE = "https://github.com/streetsidesoftware/cspell/tree/master/packages/cspell-glob#readme"

DEFAULT_PREFERENCE = "-1"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = "npm-micromatch-native"

SRC_URI = "https://registry.npmjs.org/cspell-glob/-/cspell-glob-5.13.0.tgz"
SRC_URI[md5sum] = "e8f63fcb66ce70ff84638e21f4560ec5"
SRC_URI[sha256sum] = "a75ef93dbf58892082f87be10d381644766ac5a6b68059f20467023200336a24"

NPM_PKGNAME = "cspell-glob"

inherit npmhelper
inherit native
