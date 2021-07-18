SUMMARY = "NPM: electron-to-chromium"
DESCRIPTION = "Provides a list of electron-to-chromium version mappings"
HOMEPAGE = "https://github.com/kilian/electron-to-chromium#readme"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c4bd4cd0c32203ba1496aa7686422491"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/electron-to-chromium/-/electron-to-chromium-1.3.779.tgz"
SRC_URI[md5sum] = "7ddf2fa0cb621e7aab855b735ea4557b"
SRC_URI[sha256sum] = "e54658a1469706878b4570e153a3051003757074c18287f440b88ad703e535da"

NPM_PKGNAME = "electron-to-chromium"

inherit npmhelper
inherit native
