SUMMARY = "NPM: cspell-dict-software-terms"
DESCRIPTION = "Software terms dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/main/packages/software-terms#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=62f84db3eea2ff0da5510fedd081ea0c"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-software-terms/-/cspell-dict-software-terms-1.1.21.tgz"
SRC_URI[md5sum] = "d061ce3bb3f20926d38551ac90ec85f9"
SRC_URI[sha256sum] = "74f44774da3b6b5c6fabcac1fcf86e53de264ad16d69b6a5016547b60cf1eaec"

NPM_PKGNAME = "cspell-dict-software-terms"

inherit npmhelper
inherit native
