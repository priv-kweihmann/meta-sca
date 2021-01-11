SUMMARY = "NPM: electron-to-chromium"
DESCRIPTION = "Provides a list of electron-to-chromium version mappings"
HOMEPAGE = "https://github.com/kilian/electron-to-chromium#readme"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c4bd4cd0c32203ba1496aa7686422491"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/electron-to-chromium/-/electron-to-chromium-1.3.635.tgz"
SRC_URI[md5sum] = "49f50f58f288419670b7a7b34e1dd05f"
SRC_URI[sha256sum] = "09800a5e723886e3488d60d576c6b1caf50c03067f5d6c97b8a95c58aef07ed4"

NPM_PKGNAME = "electron-to-chromium"

inherit npmhelper
inherit native
