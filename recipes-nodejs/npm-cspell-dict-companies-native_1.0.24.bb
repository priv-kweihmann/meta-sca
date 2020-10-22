SUMMARY = "NPM: cspell-dict-companies"
DESCRIPTION = "Company names dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/companies#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fd6ca8d8865d18c1a5a6696c0f841ff0"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-companies/-/cspell-dict-companies-1.0.24.tgz"
SRC_URI[md5sum] = "710912ae181931c23f93f988f9732af2"
SRC_URI[sha256sum] = "036f84fd14b68cad4a3a4621566171af85c2f81302e226a80740f0825eceaf13"

NPM_PKGNAME = "cspell-dict-companies"

inherit npmhelper
inherit native
