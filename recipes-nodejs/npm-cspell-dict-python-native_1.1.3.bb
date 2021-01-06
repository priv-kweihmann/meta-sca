SUMMARY = "NPM: cspell-dict-python"
DESCRIPTION = "Python dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/python#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=62f84db3eea2ff0da5510fedd081ea0c"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-python/-/cspell-dict-python-1.1.3.tgz"
SRC_URI[md5sum] = "57f30728cd581237ec95f9e17ea0ac19"
SRC_URI[sha256sum] = "7a6bc9963019bfd3f4939765327073834329925cf59b6b9c515edc63c2f77158"

NPM_PKGNAME = "cspell-dict-python"

inherit npmhelper
inherit native
