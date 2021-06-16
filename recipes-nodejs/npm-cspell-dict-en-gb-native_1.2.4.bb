SUMMARY = "NPM: cspell-dict-en-gb"
DESCRIPTION = "British English dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/main/packages/en_GB#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=62f84db3eea2ff0da5510fedd081ea0c"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-en-gb/-/cspell-dict-en-gb-1.2.4.tgz"
SRC_URI[md5sum] = "6c9371e7e1337e2c900c37c7ddb5c325"
SRC_URI[sha256sum] = "3979c5936a1509e6763282a1e6cb175be7cf237aea58620fe9872c8214f04e60"

NPM_PKGNAME = "cspell-dict-en-gb"

inherit npmhelper
inherit native
