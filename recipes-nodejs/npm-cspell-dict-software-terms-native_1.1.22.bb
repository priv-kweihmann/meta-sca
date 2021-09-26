SUMMARY = "NPM: cspell-dict-software-terms"
DESCRIPTION = "Software terms dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/main/packages/software-terms#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=62f84db3eea2ff0da5510fedd081ea0c"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-software-terms/-/cspell-dict-software-terms-1.1.22.tgz"
SRC_URI[md5sum] = "2ac75bd39a1f97c1d742111af6b6bb85"
SRC_URI[sha256sum] = "e37b354a1a76c13aa164058b68d6ecfb4aab5771bb95bbd2b38f7021283eae69"

NPM_PKGNAME = "cspell-dict-software-terms"

inherit npmhelper
inherit native
