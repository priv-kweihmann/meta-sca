SUMMARY = "NPM: cspell-dict-en_us"
DESCRIPTION = "English dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/main/packages/en_US#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=7dd826ae5afc5000681f6b6d35538cfd"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-en_us/-/cspell-dict-en_us-1.3.7.tgz"
SRC_URI[md5sum] = "e2ab36b14a5464e6678c5fbbd987d1db"
SRC_URI[sha256sum] = "5041bd98a6334904697ea928fc61f9d7114de0d7372013a79adb14d670676464"

NPM_PKGNAME = "cspell-dict-en_us"

inherit npmhelper
inherit native
