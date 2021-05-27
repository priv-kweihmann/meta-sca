SUMMARY = "NPM: cspell-dict-en_us"
DESCRIPTION = "English dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/main/packages/en_US#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=7dd826ae5afc5000681f6b6d35538cfd"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-en_us/-/cspell-dict-en_us-1.3.4.tgz"
SRC_URI[md5sum] = "26c9580716817fed24e828dd32d554ab"
SRC_URI[sha256sum] = "7d7fa1c52b1ead436438186ae10b23d7890d3bbb1c66fa881ae4894cf3d14ae0"

NPM_PKGNAME = "cspell-dict-en_us"

inherit npmhelper
inherit native
