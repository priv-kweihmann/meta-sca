SUMMARY = "NPM: cspell-dict-companies"
DESCRIPTION = "Company names dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/companies#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fd6ca8d8865d18c1a5a6696c0f841ff0"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-companies/-/cspell-dict-companies-1.0.28.tgz"
SRC_URI[md5sum] = "10658af98a8706c58ee59f4fb76f7cf2"
SRC_URI[sha256sum] = "55cb26de91c38280cee45ae44e18be277ccfff6cd078ba1645c3d7ae1ea7791e"

NPM_PKGNAME = "cspell-dict-companies"

inherit npmhelper
inherit native
