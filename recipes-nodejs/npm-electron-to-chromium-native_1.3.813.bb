SUMMARY = "NPM: electron-to-chromium"
DESCRIPTION = "Provides a list of electron-to-chromium version mappings"
HOMEPAGE = "https://github.com/kilian/electron-to-chromium#readme"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c4bd4cd0c32203ba1496aa7686422491"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/electron-to-chromium/-/electron-to-chromium-1.3.813.tgz"
SRC_URI[md5sum] = "bf017d7b4d30da4bb32baf13b7744ee2"
SRC_URI[sha256sum] = "21586f7e1d48dd523f67919752c12cfda344ff242958a32ef77b6bef96c03a48"

NPM_PKGNAME = "electron-to-chromium"

inherit npmhelper
inherit native
