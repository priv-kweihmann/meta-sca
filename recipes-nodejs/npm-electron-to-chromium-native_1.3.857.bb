SUMMARY = "NPM: electron-to-chromium"
DESCRIPTION = "Provides a list of electron-to-chromium version mappings"
HOMEPAGE = "https://github.com/kilian/electron-to-chromium#readme"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c4bd4cd0c32203ba1496aa7686422491"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/electron-to-chromium/-/electron-to-chromium-1.3.857.tgz"
SRC_URI[md5sum] = "e4ff19673a84f08052460827fba12df6"
SRC_URI[sha256sum] = "7d2ccb4c4c74214499463d793b38b0610f0c724b9df321cdb052913b50e5b0b0"

NPM_PKGNAME = "electron-to-chromium"

inherit npmhelper
inherit native
