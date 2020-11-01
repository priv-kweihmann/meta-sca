SUMMARY = "NPM: cspell-dict-html"
DESCRIPTION = "HTML dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/html#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fd6ca8d8865d18c1a5a6696c0f841ff0"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-html/-/cspell-dict-html-1.1.0.tgz"
SRC_URI[md5sum] = "d546d15bb2605a7c067cc9ee52b17050"
SRC_URI[sha256sum] = "c0fd904a241f7d4f36d32f9f346f272d12aef669b447d2fcc8b7ca53ca7baf32"

NPM_PKGNAME = "cspell-dict-html"

inherit npmhelper
inherit native
