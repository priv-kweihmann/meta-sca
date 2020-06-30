SUMMARY = "NPM: electron-to-chromium"
DESCRIPTION = "Provides a list of electron-to-chromium version mappings"
HOMEPAGE = "https://github.com/kilian/electron-to-chromium#readme"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c4bd4cd0c32203ba1496aa7686422491"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/electron-to-chromium/-/electron-to-chromium-1.3.483.tgz"
SRC_URI[md5sum] = "eed3eb8144b5c8a88310f7509f78ebd8"
SRC_URI[sha256sum] = "baf6793457622dc9833966744b50e8cda8ab1f182e27118930f16c4450d76b4a"

NPM_PKGNAME = "electron-to-chromium"

inherit npmhelper
inherit native
