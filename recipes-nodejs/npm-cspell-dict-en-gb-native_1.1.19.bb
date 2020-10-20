SUMMARY = "NPM: cspell-dict-en-gb"
DESCRIPTION = "British English dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/en_GB#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fd6ca8d8865d18c1a5a6696c0f841ff0"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-en-gb/-/cspell-dict-en-gb-1.1.19.tgz"
SRC_URI[md5sum] = "ef70934eddd9ec5ce6061cbc1270c3be"
SRC_URI[sha256sum] = "8f385c5fb0c778e8622e9be5599ce2225eb4fb7f1b97e64c018f5541fbf8265d"

NPM_PKGNAME = "cspell-dict-en-gb"

inherit npmhelper
inherit native
