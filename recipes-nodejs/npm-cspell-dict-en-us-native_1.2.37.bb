SUMMARY = "NPM: cspell-dict-en_us"
DESCRIPTION = "English dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/en_US#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=7dd826ae5afc5000681f6b6d35538cfd"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-en_us/-/cspell-dict-en_us-1.2.37.tgz"
SRC_URI[md5sum] = "c2da1730671f4f0a5969c239172b68d7"
SRC_URI[sha256sum] = "0e7c1ea5a08b1b773a0e1f01c5686a04f535c8a47c0bd77ca04652ae7688a528"

NPM_PKGNAME = "cspell-dict-en_us"

inherit npmhelper
inherit native
