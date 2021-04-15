SUMMARY = "NPM: electron-to-chromium"
DESCRIPTION = "Provides a list of electron-to-chromium version mappings"
HOMEPAGE = "https://github.com/kilian/electron-to-chromium#readme"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c4bd4cd0c32203ba1496aa7686422491"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/electron-to-chromium/-/electron-to-chromium-1.3.717.tgz"
SRC_URI[md5sum] = "50b39de8d076f568e9355a8eb31e743b"
SRC_URI[sha256sum] = "62fb0cd10a214a7bb535cc50a0b03d2397d660d93a88524a365ddaa42abddbbb"

NPM_PKGNAME = "electron-to-chromium"

inherit npmhelper
inherit native
