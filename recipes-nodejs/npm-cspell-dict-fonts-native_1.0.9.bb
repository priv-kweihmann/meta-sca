SUMMARY = "NPM: cspell-dict-fonts"
DESCRIPTION = "Font names dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/fonts#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fd6ca8d8865d18c1a5a6696c0f841ff0"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-fonts/-/cspell-dict-fonts-1.0.9.tgz"
SRC_URI[md5sum] = "fe618625245461471b6c72d09ab17177"
SRC_URI[sha256sum] = "85e8719942ee6d9d93db7bf41696f5dcb9dde681653524a87e7b27ffa2f01ef9"

NPM_PKGNAME = "cspell-dict-fonts"

inherit npmhelper
inherit native
