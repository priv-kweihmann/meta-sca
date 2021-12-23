SUMMARY = "NPM: @cspell/dict-software-terms"
DESCRIPTION = "Software terms dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/main/dictionaries/software-terms#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=62f84db3eea2ff0da5510fedd081ea0c"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@cspell/dict-software-terms/-/dict-software-terms-2.0.11.tgz"
SRC_URI[md5sum] = "903095f4afe2982670352a2ca7d6d1e5"
SRC_URI[sha256sum] = "b1ffbe6bec697f737f22c7c2bb1c8f5f122c825bcca333dd706503768c55186c"

NPM_PKGNAME = "@cspell/dict-software-terms"

inherit npmhelper
inherit native
