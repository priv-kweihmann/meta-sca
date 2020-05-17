SUMMARY = "NPM: cspell-dict-companies"
DESCRIPTION = "Company names dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/companies#readme"

DEPENDS = "npm-configstore-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fd6ca8d8865d18c1a5a6696c0f841ff0"

SRC_URI = "https://registry.npmjs.org/cspell-dict-companies/-/cspell-dict-companies-1.0.22.tgz"
SRC_URI[md5sum] = "7b5532b0cbd0fee9738c389352c0d75e"
SRC_URI[sha256sum] = "e1bafb7a92d30a4b9a104eab8750521f8ed9035e7cd979f3681aa7ac6fb3f154"

S = "${WORKDIR}/package"

NPM_PKGNAME = "cspell-dict-companies"

inherit npmhelper
inherit native
