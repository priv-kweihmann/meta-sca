SUMMARY = "NPM: cspell-dict-html"
DESCRIPTION = "HTML dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/main/packages/html#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=62f84db3eea2ff0da5510fedd081ea0c"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-html/-/cspell-dict-html-1.2.4.tgz"
SRC_URI[md5sum] = "adc6db9d8418c226691c5e1627bcd5ad"
SRC_URI[sha256sum] = "5e1973ece936c5b07a0d8f7b3b634575e26d94c0ea793a3ec0841dcb88c98bf1"

NPM_PKGNAME = "cspell-dict-html"

inherit npmhelper
inherit native
