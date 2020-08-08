SUMMARY = "NPM: cspell-dict-html-symbol-entities"
DESCRIPTION = "Html Symbol Entities dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/html-symbol-entities#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fd6ca8d8865d18c1a5a6696c0f841ff0"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-html-symbol-entities/-/cspell-dict-html-symbol-entities-1.0.14.tgz"
SRC_URI[md5sum] = "d77be4ba3732bb167306a6c002ac1591"
SRC_URI[sha256sum] = "98120f9f2885ef0033b30f6c7da570db7af52f9ee6b901ef66953b1d53f57149"

NPM_PKGNAME = "cspell-dict-html-symbol-entities"

inherit npmhelper
inherit native
