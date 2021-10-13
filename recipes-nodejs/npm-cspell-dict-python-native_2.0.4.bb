SUMMARY = "NPM: @cspell/dict-python"
DESCRIPTION = "Python dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/main/dictionaries/python#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=62f84db3eea2ff0da5510fedd081ea0c"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@cspell/dict-python/-/dict-python-2.0.4.tgz"
SRC_URI[md5sum] = "c63ad574f1a1301c9d25c2a9fc8b0e06"
SRC_URI[sha256sum] = "84cab91e3bb555791dd64ebb9f7827c958472189f9808e3134d673581d5c684b"

NPM_PKGNAME = "@cspell/dict-python"

inherit npmhelper
inherit native
