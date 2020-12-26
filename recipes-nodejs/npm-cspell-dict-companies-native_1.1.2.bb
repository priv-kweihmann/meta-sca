SUMMARY = "NPM: cspell-dict-companies"
DESCRIPTION = "Company names dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/companies#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=62f84db3eea2ff0da5510fedd081ea0c"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-companies/-/cspell-dict-companies-1.1.2.tgz"
SRC_URI[md5sum] = "e9f9330bfbf6fe34cf577705a12c56a9"
SRC_URI[sha256sum] = "e3af465d90474169047227dea1c48a523d88e0174c6f944cbe9a75fc37d88fe9"

NPM_PKGNAME = "cspell-dict-companies"

inherit npmhelper
inherit native
