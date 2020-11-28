SUMMARY = "NPM: cspell-dict-companies"
DESCRIPTION = "Company names dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/companies#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=62f84db3eea2ff0da5510fedd081ea0c"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-companies/-/cspell-dict-companies-1.0.34.tgz"
SRC_URI[md5sum] = "f1f51fe2ed15ff0adc19d59485835f5c"
SRC_URI[sha256sum] = "3b42529f6bde7c9be4311ac580ebf86aa31362381f697a37c274792f269a9054"

NPM_PKGNAME = "cspell-dict-companies"

inherit npmhelper
inherit native
