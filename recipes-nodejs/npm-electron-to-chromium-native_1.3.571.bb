SUMMARY = "NPM: electron-to-chromium"
DESCRIPTION = "Provides a list of electron-to-chromium version mappings"
HOMEPAGE = "https://github.com/kilian/electron-to-chromium#readme"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c4bd4cd0c32203ba1496aa7686422491"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/electron-to-chromium/-/electron-to-chromium-1.3.571.tgz"
SRC_URI[md5sum] = "ca3b4c9ecb0b5ed3030a5644809a7394"
SRC_URI[sha256sum] = "4463200f53786e3b46767555e66fe4f8ac48199d508d7f85ee246700c8bf35b6"

NPM_PKGNAME = "electron-to-chromium"

inherit npmhelper
inherit native
