SUMMARY = "NPM: electron-to-chromium"
DESCRIPTION = "Provides a list of electron-to-chromium version mappings"
HOMEPAGE = "https://github.com/kilian/electron-to-chromium#readme"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c4bd4cd0c32203ba1496aa7686422491"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/electron-to-chromium/-/electron-to-chromium-1.3.621.tgz"
SRC_URI[md5sum] = "d955ea014f8047238ba4844fb940fc48"
SRC_URI[sha256sum] = "a526093c4afc6de5cd6cff55d917667df1154a1305f97d3ecbe7d4f3ce273764"

NPM_PKGNAME = "electron-to-chromium"

inherit npmhelper
inherit native
