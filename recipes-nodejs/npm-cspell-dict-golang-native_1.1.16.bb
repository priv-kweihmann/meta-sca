SUMMARY = "NPM: cspell-dict-golang"
DESCRIPTION = "Go Language dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/golang#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fd6ca8d8865d18c1a5a6696c0f841ff0"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-golang/-/cspell-dict-golang-1.1.16.tgz"
SRC_URI[md5sum] = "900090303d8896ff0d9ee4103d1dc1a9"
SRC_URI[sha256sum] = "088dfba4c0834d1247d270ea8f5ceafe8cdbd03b8674e46a21da7ea454ae68d0"

NPM_PKGNAME = "cspell-dict-golang"

inherit npmhelper
inherit native
