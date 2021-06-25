SUMMARY = "NPM: electron-to-chromium"
DESCRIPTION = "Provides a list of electron-to-chromium version mappings"
HOMEPAGE = "https://github.com/kilian/electron-to-chromium#readme"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c4bd4cd0c32203ba1496aa7686422491"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/electron-to-chromium/-/electron-to-chromium-1.3.758.tgz"
SRC_URI[md5sum] = "141700e645e9b2d869d402de130be3c4"
SRC_URI[sha256sum] = "b2147cd7a82454c4ea05b18eb7fbadc814e334b4bafb5b6b7e2a4d35530d7f79"

NPM_PKGNAME = "electron-to-chromium"

inherit npmhelper
inherit native
