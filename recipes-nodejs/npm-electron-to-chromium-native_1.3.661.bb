SUMMARY = "NPM: electron-to-chromium"
DESCRIPTION = "Provides a list of electron-to-chromium version mappings"
HOMEPAGE = "https://github.com/kilian/electron-to-chromium#readme"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c4bd4cd0c32203ba1496aa7686422491"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/electron-to-chromium/-/electron-to-chromium-1.3.661.tgz"
SRC_URI[md5sum] = "e9c89d486d79e605c2552a60939376ea"
SRC_URI[sha256sum] = "375dea518bb668ca8e1b693c99f947c765607bc83cf437f71da4eb0b3d721b36"

NPM_PKGNAME = "electron-to-chromium"

inherit npmhelper
inherit native
