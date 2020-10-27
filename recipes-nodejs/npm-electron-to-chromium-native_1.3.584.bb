SUMMARY = "NPM: electron-to-chromium"
DESCRIPTION = "Provides a list of electron-to-chromium version mappings"
HOMEPAGE = "https://github.com/kilian/electron-to-chromium#readme"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c4bd4cd0c32203ba1496aa7686422491"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/electron-to-chromium/-/electron-to-chromium-1.3.584.tgz"
SRC_URI[md5sum] = "4fec0cafc853e5e27c5dab9b064f62a7"
SRC_URI[sha256sum] = "995436f6e1ebe0e69c68dbbfe9f1daf6a22204378ea5a3679716f1cb2611d208"

NPM_PKGNAME = "electron-to-chromium"

inherit npmhelper
inherit native
