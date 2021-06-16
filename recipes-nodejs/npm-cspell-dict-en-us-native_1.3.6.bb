SUMMARY = "NPM: cspell-dict-en_us"
DESCRIPTION = "English dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/main/packages/en_US#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=7dd826ae5afc5000681f6b6d35538cfd"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-en_us/-/cspell-dict-en_us-1.3.6.tgz"
SRC_URI[md5sum] = "922b381b15707ef7131b72e38c94274d"
SRC_URI[sha256sum] = "8515ed69bcd4676d221967b916b0494511d5127630e23ec46b16104afd8e49c0"

NPM_PKGNAME = "cspell-dict-en_us"

inherit npmhelper
inherit native
