SUMMARY = "NPM: cspell-dict-npm"
DESCRIPTION = "Dictionary of common NPM packages for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/main/packages/npm#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=62f84db3eea2ff0da5510fedd081ea0c"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-npm/-/cspell-dict-npm-1.1.6.tgz"
SRC_URI[md5sum] = "e11de1b048b788fda34f6ad836337df5"
SRC_URI[sha256sum] = "8a31fe321e3a14e7fee7b3efd4d184befcfd53840bd18e02c11f637c73eb3127"

NPM_PKGNAME = "cspell-dict-npm"

inherit npmhelper
inherit native
