SUMMARY = "NPM: electron-to-chromium"
DESCRIPTION = "Provides a list of electron-to-chromium version mappings"
HOMEPAGE = "https://github.com/kilian/electron-to-chromium#readme"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c4bd4cd0c32203ba1496aa7686422491"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/electron-to-chromium/-/electron-to-chromium-1.3.850.tgz"
SRC_URI[md5sum] = "f9ee660187bff08f2177b82f15193b1e"
SRC_URI[sha256sum] = "2d150a762ac5d8dcb2ee844946b75a2369841378f4f06ea30a709a75c5873018"

NPM_PKGNAME = "electron-to-chromium"

inherit npmhelper
inherit native
