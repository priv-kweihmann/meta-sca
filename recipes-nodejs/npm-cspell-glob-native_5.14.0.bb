SUMMARY = "NPM: cspell-glob"
DESCRIPTION = "Glob matcher for cspell"
HOMEPAGE = "https://github.com/streetsidesoftware/cspell/tree/master/packages/cspell-glob#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = "npm-micromatch-native"

SRC_URI = "https://registry.npmjs.org/cspell-glob/-/cspell-glob-5.14.0.tgz"
SRC_URI[md5sum] = "953ef822a94839b52c6c34b57929c474"
SRC_URI[sha256sum] = "06ca44da0879265cf07fda8b3be1f33fc191550bc303cc273f73902ac0775174"

NPM_PKGNAME = "cspell-glob"

inherit npmhelper
inherit native
