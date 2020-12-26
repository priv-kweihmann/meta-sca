SUMMARY = "NPM: cspell-dict-fullstack"
DESCRIPTION = "Dictionary of terms used in Fullstack development."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/fullstack#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=62f84db3eea2ff0da5510fedd081ea0c"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-fullstack/-/cspell-dict-fullstack-1.1.0.tgz"
SRC_URI[md5sum] = "7806cedf1662845dd127f084d9da285d"
SRC_URI[sha256sum] = "15f3f9078ebf1d07f23b11f9d1c574678deb9e82dc2f5e0746e6da9ecf67a6fd"

NPM_PKGNAME = "cspell-dict-fullstack"

inherit npmhelper
inherit native
