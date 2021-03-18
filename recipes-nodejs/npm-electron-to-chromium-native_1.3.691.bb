SUMMARY = "NPM: electron-to-chromium"
DESCRIPTION = "Provides a list of electron-to-chromium version mappings"
HOMEPAGE = "https://github.com/kilian/electron-to-chromium#readme"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c4bd4cd0c32203ba1496aa7686422491"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/electron-to-chromium/-/electron-to-chromium-1.3.691.tgz"
SRC_URI[md5sum] = "0b1963f89c0a1f1c5b270f1e8f6e4af8"
SRC_URI[sha256sum] = "4d9c1c8517df7bdeb3ffe960dbc74cabb231300746b3d1c080286844fe6f6684"

NPM_PKGNAME = "electron-to-chromium"

inherit npmhelper
inherit native
