SUMMARY = "NPM: electron-to-chromium"
DESCRIPTION = "Provides a list of electron-to-chromium version mappings"
HOMEPAGE = "https://github.com/kilian/electron-to-chromium#readme"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c4bd4cd0c32203ba1496aa7686422491"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/electron-to-chromium/-/electron-to-chromium-1.3.701.tgz"
SRC_URI[md5sum] = "3c2f8a294de8525ffe3e7a629b407970"
SRC_URI[sha256sum] = "20b351c84fcc5e86ee528338b4942dfd9c1afefdd013557996aea07c02e0174b"

NPM_PKGNAME = "electron-to-chromium"

inherit npmhelper
inherit native
