SUMMARY = "NPM: electron-to-chromium"
DESCRIPTION = "Provides a list of electron-to-chromium version mappings"
HOMEPAGE = "https://github.com/kilian/electron-to-chromium#readme"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c4bd4cd0c32203ba1496aa7686422491"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/electron-to-chromium/-/electron-to-chromium-1.3.791.tgz"
SRC_URI[md5sum] = "d744d819cb851213a86b98db3334b4fa"
SRC_URI[sha256sum] = "9494d913a950a15104f91a6884853b3d06a0421ac1ec981ca447f2ab775bf71e"

NPM_PKGNAME = "electron-to-chromium"

inherit npmhelper
inherit native
