SUMMARY = "NPM: electron-to-chromium"
DESCRIPTION = "Provides a list of electron-to-chromium version mappings"
HOMEPAGE = "https://github.com/kilian/electron-to-chromium#readme"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c4bd4cd0c32203ba1496aa7686422491"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/electron-to-chromium/-/electron-to-chromium-1.3.836.tgz"
SRC_URI[md5sum] = "2840569bfd86626a2d61b151ac660207"
SRC_URI[sha256sum] = "74dec050974c00db3ef41c9be2a36c96d6e1e13cd6250f66e7238b6251230a5c"

NPM_PKGNAME = "electron-to-chromium"

inherit npmhelper
inherit native
