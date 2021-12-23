SUMMARY = "NPM: @cspell/dict-python"
DESCRIPTION = "Python dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/main/dictionaries/python#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=62f84db3eea2ff0da5510fedd081ea0c"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@cspell/dict-python/-/dict-python-2.0.5.tgz"
SRC_URI[md5sum] = "c9b63b00f129b5fbd437f26eb10c75ad"
SRC_URI[sha256sum] = "8bef229e9e3542bd09ab67fc6a3c3bd14ce60d70ae068e41584ac9283b84e17a"

NPM_PKGNAME = "@cspell/dict-python"

inherit npmhelper
inherit native
