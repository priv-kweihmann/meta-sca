SUMMARY = "NPM: cspell-glob"
DESCRIPTION = "Glob matcher for cspell"
HOMEPAGE = "https://github.com/streetsidesoftware/cspell/tree/master/packages/cspell-glob#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = "npm-micromatch-native"

SRC_URI = "https://registry.npmjs.org/cspell-glob/-/cspell-glob-5.2.0.tgz"
SRC_URI[md5sum] = "5cb8abb0e98f6f65a082547e81ed012e"
SRC_URI[sha256sum] = "a1fd3f21859b76494a681b073a9a75ca8e3f96137054c68d3f013ae67ceb2c38"

NPM_PKGNAME = "cspell-glob"

inherit npmhelper
inherit native
