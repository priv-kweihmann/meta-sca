SUMMARY = "NPM: electron-to-chromium"
DESCRIPTION = "Provides a list of electron-to-chromium version mappings"
HOMEPAGE = "https://github.com/kilian/electron-to-chromium#readme"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c4bd4cd0c32203ba1496aa7686422491"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/electron-to-chromium/-/electron-to-chromium-1.3.560.tgz"
SRC_URI[md5sum] = "a5eb4877d7dfc9ff73b5265c34c374d6"
SRC_URI[sha256sum] = "8a1a8fda347533d87f4b9955a839f1e4a8e07bbb2aeb55b1c06d1511df81be01"

NPM_PKGNAME = "electron-to-chromium"

inherit npmhelper
inherit native
