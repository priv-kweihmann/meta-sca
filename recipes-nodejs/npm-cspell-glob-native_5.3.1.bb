SUMMARY = "NPM: cspell-glob"
DESCRIPTION = "Glob matcher for cspell"
HOMEPAGE = "https://github.com/streetsidesoftware/cspell/tree/master/packages/cspell-glob#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = "npm-micromatch-native"

SRC_URI = "https://registry.npmjs.org/cspell-glob/-/cspell-glob-5.3.1.tgz"
SRC_URI[md5sum] = "f676bec9b65bcf228a76bcb49cad48ca"
SRC_URI[sha256sum] = "26e6cea029ceb1dea311c059aa1b6bda48499aeed400f40cd399711d0f65d629"

NPM_PKGNAME = "cspell-glob"

inherit npmhelper
inherit native
