SUMMARY = "NPM: cspell-dict-python"
DESCRIPTION = "Python dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/python#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fd6ca8d8865d18c1a5a6696c0f841ff0"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-python/-/cspell-dict-python-1.0.23.tgz"
SRC_URI[md5sum] = "d30dc3b8c25abb9fd6f48edbd4eb93fc"
SRC_URI[sha256sum] = "08fb3448257ddbfcb979878bd5b587a6e4a62b2c0272a3853c225dd63c026ea4"

NPM_PKGNAME = "cspell-dict-python"

inherit npmhelper
inherit native
