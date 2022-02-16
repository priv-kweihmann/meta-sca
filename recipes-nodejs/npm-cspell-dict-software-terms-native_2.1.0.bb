SUMMARY = "NPM: @cspell/dict-software-terms"
DESCRIPTION = "Software terms dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/main/dictionaries/software-terms#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=62f84db3eea2ff0da5510fedd081ea0c"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@cspell/dict-software-terms/-/dict-software-terms-2.1.0.tgz"
SRC_URI[md5sum] = "4c4c0b460d67110f19f3a1cc37fad04f"
SRC_URI[sha256sum] = "9de68d875544bb1820c15d408d7176e92d057d470ab7ea517f619ea2db6ede35"

NPM_PKGNAME = "@cspell/dict-software-terms"

inherit npmhelper
inherit native
