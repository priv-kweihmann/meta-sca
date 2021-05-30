SUMMARY = "NPM: cspell-dict-software-terms"
DESCRIPTION = "Software terms dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/main/packages/software-terms#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=62f84db3eea2ff0da5510fedd081ea0c"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-software-terms/-/cspell-dict-software-terms-1.1.11.tgz"
SRC_URI[md5sum] = "3693df100c1dd14dc617885f144b7768"
SRC_URI[sha256sum] = "09189bfdf0ee5bc8b8392355c6b18b68aa2531026014a41f107c24e478352552"

NPM_PKGNAME = "cspell-dict-software-terms"

inherit npmhelper
inherit native
