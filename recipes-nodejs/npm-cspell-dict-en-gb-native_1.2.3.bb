SUMMARY = "NPM: cspell-dict-en-gb"
DESCRIPTION = "British English dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/main/packages/en_GB#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=62f84db3eea2ff0da5510fedd081ea0c"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-en-gb/-/cspell-dict-en-gb-1.2.3.tgz"
SRC_URI[md5sum] = "6eb1ea2848a3388b56a067efabb16f35"
SRC_URI[sha256sum] = "9b40ad6300e281802361bf2de2dae27b022ff40fa0c9f18c87819cc475cdfe8d"

NPM_PKGNAME = "cspell-dict-en-gb"

inherit npmhelper
inherit native
