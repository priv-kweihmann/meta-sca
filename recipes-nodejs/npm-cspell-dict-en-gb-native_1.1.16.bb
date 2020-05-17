SUMMARY = "NPM: cspell-dict-en-gb"
DESCRIPTION = "British English dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/en_GB#readme"

DEPENDS = "npm-configstore-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fd6ca8d8865d18c1a5a6696c0f841ff0"

SRC_URI = "https://registry.npmjs.org/cspell-dict-en-gb/-/cspell-dict-en-gb-1.1.16.tgz"
SRC_URI[md5sum] = "ccb2d9a4c174d5b6ecb3434e9ed2b6c6"
SRC_URI[sha256sum] = "a85c9edde7413035cda7df45927727b133c7e1f6a78b6033b6a54e514a299ec9"

S = "${WORKDIR}/package"

NPM_PKGNAME = "cspell-dict-en-gb"

inherit npmhelper
inherit native
