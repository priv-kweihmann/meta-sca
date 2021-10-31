SUMMARY = "NPM: cspell-glob"
DESCRIPTION = "Glob matcher for cspell"
HOMEPAGE = "https://github.com/streetsidesoftware/cspell/tree/master/packages/cspell-glob#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = "npm-micromatch-native"

SRC_URI = "https://registry.npmjs.org/cspell-glob/-/cspell-glob-5.12.4.tgz"
SRC_URI[md5sum] = "95785e490aa84675b72aa472915c6496"
SRC_URI[sha256sum] = "42b5156e0395bb7f97d480e56eb7c0df5fac3729ac0b0ff885783c5766451d07"

NPM_PKGNAME = "cspell-glob"

inherit npmhelper
inherit native
