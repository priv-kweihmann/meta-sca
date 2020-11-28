SUMMARY = "NPM: cspell-dict-en-gb"
DESCRIPTION = "British English dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/en_GB#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=62f84db3eea2ff0da5510fedd081ea0c"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-en-gb/-/cspell-dict-en-gb-1.1.27.tgz"
SRC_URI[md5sum] = "c3c972f2b0909ce2993b98669b848a6e"
SRC_URI[sha256sum] = "08e12310a3d7ce9ac31a2174a231360fc42edb256be88fea04cf3f084effb809"

NPM_PKGNAME = "cspell-dict-en-gb"

inherit npmhelper
inherit native
