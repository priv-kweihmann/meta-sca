SUMMARY = "NPM: @cspell/dict-software-terms"
DESCRIPTION = "Software terms dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/main/dictionaries/software-terms#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=62f84db3eea2ff0da5510fedd081ea0c"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@cspell/dict-software-terms/-/dict-software-terms-2.1.2.tgz"
SRC_URI[md5sum] = "51a36bf58bd7b42de289b4ff7f0af29c"
SRC_URI[sha256sum] = "16c53404e04d862706d2b2b04cc2952b82821d34b152e9a6a115ecb6957c7eb0"

NPM_PKGNAME = "@cspell/dict-software-terms"

inherit npmhelper
inherit native
