SUMMARY = "NPM: cspell-dict-software-terms"
DESCRIPTION = "Software terms dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/software-terms#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fd6ca8d8865d18c1a5a6696c0f841ff0"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-software-terms/-/cspell-dict-software-terms-1.0.13.tgz"
SRC_URI[md5sum] = "d14d935ec3746572cb643aa54bba10c5"
SRC_URI[sha256sum] = "9b125f15f96054d2019378a7891812272da1557582eff7e9f2e996db58fa7bbf"

NPM_PKGNAME = "cspell-dict-software-terms"

inherit npmhelper
inherit native
