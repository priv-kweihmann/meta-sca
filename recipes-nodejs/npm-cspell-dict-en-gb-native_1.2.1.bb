SUMMARY = "NPM: cspell-dict-en-gb"
DESCRIPTION = "British English dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/en_GB#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=62f84db3eea2ff0da5510fedd081ea0c"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-en-gb/-/cspell-dict-en-gb-1.2.1.tgz"
SRC_URI[md5sum] = "e7756147a168b7fd13f5d27975e8ebf4"
SRC_URI[sha256sum] = "4f942335629c7a660af2ad4ba7bf85eb5b18cb0cf0b8713e80c0f17547f79110"

NPM_PKGNAME = "cspell-dict-en-gb"

inherit npmhelper
inherit native
