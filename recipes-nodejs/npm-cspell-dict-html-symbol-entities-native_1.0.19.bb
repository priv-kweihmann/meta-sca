SUMMARY = "NPM: cspell-dict-html-symbol-entities"
DESCRIPTION = "Html Symbol Entities dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/html-symbol-entities#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fd6ca8d8865d18c1a5a6696c0f841ff0"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-html-symbol-entities/-/cspell-dict-html-symbol-entities-1.0.19.tgz"
SRC_URI[md5sum] = "11acd2a88f4d5d1fd798f38f6f098d39"
SRC_URI[sha256sum] = "33f24bb88ea9a70f570539ebed55cafe2ed1a7e072d6925309dc70f4c4670925"

NPM_PKGNAME = "cspell-dict-html-symbol-entities"

inherit npmhelper
inherit native
