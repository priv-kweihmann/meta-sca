SUMMARY = "NPM: electron-to-chromium"
DESCRIPTION = "Provides a list of electron-to-chromium version mappings"
HOMEPAGE = "https://github.com/kilian/electron-to-chromium#readme"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c4bd4cd0c32203ba1496aa7686422491"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/electron-to-chromium/-/electron-to-chromium-1.3.707.tgz"
SRC_URI[md5sum] = "c78528d11f54f316361d71587ca335fa"
SRC_URI[sha256sum] = "03d6b013cf35f19174ce68d04f2a92f31873feea5f5a8f05ba5918c81294d645"

NPM_PKGNAME = "electron-to-chromium"

inherit npmhelper
inherit native
