SUMMARY = "NPM: cspell-dict-companies"
DESCRIPTION = "Company names dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/main/packages/companies#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=62f84db3eea2ff0da5510fedd081ea0c"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-companies/-/cspell-dict-companies-1.1.5.tgz"
SRC_URI[md5sum] = "c0f83987df7f91a2ba8b12e6023230a4"
SRC_URI[sha256sum] = "2734bd4a8373c913d0ef6932f1f78af4d57452227721029932d8cef10f5ed51f"

NPM_PKGNAME = "cspell-dict-companies"

inherit npmhelper
inherit native
