SUMMARY = "NPM: electron-to-chromium"
DESCRIPTION = "Provides a list of electron-to-chromium version mappings"
HOMEPAGE = "https://github.com/kilian/electron-to-chromium#readme"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c4bd4cd0c32203ba1496aa7686422491"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/electron-to-chromium/-/electron-to-chromium-1.3.501.tgz"
SRC_URI[md5sum] = "83c1424403ae5f66f6a82b2fa11eea67"
SRC_URI[sha256sum] = "9f05390debc3c845bc385494e2e390a183d940b6973db850aba7184120ce6283"

NPM_PKGNAME = "electron-to-chromium"

inherit npmhelper
inherit native
