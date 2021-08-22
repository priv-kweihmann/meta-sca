SUMMARY = "NPM: cspell-glob"
DESCRIPTION = "Glob matcher for cspell"
HOMEPAGE = "https://github.com/streetsidesoftware/cspell/tree/master/packages/cspell-glob#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = "npm-micromatch-native"

SRC_URI = "https://registry.npmjs.org/cspell-glob/-/cspell-glob-5.8.0.tgz"
SRC_URI[md5sum] = "9f06a8913f918e858307691288b17377"
SRC_URI[sha256sum] = "516fd1cc286d78e6a33b51b7a4b106aeaef5b33226b96d859990629674c121a2"

NPM_PKGNAME = "cspell-glob"

inherit npmhelper
inherit native
