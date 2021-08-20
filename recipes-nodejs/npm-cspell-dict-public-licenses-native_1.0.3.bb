SUMMARY = "NPM: @cspell/dict-public-licenses"
DESCRIPTION = "Common Public Licenses dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/main/packages/public-licenses#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=62f84db3eea2ff0da5510fedd081ea0c"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@cspell/dict-public-licenses/-/dict-public-licenses-1.0.3.tgz"
SRC_URI[md5sum] = "16900fa0692ca0d01a5a946b378ea163"
SRC_URI[sha256sum] = "af794f525a26509d34f6d0868925a8a20214e6e3df91854ca1b94da4063e75da"

NPM_PKGNAME = "@cspell/dict-public-licenses"

inherit npmhelper
inherit native
