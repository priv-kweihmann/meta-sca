SUMMARY = "NPM: electron-to-chromium"
DESCRIPTION = "Provides a list of electron-to-chromium version mappings"
HOMEPAGE = "https://github.com/kilian/electron-to-chromium#readme"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c4bd4cd0c32203ba1496aa7686422491"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/electron-to-chromium/-/electron-to-chromium-1.3.685.tgz"
SRC_URI[md5sum] = "127810e68ef39252d0c6d2689de05d1d"
SRC_URI[sha256sum] = "2af5107138461dddcae61a2e84ceb0267000fe28e1f485284538d7521463d6bd"

NPM_PKGNAME = "electron-to-chromium"

inherit npmhelper
inherit native
