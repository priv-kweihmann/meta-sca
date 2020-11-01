SUMMARY = "NPM: cspell-dict-npm"
DESCRIPTION = "NPM dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/npm#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fd6ca8d8865d18c1a5a6696c0f841ff0"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-npm/-/cspell-dict-npm-1.0.5.tgz"
SRC_URI[md5sum] = "8b0112a2c171b25b7cdd930415d2f840"
SRC_URI[sha256sum] = "c2bd137430d0bc69a8d1e8924da1540431fb28ff9991a0e11134d108dfd1e6f1"

NPM_PKGNAME = "cspell-dict-npm"

inherit npmhelper
inherit native
