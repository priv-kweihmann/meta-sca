SUMMARY = "NPM: cspell-dict-haskell"
DESCRIPTION = "Haskell dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/haskell#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fd6ca8d8865d18c1a5a6696c0f841ff0"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-haskell/-/cspell-dict-haskell-1.0.6.tgz"
SRC_URI[md5sum] = "12bcaeb69b1612764e933fe4f1aec40c"
SRC_URI[sha256sum] = "7da34b64f3b966a2b710fa69d9e783f9b38099973e35016929f439e63802891d"

NPM_PKGNAME = "cspell-dict-haskell"

inherit npmhelper
inherit native
