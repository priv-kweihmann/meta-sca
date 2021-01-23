SUMMARY = "NPM: cspell-dict-fonts"
DESCRIPTION = "Font names dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/fonts#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=62f84db3eea2ff0da5510fedd081ea0c"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-fonts/-/cspell-dict-fonts-1.1.3.tgz"
SRC_URI[md5sum] = "279f35edec3467fffdc150bcb1c5d507"
SRC_URI[sha256sum] = "e8c6b4ff75efe3a5c3fa1c4d96dff5bc0523eeca5e3cfced47ed6ff77cf5012f"

NPM_PKGNAME = "cspell-dict-fonts"

inherit npmhelper
inherit native
