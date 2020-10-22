SUMMARY = "NPM: cspell-dict-fullstack"
DESCRIPTION = "Dictionary of terms used in Fullstack development."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/fullstack#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fd6ca8d8865d18c1a5a6696c0f841ff0"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-fullstack/-/cspell-dict-fullstack-1.0.27.tgz"
SRC_URI[md5sum] = "ec6378e10b2ff5b70833aeb8f3a00533"
SRC_URI[sha256sum] = "2d888b58bb8cb21399b25430d10514ae7f6a13112804435c4c1a90aae65d4049"

NPM_PKGNAME = "cspell-dict-fullstack"

inherit npmhelper
inherit native
