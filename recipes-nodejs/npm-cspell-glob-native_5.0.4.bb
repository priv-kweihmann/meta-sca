SUMMARY = "NPM: cspell-glob"
DESCRIPTION = "Glob matcher for cspell"
HOMEPAGE = "https://github.com/streetsidesoftware/cspell/tree/master/packages/cspell-glob#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = "npm-micromatch-native"

SRC_URI = "https://registry.npmjs.org/cspell-glob/-/cspell-glob-5.0.4.tgz"
SRC_URI[md5sum] = "532d367c5da73406f2e88275f07e3477"
SRC_URI[sha256sum] = "4361ee4e49c30c3ba86e5dd3bf895749e937981ccd983e3b553033e355cb1fcc"

NPM_PKGNAME = "cspell-glob"

inherit npmhelper
inherit native
