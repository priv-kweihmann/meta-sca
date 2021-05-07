SUMMARY = "NPM: electron-to-chromium"
DESCRIPTION = "Provides a list of electron-to-chromium version mappings"
HOMEPAGE = "https://github.com/kilian/electron-to-chromium#readme"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c4bd4cd0c32203ba1496aa7686422491"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/electron-to-chromium/-/electron-to-chromium-1.3.727.tgz"
SRC_URI[md5sum] = "b333d33fce48c795eb0accc2a8a6bdd2"
SRC_URI[sha256sum] = "3bf8f850f8e595f0f496951ad7dcd1130054ddf757a9455ec332de7c05363231"

NPM_PKGNAME = "electron-to-chromium"

inherit npmhelper
inherit native
