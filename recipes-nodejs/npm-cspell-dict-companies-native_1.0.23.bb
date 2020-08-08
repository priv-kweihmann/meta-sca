SUMMARY = "NPM: cspell-dict-companies"
DESCRIPTION = "Company names dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/companies#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fd6ca8d8865d18c1a5a6696c0f841ff0"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-companies/-/cspell-dict-companies-1.0.23.tgz"
SRC_URI[md5sum] = "de46997107b3e6ab8a445e1f5f1355c9"
SRC_URI[sha256sum] = "bb9984d1614798cf3f6ed29ba922625719084965cb67f2cc4be7a1db1ac34a2a"

NPM_PKGNAME = "cspell-dict-companies"

inherit npmhelper
inherit native
