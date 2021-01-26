SUMMARY = "NPM: electron-to-chromium"
DESCRIPTION = "Provides a list of electron-to-chromium version mappings"
HOMEPAGE = "https://github.com/kilian/electron-to-chromium#readme"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c4bd4cd0c32203ba1496aa7686422491"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/electron-to-chromium/-/electron-to-chromium-1.3.645.tgz"
SRC_URI[md5sum] = "972606e554a8ecebc10ac93e6bc65700"
SRC_URI[sha256sum] = "0317c35f762b4436020f489c9e171a0e83cdca58a82947c7fc4752b523f335cb"

NPM_PKGNAME = "electron-to-chromium"

inherit npmhelper
inherit native
