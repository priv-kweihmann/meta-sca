SUMMARY = "NPM: cspell-dict-cpp"
DESCRIPTION = "C/C++ Dictionary dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/cpp#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=62f84db3eea2ff0da5510fedd081ea0c"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-cpp/-/cspell-dict-cpp-1.1.36.tgz"
SRC_URI[md5sum] = "1cc261bcfff8b63c8a8baa8482f9cc41"
SRC_URI[sha256sum] = "f99dccec75f92d2f35ff9c7eb0b9d1fd05d1de0119ca4464d290521b9eb18841"

NPM_PKGNAME = "cspell-dict-cpp"

inherit npmhelper
inherit native
