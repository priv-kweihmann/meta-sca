SUMMARY = "NPM: electron-to-chromium"
DESCRIPTION = "Provides a list of electron-to-chromium version mappings"
HOMEPAGE = "https://github.com/kilian/electron-to-chromium#readme"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c4bd4cd0c32203ba1496aa7686422491"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/electron-to-chromium/-/electron-to-chromium-1.3.861.tgz"
SRC_URI[md5sum] = "5a413722e84c9b5ad44121517a0dbbb5"
SRC_URI[sha256sum] = "c7f830b4b71311f75f442bc5e93ceabd4bcddc4482ff3bdc5b1f9203f11773d3"

NPM_PKGNAME = "electron-to-chromium"

inherit npmhelper
inherit native
