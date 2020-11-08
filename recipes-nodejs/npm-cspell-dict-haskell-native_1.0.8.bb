SUMMARY = "NPM: cspell-dict-haskell"
DESCRIPTION = "Haskell dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/haskell#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fd6ca8d8865d18c1a5a6696c0f841ff0"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-haskell/-/cspell-dict-haskell-1.0.8.tgz"
SRC_URI[md5sum] = "44163cd4d66eb53a4e002791313e4254"
SRC_URI[sha256sum] = "c89e7b531268da137bb26c48b5962191112ee94bc9e4e33c33c966795638a6ba"

NPM_PKGNAME = "cspell-dict-haskell"

inherit npmhelper
inherit native
