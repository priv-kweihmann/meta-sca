SUMMARY = "NPM: cspell-dict-en_us"
DESCRIPTION = "English dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/en_US#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=7dd826ae5afc5000681f6b6d35538cfd"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-en_us/-/cspell-dict-en_us-1.3.3.tgz"
SRC_URI[md5sum] = "ff7cffddbcd0aafee57c469a755c5ee3"
SRC_URI[sha256sum] = "7f534d825133da1cf046f2cc56a16400a4cadf12d6436b19aebb363a20ae6488"

NPM_PKGNAME = "cspell-dict-en_us"

inherit npmhelper
inherit native
