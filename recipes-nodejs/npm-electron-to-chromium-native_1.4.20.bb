SUMMARY = "NPM: electron-to-chromium"
DESCRIPTION = "Provides a list of electron-to-chromium version mappings"
HOMEPAGE = "https://github.com/kilian/electron-to-chromium#readme"
DEFAULT_PREFERENCE = "-1"
LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c4bd4cd0c32203ba1496aa7686422491"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/electron-to-chromium/-/electron-to-chromium-1.4.20.tgz"
SRC_URI[md5sum] = "ff15328716c519d4e55f9d737e7a20ba"
SRC_URI[sha256sum] = "c6b0adbe7f7aa833923d12979093d50b044b1320355249db8ea04e08036eba66"

NPM_PKGNAME = "electron-to-chromium"

inherit npmhelper
inherit native
