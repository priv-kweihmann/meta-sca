SUMMARY = "NPM: cspell-dict-software-terms"
DESCRIPTION = "Software terms dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/main/packages/software-terms#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=62f84db3eea2ff0da5510fedd081ea0c"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-software-terms/-/cspell-dict-software-terms-1.1.9.tgz"
SRC_URI[md5sum] = "7d83cd8105f2393188deeec45a5cae5c"
SRC_URI[sha256sum] = "e0d9661b650a4b640d7dc0084dda48eeb70ad1df7fc315ad0d5e2fb002a6bb26"

NPM_PKGNAME = "cspell-dict-software-terms"

inherit npmhelper
inherit native
