SUMMARY = "NPM: electron-to-chromium"
DESCRIPTION = "Provides a list of electron-to-chromium version mappings"
HOMEPAGE = "https://github.com/kilian/electron-to-chromium#readme"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c4bd4cd0c32203ba1496aa7686422491"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/electron-to-chromium/-/electron-to-chromium-1.3.540.tgz"
SRC_URI[md5sum] = "ff67b148f5ab7c0ccd3edf2a1bb363ed"
SRC_URI[sha256sum] = "d382fe2a8252c27a60a6f22edf985cdb394f075166ca00d39b87c5b7a3b17532"

NPM_PKGNAME = "electron-to-chromium"

inherit npmhelper
inherit native
