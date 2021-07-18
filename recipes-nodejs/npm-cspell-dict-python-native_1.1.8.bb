SUMMARY = "NPM: cspell-dict-python"
DESCRIPTION = "Python dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/main/packages/python#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=62f84db3eea2ff0da5510fedd081ea0c"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-python/-/cspell-dict-python-1.1.8.tgz"
SRC_URI[md5sum] = "329094690aa0f7e42b20d07adf8c96f7"
SRC_URI[sha256sum] = "a677522eb62546d91888226f8753042c350467ab97ede8af74dbbdc2a8d4c41d"

NPM_PKGNAME = "cspell-dict-python"

inherit npmhelper
inherit native
