SUMMARY = "NPM: cspell-dict-en_us"
DESCRIPTION = "English dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/en_US#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-en_us/-/cspell-dict-en_us-1.2.27.tgz"
SRC_URI[md5sum] = "d0fe60152ef56b3bb31031c24974f81a"
SRC_URI[sha256sum] = "62c31fc90f5361e54ee4f65c28f7f003590eab10a364cd67c3d12513f512daab"

NPM_PKGNAME = "cspell-dict-en_us"

inherit npmhelper
inherit native
