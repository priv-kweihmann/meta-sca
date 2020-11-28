SUMMARY = "NPM: cspell-dict-python"
DESCRIPTION = "Python dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/python#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=62f84db3eea2ff0da5510fedd081ea0c"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-python/-/cspell-dict-python-1.0.30.tgz"
SRC_URI[md5sum] = "f93ded05091285f256a9d14ccc030393"
SRC_URI[sha256sum] = "311989b083a15d78b1fa9639caf523697977c4ac9e9125ba03af261280ea63a7"

NPM_PKGNAME = "cspell-dict-python"

inherit npmhelper
inherit native
