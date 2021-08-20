SUMMARY = "NPM: cspell-dict-filetypes"
DESCRIPTION = "Filetypes dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/main/packages/filetypes#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=62f84db3eea2ff0da5510fedd081ea0c"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-filetypes/-/cspell-dict-filetypes-1.2.5.tgz"
SRC_URI[md5sum] = "54bbaa92950081fcbb38d18648a8b409"
SRC_URI[sha256sum] = "9fa280793830a4346f296bd27d4032f10cf15a43fd2ca49cde2d27d03e5c2bb8"

NPM_PKGNAME = "cspell-dict-filetypes"

inherit npmhelper
inherit native
