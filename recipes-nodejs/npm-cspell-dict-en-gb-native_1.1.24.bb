SUMMARY = "NPM: cspell-dict-en-gb"
DESCRIPTION = "British English dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/en_GB#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fd6ca8d8865d18c1a5a6696c0f841ff0"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-en-gb/-/cspell-dict-en-gb-1.1.24.tgz"
SRC_URI[md5sum] = "f6c1165b52463c9ede08db99b7b56322"
SRC_URI[sha256sum] = "02a08432b2953893e097b652fce6b9bec477e351734e4f825847b1b835a33fcf"

NPM_PKGNAME = "cspell-dict-en-gb"

inherit npmhelper
inherit native
