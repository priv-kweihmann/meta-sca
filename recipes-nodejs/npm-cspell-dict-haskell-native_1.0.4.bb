SUMMARY = "NPM: cspell-dict-haskell"
DESCRIPTION = "Haskell dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/haskell#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fd6ca8d8865d18c1a5a6696c0f841ff0"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-haskell/-/cspell-dict-haskell-1.0.4.tgz"
SRC_URI[md5sum] = "4efa4ad97c780f3a29644fe397f85158"
SRC_URI[sha256sum] = "cf2d6b3bb766b50bd4d65ca2de77970d1b9ddae10f5a5528085149fa7a2cfa06"

NPM_PKGNAME = "cspell-dict-haskell"

inherit npmhelper
inherit native
