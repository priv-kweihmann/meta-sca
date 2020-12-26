SUMMARY = "NPM: cspell-dict-golang"
DESCRIPTION = "Go Language dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/golang#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=62f84db3eea2ff0da5510fedd081ea0c"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-golang/-/cspell-dict-golang-1.2.0.tgz"
SRC_URI[md5sum] = "0ff3e88a722a552b1b50b0727bcae73f"
SRC_URI[sha256sum] = "465b467e020d7f61192832d79e1772d12fb826fad264914ef03378fbe932180e"

NPM_PKGNAME = "cspell-dict-golang"

inherit npmhelper
inherit native
