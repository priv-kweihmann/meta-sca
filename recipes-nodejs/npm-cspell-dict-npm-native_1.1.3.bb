SUMMARY = "NPM: cspell-dict-npm"
DESCRIPTION = "Dictionary of common NPM packages for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/npm#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=62f84db3eea2ff0da5510fedd081ea0c"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-npm/-/cspell-dict-npm-1.1.3.tgz"
SRC_URI[md5sum] = "512dd3b2c15ce81253809c03bbac61c4"
SRC_URI[sha256sum] = "de2841874327b45a799e4e3dccef549957183317a1109aeafc83507956abde38"

NPM_PKGNAME = "cspell-dict-npm"

inherit npmhelper
inherit native
