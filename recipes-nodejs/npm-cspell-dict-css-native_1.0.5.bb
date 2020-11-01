SUMMARY = "NPM: cspell-dict-css"
DESCRIPTION = "CSS dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/css#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fd6ca8d8865d18c1a5a6696c0f841ff0"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-css/-/cspell-dict-css-1.0.5.tgz"
SRC_URI[md5sum] = "226a68dd71e1daa3a79607f351d50109"
SRC_URI[sha256sum] = "cab73b562cc3776d01230dbf1b598856309d5f8e7862b78621674a5a5886952a"

NPM_PKGNAME = "cspell-dict-css"

inherit npmhelper
inherit native
