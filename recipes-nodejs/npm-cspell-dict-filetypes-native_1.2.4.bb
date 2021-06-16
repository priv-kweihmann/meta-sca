SUMMARY = "NPM: cspell-dict-filetypes"
DESCRIPTION = "Filetypes dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/main/packages/filetypes#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=62f84db3eea2ff0da5510fedd081ea0c"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-filetypes/-/cspell-dict-filetypes-1.2.4.tgz"
SRC_URI[md5sum] = "2c067e71c712f6bd4b849a7280bf373c"
SRC_URI[sha256sum] = "3015a9a0ceba06ffac1633ccb5d158517ee221408d502a4f389910dc6a903dc9"

NPM_PKGNAME = "cspell-dict-filetypes"

inherit npmhelper
inherit native
