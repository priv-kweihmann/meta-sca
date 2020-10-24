SUMMARY = "NPM: cspell-dict-cryptocurrencies"
DESCRIPTION = "Cryptocurrencies dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/Cryptocurrencies#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=83b7ec6fa1831169a62a3b31af580cff"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-cryptocurrencies/-/cspell-dict-cryptocurrencies-1.0.4.tgz"
SRC_URI[md5sum] = "d8d377c1322f3b39e162c9191f1afc37"
SRC_URI[sha256sum] = "4315618ae3a6466c49618d62f588b5e0b0ebe8a01970bb422a0cf23772e092c2"

NPM_PKGNAME = "cspell-dict-cryptocurrencies"

inherit npmhelper
inherit native
