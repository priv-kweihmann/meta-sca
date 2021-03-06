SUMMARY = "NPM: electron-to-chromium"
DESCRIPTION = "Provides a list of electron-to-chromium version mappings"
HOMEPAGE = "https://github.com/kilian/electron-to-chromium#readme"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c4bd4cd0c32203ba1496aa7686422491"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/electron-to-chromium/-/electron-to-chromium-1.3.682.tgz"
SRC_URI[md5sum] = "e21057d873803f8084a7167e7351f3d1"
SRC_URI[sha256sum] = "5c746429dcb09917fd8f5a524ae69fcf18f9c43ebb3a670f3865f875dc639f58"

NPM_PKGNAME = "electron-to-chromium"

inherit npmhelper
inherit native
