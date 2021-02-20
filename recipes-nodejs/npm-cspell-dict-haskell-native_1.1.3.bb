SUMMARY = "NPM: cspell-dict-haskell"
DESCRIPTION = "Haskell dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/haskell#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=62f84db3eea2ff0da5510fedd081ea0c"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-haskell/-/cspell-dict-haskell-1.1.3.tgz"
SRC_URI[md5sum] = "3d7ea4d607b86af4388b211dde8c991a"
SRC_URI[sha256sum] = "08c024f03f2f98dd84c098ce3f0794173cff631af665610441b6159408bdad4b"

NPM_PKGNAME = "cspell-dict-haskell"

inherit npmhelper
inherit native
