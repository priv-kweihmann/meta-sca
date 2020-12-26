SUMMARY = "NPM: cspell-dict-cryptocurrencies"
DESCRIPTION = "Cryptocurrencies dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/Cryptocurrencies#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=9d60cb9270b846cbb621d0897110eb81"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-cryptocurrencies/-/cspell-dict-cryptocurrencies-1.1.2.tgz"
SRC_URI[md5sum] = "623d777e350536bd7455a2800a9b3711"
SRC_URI[sha256sum] = "d3dc104d93ca802f228e44e1280a78f308c69b90eb6613dbaa1e3ed54a155754"

NPM_PKGNAME = "cspell-dict-cryptocurrencies"

inherit npmhelper
inherit native
