SUMMARY = "NPM: cspell-glob"
DESCRIPTION = "Glob matcher for cspell"
HOMEPAGE = "https://github.com/streetsidesoftware/cspell/tree/master/packages/cspell-glob#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = "npm-micromatch-native"

SRC_URI = "https://registry.npmjs.org/cspell-glob/-/cspell-glob-5.6.5.tgz"
SRC_URI[md5sum] = "0a3966e3fcda616358d753c423601beb"
SRC_URI[sha256sum] = "3fe1b58ef792220441530602a042c137d17a9315de9cdf1ea120d8dcb6076afc"

NPM_PKGNAME = "cspell-glob"

inherit npmhelper
inherit native
