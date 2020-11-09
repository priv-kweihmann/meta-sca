SUMMARY = "NPM: cspell-dict-golang"
DESCRIPTION = "Go Language dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/golang#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fd6ca8d8865d18c1a5a6696c0f841ff0"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-golang/-/cspell-dict-golang-1.1.20.tgz"
SRC_URI[md5sum] = "15cfc9c91672b7ff98b5b60b0ddfcf01"
SRC_URI[sha256sum] = "eff271bcde5354dc5bdc99fb0f7153a7c7974c35178440dda982dddb32ef0f74"

NPM_PKGNAME = "cspell-dict-golang"

inherit npmhelper
inherit native
