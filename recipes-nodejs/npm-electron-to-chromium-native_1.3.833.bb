SUMMARY = "NPM: electron-to-chromium"
DESCRIPTION = "Provides a list of electron-to-chromium version mappings"
HOMEPAGE = "https://github.com/kilian/electron-to-chromium#readme"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c4bd4cd0c32203ba1496aa7686422491"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/electron-to-chromium/-/electron-to-chromium-1.3.833.tgz"
SRC_URI[md5sum] = "9026f3ea802ccdb20404fcf5f4f5d46f"
SRC_URI[sha256sum] = "171ba6a7c57f697bac50b273397c1735369b285acfcc2424cb76eca1d1de7a2d"

NPM_PKGNAME = "electron-to-chromium"

inherit npmhelper
inherit native
