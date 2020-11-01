SUMMARY = "NPM: cspell-dict-software-terms"
DESCRIPTION = "Software terms dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/software-terms#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fd6ca8d8865d18c1a5a6696c0f841ff0"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-software-terms/-/cspell-dict-software-terms-1.0.18.tgz"
SRC_URI[md5sum] = "b7d9259c605fc2794899cf4857d197b9"
SRC_URI[sha256sum] = "e845fb5eeb5b5f1b169e4fc660cc8bef59fdf7def34a66f4ef7d8c2e6395ec85"

NPM_PKGNAME = "cspell-dict-software-terms"

inherit npmhelper
inherit native
