SUMMARY = "NPM: cspell-glob"
DESCRIPTION = "Glob matcher for cspell"
HOMEPAGE = "https://github.com/streetsidesoftware/cspell/tree/master/packages/cspell-glob#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = "npm-micromatch-native"

SRC_URI = "https://registry.npmjs.org/cspell-glob/-/cspell-glob-5.3.7.tgz"
SRC_URI[md5sum] = "4acc5bbefea9d6952325773ac4c1c3d6"
SRC_URI[sha256sum] = "d3442a69cff0e520cd7763072b543fb1aa4c38986079c587880050db69a9d768"

NPM_PKGNAME = "cspell-glob"

inherit npmhelper
inherit native
