SUMMARY = "NPM: cspell-dict-fonts"
DESCRIPTION = "Font names dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/fonts#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fd6ca8d8865d18c1a5a6696c0f841ff0"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-fonts/-/cspell-dict-fonts-1.0.7.tgz"
SRC_URI[md5sum] = "69d8dd2cdba36d2e4da160472085341a"
SRC_URI[sha256sum] = "092b884bcda8577fcba0a4bd1e329f92683c56e79f7eb1d002f5a7cd8107a87d"

NPM_PKGNAME = "cspell-dict-fonts"

inherit npmhelper
inherit native
