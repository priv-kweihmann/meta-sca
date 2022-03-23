SUMMARY = "NPM: @cspell/dict-software-terms"
DESCRIPTION = "Software terms dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/main/dictionaries/software-terms#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=62f84db3eea2ff0da5510fedd081ea0c"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@cspell/dict-software-terms/-/dict-software-terms-2.1.4.tgz"
SRC_URI[md5sum] = "fbd509d5d844044266f07d0f77ed5e96"
SRC_URI[sha256sum] = "9691ec08f166bd929dfb8b3cbece1ef2925ca5a5b23cdaa6d4757addb1fb4f8c"

NPM_PKGNAME = "@cspell/dict-software-terms"

inherit npmhelper
inherit native
