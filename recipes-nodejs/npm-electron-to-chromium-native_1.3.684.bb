SUMMARY = "NPM: electron-to-chromium"
DESCRIPTION = "Provides a list of electron-to-chromium version mappings"
HOMEPAGE = "https://github.com/kilian/electron-to-chromium#readme"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c4bd4cd0c32203ba1496aa7686422491"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/electron-to-chromium/-/electron-to-chromium-1.3.684.tgz"
SRC_URI[md5sum] = "6b98cbce29612160c1708b51fda1dc96"
SRC_URI[sha256sum] = "7e91ecf2c2a36eb32d512b881b0f7361046611e23d4f3e455fe4d613311acae7"

NPM_PKGNAME = "electron-to-chromium"

inherit npmhelper
inherit native
