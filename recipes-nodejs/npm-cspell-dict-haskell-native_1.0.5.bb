SUMMARY = "NPM: cspell-dict-haskell"
DESCRIPTION = "Haskell dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/haskell#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fd6ca8d8865d18c1a5a6696c0f841ff0"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-haskell/-/cspell-dict-haskell-1.0.5.tgz"
SRC_URI[md5sum] = "1eb88d6c5587030877a6d39be345ea2e"
SRC_URI[sha256sum] = "1dccd234fddd90a552fd37499db95720a5f71b1f10219efa63b1d892e6227a43"

NPM_PKGNAME = "cspell-dict-haskell"

inherit npmhelper
inherit native
