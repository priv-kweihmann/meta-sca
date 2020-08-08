SUMMARY = "NPM: cspell-dict-python"
DESCRIPTION = "Python dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/python#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fd6ca8d8865d18c1a5a6696c0f841ff0"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-python/-/cspell-dict-python-1.0.21.tgz"
SRC_URI[md5sum] = "b6a082d21d264656aa021cf85a49c31e"
SRC_URI[sha256sum] = "c1b13789cf06ec0dcf305e857b814ff6ae74c9a66a7a2a1305bc9464e1fe7cce"

NPM_PKGNAME = "cspell-dict-python"

inherit npmhelper
inherit native
