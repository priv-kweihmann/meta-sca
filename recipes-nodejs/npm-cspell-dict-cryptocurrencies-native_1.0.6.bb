SUMMARY = "NPM: cspell-dict-cryptocurrencies"
DESCRIPTION = "Cryptocurrencies dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/Cryptocurrencies#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=83b7ec6fa1831169a62a3b31af580cff"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-cryptocurrencies/-/cspell-dict-cryptocurrencies-1.0.6.tgz"
SRC_URI[md5sum] = "4e3a6409b8879179f9ae7eb85bd9d585"
SRC_URI[sha256sum] = "9d2838e187918c9839e910792eba4761ac1047d35f10b564c6c8b91ff2b9f6b5"

NPM_PKGNAME = "cspell-dict-cryptocurrencies"

inherit npmhelper
inherit native
