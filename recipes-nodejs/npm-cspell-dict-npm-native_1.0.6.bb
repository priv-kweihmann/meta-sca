SUMMARY = "NPM: cspell-dict-npm"
DESCRIPTION = "NPM dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/npm#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fd6ca8d8865d18c1a5a6696c0f841ff0"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-npm/-/cspell-dict-npm-1.0.6.tgz"
SRC_URI[md5sum] = "fbe2f804887fe6f5f7bcc5dc7de4fd72"
SRC_URI[sha256sum] = "e4fd08b36b875c7777847d214767a3fb2650edb9b516e407fbc6613d5f868836"

NPM_PKGNAME = "cspell-dict-npm"

inherit npmhelper
inherit native
