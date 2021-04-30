SUMMARY = "NPM: cspell-dict-companies"
DESCRIPTION = "Company names dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/companies#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=62f84db3eea2ff0da5510fedd081ea0c"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-companies/-/cspell-dict-companies-1.1.4.tgz"
SRC_URI[md5sum] = "8beb785ff8f05b8556d0bb1dc60a85c6"
SRC_URI[sha256sum] = "83d7e3d43ed1bed09ab9c014e2acc7c41d26cfe12e104d46c684e98671ef9fc0"

NPM_PKGNAME = "cspell-dict-companies"

inherit npmhelper
inherit native
