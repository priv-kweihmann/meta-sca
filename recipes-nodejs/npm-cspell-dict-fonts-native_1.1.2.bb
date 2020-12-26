SUMMARY = "NPM: cspell-dict-fonts"
DESCRIPTION = "Font names dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/fonts#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=62f84db3eea2ff0da5510fedd081ea0c"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-fonts/-/cspell-dict-fonts-1.1.2.tgz"
SRC_URI[md5sum] = "5fb03edbe67c4310f5e14725ee75a99e"
SRC_URI[sha256sum] = "6cffe33726b3a3f50d1544d145af49ad57329747c0d5f300051e183e38907322"

NPM_PKGNAME = "cspell-dict-fonts"

inherit npmhelper
inherit native
