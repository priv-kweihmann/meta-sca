SUMMARY = "NPM: cspell-dict-html-symbol-entities"
DESCRIPTION = "Html Symbol Entities dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/html-symbol-entities#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=62f84db3eea2ff0da5510fedd081ea0c"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-html-symbol-entities/-/cspell-dict-html-symbol-entities-1.0.22.tgz"
SRC_URI[md5sum] = "f97e770b4dbb61e28af3d4a01832aee1"
SRC_URI[sha256sum] = "293c56ebfb1f97108e037a95d0aa02a8d1d9837a16ee94d64c00dd33eb760ee7"

NPM_PKGNAME = "cspell-dict-html-symbol-entities"

inherit npmhelper
inherit native
