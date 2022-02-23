SUMMARY = "NPM: @cspell/dict-cryptocurrencies"
DESCRIPTION = "Cryptocurrencies dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/main/dictionaries/Cryptocurrencies#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a90b3abcdd1245617075a425280c8831"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@cspell/dict-cryptocurrencies/-/dict-cryptocurrencies-2.0.0.tgz"
SRC_URI[md5sum] = "be627381fc87c501ab13c61f56a92ec4"
SRC_URI[sha256sum] = "a2012d5cf845b8dbbcd72a3a7a2f8816d921aa3e4dea14688b7eda65ff1d9dc4"

NPM_PKGNAME = "@cspell/dict-cryptocurrencies"

inherit npmhelper
inherit native
