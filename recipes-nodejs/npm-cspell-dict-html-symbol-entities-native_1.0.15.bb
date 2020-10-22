SUMMARY = "NPM: cspell-dict-html-symbol-entities"
DESCRIPTION = "Html Symbol Entities dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/html-symbol-entities#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fd6ca8d8865d18c1a5a6696c0f841ff0"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-html-symbol-entities/-/cspell-dict-html-symbol-entities-1.0.15.tgz"
SRC_URI[md5sum] = "d2560257880f84eee34fc57a53f4c294"
SRC_URI[sha256sum] = "43197ee995b66d8283dbad45f12ffea88176e9c1d8ff87b312b5095faade7a1f"

NPM_PKGNAME = "cspell-dict-html-symbol-entities"

inherit npmhelper
inherit native
