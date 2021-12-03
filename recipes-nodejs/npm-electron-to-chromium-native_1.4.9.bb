SUMMARY = "NPM: electron-to-chromium"
DESCRIPTION = "Provides a list of electron-to-chromium version mappings"
HOMEPAGE = "https://github.com/kilian/electron-to-chromium#readme"
DEFAULT_PREFERENCE = "-1"
LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c4bd4cd0c32203ba1496aa7686422491"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/electron-to-chromium/-/electron-to-chromium-1.4.9.tgz"
SRC_URI[md5sum] = "f5cebf8d92b530930578f5cfac5ebba0"
SRC_URI[sha256sum] = "e91afd82da9c6b127a87287ffc194dc590244f34fb987315763d770510d5ed88"

NPM_PKGNAME = "electron-to-chromium"

inherit npmhelper
inherit native
