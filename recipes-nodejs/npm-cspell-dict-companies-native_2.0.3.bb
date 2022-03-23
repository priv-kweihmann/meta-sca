SUMMARY = "NPM: @cspell/dict-companies"
DESCRIPTION = "Company names dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/main/dictionaries/companies#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=62f84db3eea2ff0da5510fedd081ea0c"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@cspell/dict-companies/-/dict-companies-2.0.3.tgz"
SRC_URI[md5sum] = "58fafd972f3cac8d8321293ca8f32624"
SRC_URI[sha256sum] = "e79e9acead383d84550e1df081349d34e826990ce073dd2a891cd220e449f1d7"

NPM_PKGNAME = "@cspell/dict-companies"

inherit npmhelper
inherit native
