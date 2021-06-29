SUMMARY = "NPM: electron-to-chromium"
DESCRIPTION = "Provides a list of electron-to-chromium version mappings"
HOMEPAGE = "https://github.com/kilian/electron-to-chromium#readme"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c4bd4cd0c32203ba1496aa7686422491"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/electron-to-chromium/-/electron-to-chromium-1.3.760.tgz"
SRC_URI[md5sum] = "19141040247d1f7b719a01a09b33beb6"
SRC_URI[sha256sum] = "e46b8f37430b0a392486b87c9526b923047b6fa5a8095322e809489b2d068ed5"

NPM_PKGNAME = "electron-to-chromium"

inherit npmhelper
inherit native
