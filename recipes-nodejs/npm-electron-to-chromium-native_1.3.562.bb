SUMMARY = "NPM: electron-to-chromium"
DESCRIPTION = "Provides a list of electron-to-chromium version mappings"
HOMEPAGE = "https://github.com/kilian/electron-to-chromium#readme"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c4bd4cd0c32203ba1496aa7686422491"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/electron-to-chromium/-/electron-to-chromium-1.3.562.tgz"
SRC_URI[md5sum] = "f75622309695ce11e56db95a2f66384a"
SRC_URI[sha256sum] = "674728cc791f4a539245a8078a31dbaf8c647209876ec6fb8f3fc5a171db0d2d"

NPM_PKGNAME = "electron-to-chromium"

inherit npmhelper
inherit native
