SUMMARY = "NPM: cspell-dict-software-terms"
DESCRIPTION = "Software terms dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/software-terms#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fd6ca8d8865d18c1a5a6696c0f841ff0"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-software-terms/-/cspell-dict-software-terms-1.0.19.tgz"
SRC_URI[md5sum] = "8832f734d6db19d6f8f140134d2251b1"
SRC_URI[sha256sum] = "a722a498ebb8d949250e8f6678e526e5f2b94545cd47371948213fdd002d4e98"

NPM_PKGNAME = "cspell-dict-software-terms"

inherit npmhelper
inherit native
