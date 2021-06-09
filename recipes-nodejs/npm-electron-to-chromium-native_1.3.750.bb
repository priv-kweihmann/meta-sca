SUMMARY = "NPM: electron-to-chromium"
DESCRIPTION = "Provides a list of electron-to-chromium version mappings"
HOMEPAGE = "https://github.com/kilian/electron-to-chromium#readme"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c4bd4cd0c32203ba1496aa7686422491"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/electron-to-chromium/-/electron-to-chromium-1.3.750.tgz"
SRC_URI[md5sum] = "ef760aafaf79314d5f4d72147df7c5fd"
SRC_URI[sha256sum] = "0015b540baf1c76c86b5d39a550dc32193252d61a7a7e5f190a220073c221e32"

NPM_PKGNAME = "electron-to-chromium"

inherit npmhelper
inherit native
