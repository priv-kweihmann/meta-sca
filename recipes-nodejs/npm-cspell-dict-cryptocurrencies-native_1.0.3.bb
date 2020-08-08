SUMMARY = "NPM: cspell-dict-cryptocurrencies"
DESCRIPTION = "Cryptocurrencies dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/Cryptocurrencies#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=83b7ec6fa1831169a62a3b31af580cff"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-cryptocurrencies/-/cspell-dict-cryptocurrencies-1.0.3.tgz"
SRC_URI[md5sum] = "59e66abffa771e05c9c48c2bcc7763f5"
SRC_URI[sha256sum] = "39891c41bb5b2ebf50f8f9afa37eabbd2f7ee54182115a14f25c6f1855e2f167"

NPM_PKGNAME = "cspell-dict-cryptocurrencies"

inherit npmhelper
inherit native
