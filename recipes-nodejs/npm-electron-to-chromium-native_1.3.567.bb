SUMMARY = "NPM: electron-to-chromium"
DESCRIPTION = "Provides a list of electron-to-chromium version mappings"
HOMEPAGE = "https://github.com/kilian/electron-to-chromium#readme"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c4bd4cd0c32203ba1496aa7686422491"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/electron-to-chromium/-/electron-to-chromium-1.3.567.tgz"
SRC_URI[md5sum] = "af40645690a08d2620cff96284f53916"
SRC_URI[sha256sum] = "fbd08e3a0fcc8771d2243450d85cc8092a5f33640e6af43ab830d2419e1fc929"

NPM_PKGNAME = "electron-to-chromium"

inherit npmhelper
inherit native
