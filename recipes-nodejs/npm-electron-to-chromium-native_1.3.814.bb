SUMMARY = "NPM: electron-to-chromium"
DESCRIPTION = "Provides a list of electron-to-chromium version mappings"
HOMEPAGE = "https://github.com/kilian/electron-to-chromium#readme"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c4bd4cd0c32203ba1496aa7686422491"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/electron-to-chromium/-/electron-to-chromium-1.3.814.tgz"
SRC_URI[md5sum] = "b2cb50b4eccfd6f7b56d2f54d15cb2e3"
SRC_URI[sha256sum] = "714748411a465506e891e1389dff912f23d68523c52b80e6118c363cd3347f45"

NPM_PKGNAME = "electron-to-chromium"

inherit npmhelper
inherit native
