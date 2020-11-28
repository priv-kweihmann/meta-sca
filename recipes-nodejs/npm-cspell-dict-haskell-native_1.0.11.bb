SUMMARY = "NPM: cspell-dict-haskell"
DESCRIPTION = "Haskell dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/haskell#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=62f84db3eea2ff0da5510fedd081ea0c"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-haskell/-/cspell-dict-haskell-1.0.11.tgz"
SRC_URI[md5sum] = "963dd5dd6d47843df00648cbe3f76f2d"
SRC_URI[sha256sum] = "a2eb0437c0700113aaefa41d19ab87369e134646fe330111b2c9867470021ac8"

NPM_PKGNAME = "cspell-dict-haskell"

inherit npmhelper
inherit native
