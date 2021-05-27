SUMMARY = "NPM: cspell-dict-en-gb"
DESCRIPTION = "British English dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/main/packages/en_GB#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=62f84db3eea2ff0da5510fedd081ea0c"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-en-gb/-/cspell-dict-en-gb-1.2.2.tgz"
SRC_URI[md5sum] = "8f2f4c7432e60f3fc310613412b12143"
SRC_URI[sha256sum] = "87f8f150112068f22916b8bc96169cd35441b5c054bda3402690a644f5b6d0d2"

NPM_PKGNAME = "cspell-dict-en-gb"

inherit npmhelper
inherit native
