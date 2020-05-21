SUMMARY = "NPM: hunspell-reader"
DESCRIPTION = "A library for reading Hunspell Dictionary Files"
HOMEPAGE = "https://github.com/Jason-Rev/hunspell-reader#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=008be8b1263ad5d61395b87b8c0d0681"

DEPENDS = "npm-commander-native \
           npm-fs-extra-native \
           npm-gensequence-native \
           npm-iconv-lite-native"

SRC_URI = "https://registry.npmjs.org/hunspell-reader/-/hunspell-reader-3.2.0.tgz"
SRC_URI[md5sum] = "237241f6d3d2448234bbd31d7de664e8"
SRC_URI[sha256sum] = "4e5b0336bb73f9f99a1a1a96907518cfd7b67df2df4f334da30c7e7e160bcdb1"

NPM_PKGNAME = "hunspell-reader"

inherit npmhelper
inherit native
