SUMMARY = "NPM: electron-to-chromium"
DESCRIPTION = "Provides a list of electron-to-chromium version mappings"
HOMEPAGE = "https://github.com/kilian/electron-to-chromium#readme"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c4bd4cd0c32203ba1496aa7686422491"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/electron-to-chromium/-/electron-to-chromium-1.3.818.tgz"
SRC_URI[md5sum] = "33529265aac54c0603bc137df78d1488"
SRC_URI[sha256sum] = "cacd7d31811a8013fd275a6085e52453ccc344d230cbd67aa3bd8d34c06265b2"

NPM_PKGNAME = "electron-to-chromium"

inherit npmhelper
inherit native
