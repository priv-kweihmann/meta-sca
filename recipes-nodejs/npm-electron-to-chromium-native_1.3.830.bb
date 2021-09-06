SUMMARY = "NPM: electron-to-chromium"
DESCRIPTION = "Provides a list of electron-to-chromium version mappings"
HOMEPAGE = "https://github.com/kilian/electron-to-chromium#readme"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c4bd4cd0c32203ba1496aa7686422491"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/electron-to-chromium/-/electron-to-chromium-1.3.830.tgz"
SRC_URI[md5sum] = "15673fffd3bbde33a66969847643d595"
SRC_URI[sha256sum] = "6e9c030ea59e7e5683ad7f51c39a520e3be315eafae46cad069e8a30a01cc408"

NPM_PKGNAME = "electron-to-chromium"

inherit npmhelper
inherit native
