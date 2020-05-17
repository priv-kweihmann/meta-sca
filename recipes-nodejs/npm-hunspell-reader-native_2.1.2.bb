SUMMARY = "NPM: hunspell-reader"
DESCRIPTION = "A library for reading Hunspell Dictionary Files"
HOMEPAGE = "https://github.com/Jason-Rev/hunspell-reader#readme"

DEPENDS = "npm-commander-native npm-cspell-lib-native npm-fs-extra-native npm-gensequence-native npm-rxjs-native npm-rxjs-stream-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=008be8b1263ad5d61395b87b8c0d0681"

SRC_URI = "https://registry.npmjs.org/hunspell-reader/-/hunspell-reader-2.1.2.tgz"
SRC_URI[md5sum] = "dd99fa315955eeb779269887770ad0e3"
SRC_URI[sha256sum] = "2534b5e8451f284bd00bd4175b68b6f972642ff63944f873993d657e13bcefd6"

S = "${WORKDIR}/package"

NPM_PKGNAME = "hunspell-reader"

inherit npmhelper
inherit native
