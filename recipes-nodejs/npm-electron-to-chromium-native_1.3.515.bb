SUMMARY = "NPM: electron-to-chromium"
DESCRIPTION = "Provides a list of electron-to-chromium version mappings"
HOMEPAGE = "https://github.com/kilian/electron-to-chromium#readme"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c4bd4cd0c32203ba1496aa7686422491"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/electron-to-chromium/-/electron-to-chromium-1.3.515.tgz"
SRC_URI[md5sum] = "e34ca6e91939066debdf0093638e45e1"
SRC_URI[sha256sum] = "b7ac84e848a6aa990b23f54c550d39d949d24241f988150d07dadb265adcd7f8"

NPM_PKGNAME = "electron-to-chromium"

inherit npmhelper
inherit native
