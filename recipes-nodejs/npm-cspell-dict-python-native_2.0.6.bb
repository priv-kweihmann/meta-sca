SUMMARY = "NPM: @cspell/dict-python"
DESCRIPTION = "Python dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/main/dictionaries/python#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=62f84db3eea2ff0da5510fedd081ea0c"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@cspell/dict-python/-/dict-python-2.0.6.tgz"
SRC_URI[md5sum] = "a41ca3b84bbe2fae416375d6d476baba"
SRC_URI[sha256sum] = "750afa62fa1fedbd90d13023a99306656c19f97ec0803fecfd08669610703d06"

NPM_PKGNAME = "@cspell/dict-python"

inherit npmhelper
inherit native
