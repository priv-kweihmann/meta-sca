SUMMARY = "NPM: @cspell/dict-software-terms"
DESCRIPTION = "Software terms dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/main/dictionaries/software-terms#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=62f84db3eea2ff0da5510fedd081ea0c"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@cspell/dict-software-terms/-/dict-software-terms-2.0.14.tgz"
SRC_URI[md5sum] = "b24d18ed244147a8b87f2afa545039d3"
SRC_URI[sha256sum] = "9122ccd740df46fb51a3da9129f5fb85d9de35e3350f12ef413368eadd3a5b55"

NPM_PKGNAME = "@cspell/dict-software-terms"

inherit npmhelper
inherit native
