SUMMARY = "NPM: cspell-glob"
DESCRIPTION = "Glob matcher for cspell"
HOMEPAGE = "https://github.com/streetsidesoftware/cspell/tree/main/packages/cspell-glob#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = "npm-micromatch-native"

SRC_URI = "https://registry.npmjs.org/cspell-glob/-/cspell-glob-5.18.5.tgz"
SRC_URI[md5sum] = "ada92a940f0becfcd4089233ed82e952"
SRC_URI[sha256sum] = "46e8082c4220a8695a5a8c436ac923dbdf3665bcba244b782dfc219edaf2bb1d"

NPM_PKGNAME = "cspell-glob"

inherit npmhelper
inherit native
