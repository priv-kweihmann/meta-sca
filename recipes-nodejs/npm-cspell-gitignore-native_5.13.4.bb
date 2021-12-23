SUMMARY = "NPM: cspell-gitignore"
DESCRIPTION = "Gitignore Glob matcher for cspell"
HOMEPAGE = "https://github.com/streetsidesoftware/cspell/tree/master/packages/cspell-gitignore#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = "npm-cspell-glob-native \
           npm-find-up-native"

SRC_URI = "https://registry.npmjs.org/cspell-gitignore/-/cspell-gitignore-5.13.4.tgz"
SRC_URI[md5sum] = "5679e1bf662a21abe4c4174774dfb496"
SRC_URI[sha256sum] = "47b41c3e8e34d420164e53f1101fea17dce359c41ee8f2c573797611ec36c12d"

NPM_PKGNAME = "cspell-gitignore"

inherit npmhelper
inherit native
