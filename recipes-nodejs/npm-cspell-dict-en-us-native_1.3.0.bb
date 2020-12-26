SUMMARY = "NPM: cspell-dict-en_us"
DESCRIPTION = "English dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/en_US#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=7dd826ae5afc5000681f6b6d35538cfd"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-en_us/-/cspell-dict-en_us-1.3.0.tgz"
SRC_URI[md5sum] = "7346368904c24e4000adaafa203c91f6"
SRC_URI[sha256sum] = "040a53cf263084fa1e96a43f14b6a241f794cc2e6d3e337b38e06a308be33c0a"

NPM_PKGNAME = "cspell-dict-en_us"

inherit npmhelper
inherit native
