SUMMARY = "NPM: cspell-dict-fonts"
DESCRIPTION = "Font names dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/fonts#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fd6ca8d8865d18c1a5a6696c0f841ff0"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-fonts/-/cspell-dict-fonts-1.0.5.tgz"
SRC_URI[md5sum] = "be9a948dbbfe9eb481bb0b20f07a5887"
SRC_URI[sha256sum] = "5c166de0441ca30971293cb13f8f5d8d9ee917b6a8c8d6c73f89d77681a87b7a"

NPM_PKGNAME = "cspell-dict-fonts"

inherit npmhelper
inherit native
