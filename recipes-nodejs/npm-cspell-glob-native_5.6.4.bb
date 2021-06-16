SUMMARY = "NPM: cspell-glob"
DESCRIPTION = "Glob matcher for cspell"
HOMEPAGE = "https://github.com/streetsidesoftware/cspell/tree/master/packages/cspell-glob#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = "npm-micromatch-native"

SRC_URI = "https://registry.npmjs.org/cspell-glob/-/cspell-glob-5.6.4.tgz"
SRC_URI[md5sum] = "175ff3bc0baac7190070aaf4d71f1493"
SRC_URI[sha256sum] = "c59bc10d819d2d8dfe0326fbe20cf7c401d3fddacecd4110d563fe93df80344f"

NPM_PKGNAME = "cspell-glob"

inherit npmhelper
inherit native
