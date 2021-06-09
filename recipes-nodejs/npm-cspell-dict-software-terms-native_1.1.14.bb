SUMMARY = "NPM: cspell-dict-software-terms"
DESCRIPTION = "Software terms dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/main/packages/software-terms#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=62f84db3eea2ff0da5510fedd081ea0c"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-software-terms/-/cspell-dict-software-terms-1.1.14.tgz"
SRC_URI[md5sum] = "52686bbb49eb3f6033b0a3d54e89ee3a"
SRC_URI[sha256sum] = "d6be51bf1cab1e72e745fd087da8c0b91e23bf3fcba844ead9de76961fc787ff"

NPM_PKGNAME = "cspell-dict-software-terms"

inherit npmhelper
inherit native
