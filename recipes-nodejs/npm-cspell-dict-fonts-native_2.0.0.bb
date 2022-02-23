SUMMARY = "NPM: @cspell/dict-fonts"
DESCRIPTION = "Font names dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/main/dictionaries/fonts#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=62f84db3eea2ff0da5510fedd081ea0c"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@cspell/dict-fonts/-/dict-fonts-2.0.0.tgz"
SRC_URI[md5sum] = "9dd965589abcb0493611156a9144b51a"
SRC_URI[sha256sum] = "ea930ae6ac6a970abc9c022266354773666d8ec29cac9d93acd6ad15ba2b0a54"

NPM_PKGNAME = "@cspell/dict-fonts"

inherit npmhelper
inherit native
