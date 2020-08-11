SUMMARY = "NPM: electron-to-chromium"
DESCRIPTION = "Provides a list of electron-to-chromium version mappings"
HOMEPAGE = "https://github.com/kilian/electron-to-chromium#readme"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c4bd4cd0c32203ba1496aa7686422491"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/electron-to-chromium/-/electron-to-chromium-1.3.529.tgz"
SRC_URI[md5sum] = "6a9bc32bda01de6569b0cbf4aec09448"
SRC_URI[sha256sum] = "0951e4695657df768eee0a6a72985cdc10239d18e68a01ecabbc47c206a8f5a6"

NPM_PKGNAME = "electron-to-chromium"

inherit npmhelper
inherit native
