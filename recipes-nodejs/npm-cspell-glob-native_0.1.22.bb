SUMMARY = "NPM: cspell-glob"
DESCRIPTION = "Glob matcher for cspell"
HOMEPAGE = "https://github.com/streetsidesoftware/cspell/tree/master/packages/cspell-glob#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = "npm-micromatch-native"

SRC_URI = "https://registry.npmjs.org/cspell-glob/-/cspell-glob-0.1.22.tgz"
SRC_URI[md5sum] = "54f4867bcca06fbb2e10b8ce8ecd8d83"
SRC_URI[sha256sum] = "2746d36de5b621733d717dec7cce07475cec63da3330c7a8cec7b4000c143718"

NPM_PKGNAME = "cspell-glob"

inherit npmhelper
inherit native
