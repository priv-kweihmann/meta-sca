SUMMARY = "NPM: cspell-dict-en-gb"
DESCRIPTION = "British English dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/main/packages/en_GB#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=62f84db3eea2ff0da5510fedd081ea0c"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-en-gb/-/cspell-dict-en-gb-1.2.5.tgz"
SRC_URI[md5sum] = "4029742bc622700b9bc4ebc7a1064f5f"
SRC_URI[sha256sum] = "32ba64265b6318603b16a3c57672d5e680042f62f10871396de0b6283c7cfec8"

NPM_PKGNAME = "cspell-dict-en-gb"

inherit npmhelper
inherit native
