SUMMARY = "NPM: electron-to-chromium"
DESCRIPTION = "Provides a list of electron-to-chromium version mappings"
HOMEPAGE = "https://github.com/kilian/electron-to-chromium#readme"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c4bd4cd0c32203ba1496aa7686422491"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/electron-to-chromium/-/electron-to-chromium-1.3.549.tgz"
SRC_URI[md5sum] = "5fbb37a2b32cf8850931eafa1d44701c"
SRC_URI[sha256sum] = "f3f39a5ac6bddcdf6e1e4708ac4dd1dcfa17895084f3acfee5c60a86e5596236"

NPM_PKGNAME = "electron-to-chromium"

inherit npmhelper
inherit native
