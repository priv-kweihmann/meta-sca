SUMMARY = "NPM: cspell-dict-npm"
DESCRIPTION = "Dictionary of common NPM packages for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/main/packages/npm#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=62f84db3eea2ff0da5510fedd081ea0c"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-npm/-/cspell-dict-npm-1.1.7.tgz"
SRC_URI[md5sum] = "768e28b5bf448e4cc42d6c23d7a7ce33"
SRC_URI[sha256sum] = "c3e7a2f6e472e798185914d851ac5d7ba5a02a28b8286bdbea50af1843d3f683"

NPM_PKGNAME = "cspell-dict-npm"

inherit npmhelper
inherit native
