SUMMARY = "NPM: @cspell/dict-en_us"
DESCRIPTION = "English dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/main/dictionaries/en_US#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=7dd826ae5afc5000681f6b6d35538cfd"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@cspell/dict-en_us/-/dict-en_us-2.1.1.tgz"
SRC_URI[md5sum] = "103ef8fb60df33c53121f687ef2627ec"
SRC_URI[sha256sum] = "c57812b93ab869509c0b7ea33e4d28d4138d40bb21b7871dedeb305675620e2a"

NPM_PKGNAME = "@cspell/dict-en_us"

inherit npmhelper
inherit native
