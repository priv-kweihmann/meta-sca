SUMMARY = "NPM: cspell-dict-software-terms"
DESCRIPTION = "Software terms dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/software-terms#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=62f84db3eea2ff0da5510fedd081ea0c"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-software-terms/-/cspell-dict-software-terms-1.1.4.tgz"
SRC_URI[md5sum] = "c54c28a901b133f62459064a7648ac16"
SRC_URI[sha256sum] = "b9daae45a64f68d1262034052d8b15adea21d70e69890f0c924244161ae8fc73"

NPM_PKGNAME = "cspell-dict-software-terms"

inherit npmhelper
inherit native
