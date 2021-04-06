SUMMARY = "NPM: cspell-dict-fullstack"
DESCRIPTION = "Dictionary of terms used in Fullstack development."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/fullstack#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=62f84db3eea2ff0da5510fedd081ea0c"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-fullstack/-/cspell-dict-fullstack-1.1.3.tgz"
SRC_URI[md5sum] = "be3d83a5974304df1e64746daaa6756e"
SRC_URI[sha256sum] = "4a669c147e7961036577c0fb0e5259fa3bc3b6611709090c1438a7171da466b3"

NPM_PKGNAME = "cspell-dict-fullstack"

inherit npmhelper
inherit native
