SUMMARY = "NPM: cspell-glob"
DESCRIPTION = "Glob matcher for cspell"
HOMEPAGE = "https://github.com/streetsidesoftware/cspell/tree/master/packages/cspell-glob#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = "npm-micromatch-native"

SRC_URI = "https://registry.npmjs.org/cspell-glob/-/cspell-glob-5.0.3.tgz"
SRC_URI[md5sum] = "23cda0f143939e39bdf0045c3e0d742c"
SRC_URI[sha256sum] = "954b28c62bfa25cf78573cc40681d12340a83466cc6c2b7c97b0fea382bc0480"

NPM_PKGNAME = "cspell-glob"

inherit npmhelper
inherit native
