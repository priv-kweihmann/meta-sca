SUMMARY = "NPM: cspell-dict-html"
DESCRIPTION = "HTML dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/html#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=62f84db3eea2ff0da5510fedd081ea0c"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-html/-/cspell-dict-html-1.2.3.tgz"
SRC_URI[md5sum] = "06a51a3b30ed43409e6d4c8c0b5c0278"
SRC_URI[sha256sum] = "93b2b59b6a20eead36911c3563b1ddc35e29cdc2eb209237830a7fd658a19939"

NPM_PKGNAME = "cspell-dict-html"

inherit npmhelper
inherit native
