SUMMARY = "NPM: cspell-dict-en-gb"
DESCRIPTION = "British English dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/en_GB#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fd6ca8d8865d18c1a5a6696c0f841ff0"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-en-gb/-/cspell-dict-en-gb-1.1.17.tgz"
SRC_URI[md5sum] = "92ce9a99449700e680d073d77cec09dc"
SRC_URI[sha256sum] = "93b86c0e25e50c7467f25dd250e96ad01828865d217cfcc03c6a43eebe754509"

NPM_PKGNAME = "cspell-dict-en-gb"

inherit npmhelper
inherit native
