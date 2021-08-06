SUMMARY = "NPM: cspell-dict-companies"
DESCRIPTION = "Company names dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/main/packages/companies#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=62f84db3eea2ff0da5510fedd081ea0c"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-companies/-/cspell-dict-companies-1.1.7.tgz"
SRC_URI[md5sum] = "b1d4ade209e57c5ab5a511a8e95a0b38"
SRC_URI[sha256sum] = "b9c56193e143a5375bb10b80d753e4870a86065f48180653fe7ee4b1c5349021"

NPM_PKGNAME = "cspell-dict-companies"

inherit npmhelper
inherit native
