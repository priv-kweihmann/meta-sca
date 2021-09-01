SUMMARY = "NPM: @cspell/dict-en_us"
DESCRIPTION = "English dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/main/dictionaries/en_US#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=7dd826ae5afc5000681f6b6d35538cfd"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@cspell/dict-en_us/-/dict-en_us-2.0.2.tgz"
SRC_URI[md5sum] = "cbc076efb1c0517f0ea1f212897cb6e7"
SRC_URI[sha256sum] = "87bb2b1f989e5c7d6ec9d7afc2e296eafbdc2b359a3240d262f380578451feed"

NPM_PKGNAME = "@cspell/dict-en_us"

inherit npmhelper
inherit native
