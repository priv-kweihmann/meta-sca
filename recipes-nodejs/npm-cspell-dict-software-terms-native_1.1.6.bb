SUMMARY = "NPM: cspell-dict-software-terms"
DESCRIPTION = "Software terms dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/software-terms#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=62f84db3eea2ff0da5510fedd081ea0c"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-software-terms/-/cspell-dict-software-terms-1.1.6.tgz"
SRC_URI[md5sum] = "afb9db90f5d097517267e7c60de0ee23"
SRC_URI[sha256sum] = "079552cb723065a4bf3f53e60143ca8a4083683a6b972dff9bafa9e10b67fac1"

NPM_PKGNAME = "cspell-dict-software-terms"

inherit npmhelper
inherit native
