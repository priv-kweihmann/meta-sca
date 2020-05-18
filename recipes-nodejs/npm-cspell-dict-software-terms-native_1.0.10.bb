SUMMARY = "NPM: cspell-dict-software-terms"
DESCRIPTION = "Software terms dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/software-terms#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fd6ca8d8865d18c1a5a6696c0f841ff0"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-software-terms/-/cspell-dict-software-terms-1.0.10.tgz"
SRC_URI[md5sum] = "2734108293b8005d42efce9693fe171b"
SRC_URI[sha256sum] = "597645589b935fcac8ba106e7a835163b3225e31a8f55a4cb0189f0683acf068"

NPM_PKGNAME = "cspell-dict-software-terms"

inherit npmhelper
inherit native
