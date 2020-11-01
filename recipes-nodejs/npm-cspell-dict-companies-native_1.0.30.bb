SUMMARY = "NPM: cspell-dict-companies"
DESCRIPTION = "Company names dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/companies#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fd6ca8d8865d18c1a5a6696c0f841ff0"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-companies/-/cspell-dict-companies-1.0.30.tgz"
SRC_URI[md5sum] = "c4641182dc9cc0981ffc7dc374a0d8ef"
SRC_URI[sha256sum] = "c964f696d942a27fefae1fb1e6f71a4f5fb7844fcf734981a3958aedd66db0d9"

NPM_PKGNAME = "cspell-dict-companies"

inherit npmhelper
inherit native
