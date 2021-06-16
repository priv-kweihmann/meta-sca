SUMMARY = "NPM: cspell-dict-software-terms"
DESCRIPTION = "Software terms dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/main/packages/software-terms#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=62f84db3eea2ff0da5510fedd081ea0c"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-software-terms/-/cspell-dict-software-terms-1.1.16.tgz"
SRC_URI[md5sum] = "9286c726c8cb207bde2ef0b0c76abb14"
SRC_URI[sha256sum] = "26d429f6119402dc73f25199e11b39acefd6cedb5cc48fdd141a5e9ec7214722"

NPM_PKGNAME = "cspell-dict-software-terms"

inherit npmhelper
inherit native
