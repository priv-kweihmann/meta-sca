SUMMARY = "NPM: cspell-dict-python"
DESCRIPTION = "Python dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/python#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fd6ca8d8865d18c1a5a6696c0f841ff0"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-python/-/cspell-dict-python-1.0.22.tgz"
SRC_URI[md5sum] = "1b11a3667abdd5e91f9cc203b90af6f2"
SRC_URI[sha256sum] = "adf5496e95b414e6969c4e3a1a0542c77f7477ded19ce91bfc29baca5e230bf6"

NPM_PKGNAME = "cspell-dict-python"

inherit npmhelper
inherit native
