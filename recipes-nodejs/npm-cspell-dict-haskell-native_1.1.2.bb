SUMMARY = "NPM: cspell-dict-haskell"
DESCRIPTION = "Haskell dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/haskell#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=62f84db3eea2ff0da5510fedd081ea0c"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-haskell/-/cspell-dict-haskell-1.1.2.tgz"
SRC_URI[md5sum] = "861ac4b9ecaed52010994fa2a069a03d"
SRC_URI[sha256sum] = "3bf3f2027b46616cefe98432c33507edfa4597940881726ea3729777709420c6"

NPM_PKGNAME = "cspell-dict-haskell"

inherit npmhelper
inherit native
