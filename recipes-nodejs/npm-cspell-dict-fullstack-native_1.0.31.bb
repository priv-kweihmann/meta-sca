SUMMARY = "NPM: cspell-dict-fullstack"
DESCRIPTION = "Dictionary of terms used in Fullstack development."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/fullstack#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fd6ca8d8865d18c1a5a6696c0f841ff0"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-fullstack/-/cspell-dict-fullstack-1.0.31.tgz"
SRC_URI[md5sum] = "1432ca2fda263030020239eef9e80989"
SRC_URI[sha256sum] = "76080bbbbc10c2a9a4bd8396ddde20211839bdd5930ec754b64dcf98e1268f33"

NPM_PKGNAME = "cspell-dict-fullstack"

inherit npmhelper
inherit native
