SUMMARY = "NPM: cspell-dict-en_us"
DESCRIPTION = "English dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/main/packages/en_US#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=7dd826ae5afc5000681f6b6d35538cfd"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-en_us/-/cspell-dict-en_us-1.3.5.tgz"
SRC_URI[md5sum] = "719d172115c09cc6f46c4057b7c7e3dc"
SRC_URI[sha256sum] = "eabf05dea5d4c3072f71a0a1b13fc74dce5bd28d4d69fff298c0c3f06e8a4fdf"

NPM_PKGNAME = "cspell-dict-en_us"

inherit npmhelper
inherit native
