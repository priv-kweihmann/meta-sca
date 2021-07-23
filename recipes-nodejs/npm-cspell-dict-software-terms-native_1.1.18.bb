SUMMARY = "NPM: cspell-dict-software-terms"
DESCRIPTION = "Software terms dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/main/packages/software-terms#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=62f84db3eea2ff0da5510fedd081ea0c"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-software-terms/-/cspell-dict-software-terms-1.1.18.tgz"
SRC_URI[md5sum] = "d102fd6fd840429daf24e2fb35044ea1"
SRC_URI[sha256sum] = "753cc92ae98d1c00860421a844c5b6f90a3e4e64289aa881463437a7324115ce"

NPM_PKGNAME = "cspell-dict-software-terms"

inherit npmhelper
inherit native
