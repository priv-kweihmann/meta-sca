SUMMARY = "NPM: @cspell/dict-software-terms"
DESCRIPTION = "Software terms dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/main/dictionaries/software-terms#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=62f84db3eea2ff0da5510fedd081ea0c"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@cspell/dict-software-terms/-/dict-software-terms-2.0.15.tgz"
SRC_URI[md5sum] = "f5325ad17e84eae23c69910106fcb29c"
SRC_URI[sha256sum] = "c5e2407a12801a75dde3124a532872d61d44bd388233e1515f2180f195020b71"

NPM_PKGNAME = "@cspell/dict-software-terms"

inherit npmhelper
inherit native
