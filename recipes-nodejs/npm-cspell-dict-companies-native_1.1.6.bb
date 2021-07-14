SUMMARY = "NPM: cspell-dict-companies"
DESCRIPTION = "Company names dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/main/packages/companies#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=62f84db3eea2ff0da5510fedd081ea0c"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-companies/-/cspell-dict-companies-1.1.6.tgz"
SRC_URI[md5sum] = "392a18820382ba54d3702811d6685f45"
SRC_URI[sha256sum] = "27106dc2c352865d471865195f4b1a766500064c82beb2e10a10e218148fa319"

NPM_PKGNAME = "cspell-dict-companies"

inherit npmhelper
inherit native
