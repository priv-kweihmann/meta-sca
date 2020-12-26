SUMMARY = "NPM: cspell-dict-python"
DESCRIPTION = "Python dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/python#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=62f84db3eea2ff0da5510fedd081ea0c"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-python/-/cspell-dict-python-1.1.0.tgz"
SRC_URI[md5sum] = "8d769642ba09334f8a5b841018640eb8"
SRC_URI[sha256sum] = "e6d816bcd92006122721502c7907c25397c1d8e81fe8ca80662cf1cb8271215c"

NPM_PKGNAME = "cspell-dict-python"

inherit npmhelper
inherit native
