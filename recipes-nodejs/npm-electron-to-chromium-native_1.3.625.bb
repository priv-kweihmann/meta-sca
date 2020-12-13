SUMMARY = "NPM: electron-to-chromium"
DESCRIPTION = "Provides a list of electron-to-chromium version mappings"
HOMEPAGE = "https://github.com/kilian/electron-to-chromium#readme"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c4bd4cd0c32203ba1496aa7686422491"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/electron-to-chromium/-/electron-to-chromium-1.3.625.tgz"
SRC_URI[md5sum] = "5d0de7c06a50e397ac27826d3931cf39"
SRC_URI[sha256sum] = "6a09f756951afc7f4f2b972b994cee8102a56dc6a4831a819f590a8a9d903932"

NPM_PKGNAME = "electron-to-chromium"

inherit npmhelper
inherit native
