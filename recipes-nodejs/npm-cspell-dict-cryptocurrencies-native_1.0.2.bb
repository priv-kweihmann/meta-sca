SUMMARY = "NPM: cspell-dict-cryptocurrencies"
DESCRIPTION = "Cryptocurrencies dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/Cryptocurrencies#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=83b7ec6fa1831169a62a3b31af580cff"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-cryptocurrencies/-/cspell-dict-cryptocurrencies-1.0.2.tgz"
SRC_URI[md5sum] = "b5989ac481d02c466d6cdcf23b4c0553"
SRC_URI[sha256sum] = "5554dee7a71102fc92c0d2b7ee39f9376e3ac0e3b85114d35d70f62a956cffc1"

NPM_PKGNAME = "cspell-dict-cryptocurrencies"

inherit npmhelper
inherit native
