SUMMARY = "NPM: electron-to-chromium"
DESCRIPTION = "Provides a list of electron-to-chromium version mappings"
HOMEPAGE = "https://github.com/kilian/electron-to-chromium#readme"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c4bd4cd0c32203ba1496aa7686422491"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/electron-to-chromium/-/electron-to-chromium-1.3.695.tgz"
SRC_URI[md5sum] = "bd1b4ceb64bd143bc4fc6aa20285d36a"
SRC_URI[sha256sum] = "eb15cadcc03191237017cf113dac2d32d64d4b7ba00a068505b423898da41fe8"

NPM_PKGNAME = "electron-to-chromium"

inherit npmhelper
inherit native
