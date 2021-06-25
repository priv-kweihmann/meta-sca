SUMMARY = "NPM: cspell-dict-python"
DESCRIPTION = "Python dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/main/packages/python#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=62f84db3eea2ff0da5510fedd081ea0c"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-python/-/cspell-dict-python-1.1.7.tgz"
SRC_URI[md5sum] = "53a414baf0c8038170b9ae6269120ef9"
SRC_URI[sha256sum] = "0516e49c859d001b83efc64158aa971b5a857a2fb6dae703f28b341281e9fdaf"

NPM_PKGNAME = "cspell-dict-python"

inherit npmhelper
inherit native
