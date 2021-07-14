SUMMARY = "NPM: cspell-dict-software-terms"
DESCRIPTION = "Software terms dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/main/packages/software-terms#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=62f84db3eea2ff0da5510fedd081ea0c"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-software-terms/-/cspell-dict-software-terms-1.1.17.tgz"
SRC_URI[md5sum] = "365120c0fca315482a5f4c8fb9a16821"
SRC_URI[sha256sum] = "c3ef26627964ce4a15c9a6d90ecd74e907f2b1872841e7089439810300dcd8c9"

NPM_PKGNAME = "cspell-dict-software-terms"

inherit npmhelper
inherit native
