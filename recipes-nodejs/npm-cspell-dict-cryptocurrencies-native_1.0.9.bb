SUMMARY = "NPM: cspell-dict-cryptocurrencies"
DESCRIPTION = "Cryptocurrencies dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/Cryptocurrencies#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=9d60cb9270b846cbb621d0897110eb81"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-cryptocurrencies/-/cspell-dict-cryptocurrencies-1.0.9.tgz"
SRC_URI[md5sum] = "87870a8c588580ee64f1d1bc787b4e4a"
SRC_URI[sha256sum] = "55eeca1874ad32adac068c5e4185d82c902f3126d9c7463283853320262b5049"

NPM_PKGNAME = "cspell-dict-cryptocurrencies"

inherit npmhelper
inherit native
