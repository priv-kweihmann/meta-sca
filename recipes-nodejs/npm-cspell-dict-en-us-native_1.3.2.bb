SUMMARY = "NPM: cspell-dict-en_us"
DESCRIPTION = "English dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/en_US#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=7dd826ae5afc5000681f6b6d35538cfd"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-en_us/-/cspell-dict-en_us-1.3.2.tgz"
SRC_URI[md5sum] = "6b8eca08cd0c09c4406c22526ef704c6"
SRC_URI[sha256sum] = "6abf20c1bf5388aee98172e0bcb1f54b28ee9beb037cdb5be75f01d3c3669b8d"

NPM_PKGNAME = "cspell-dict-en_us"

inherit npmhelper
inherit native
