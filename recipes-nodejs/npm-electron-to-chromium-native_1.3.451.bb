SUMMARY = "NPM: electron-to-chromium"
DESCRIPTION = "Provides a list of electron-to-chromium version mappings"
HOMEPAGE = "https://github.com/kilian/electron-to-chromium#readme"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c4bd4cd0c32203ba1496aa7686422491"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/electron-to-chromium/-/electron-to-chromium-1.3.451.tgz"
SRC_URI[md5sum] = "1bb5d2d911f8cd2797cd311d51ca425e"
SRC_URI[sha256sum] = "35b37b32403c15946283a5e7c1a0f87a13714877be6f31fdb779dbfba720202c"

NPM_PKGNAME = "electron-to-chromium"

inherit npmhelper
inherit native
