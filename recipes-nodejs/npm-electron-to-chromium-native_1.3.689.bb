SUMMARY = "NPM: electron-to-chromium"
DESCRIPTION = "Provides a list of electron-to-chromium version mappings"
HOMEPAGE = "https://github.com/kilian/electron-to-chromium#readme"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c4bd4cd0c32203ba1496aa7686422491"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/electron-to-chromium/-/electron-to-chromium-1.3.689.tgz"
SRC_URI[md5sum] = "ed9e6418d442bf8e667f4d5f21b673a9"
SRC_URI[sha256sum] = "f064e1f9b458222bb1b0812c7520409e2a9c56c0cc5ff2b5a443ffaf7615dca3"

NPM_PKGNAME = "electron-to-chromium"

inherit npmhelper
inherit native
