SUMMARY = "NPM: electron-to-chromium"
DESCRIPTION = "Provides a list of electron-to-chromium version mappings"
HOMEPAGE = "https://github.com/kilian/electron-to-chromium#readme"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c4bd4cd0c32203ba1496aa7686422491"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/electron-to-chromium/-/electron-to-chromium-1.3.873.tgz"
SRC_URI[md5sum] = "c8426d59fb139812e96e535343c87946"
SRC_URI[sha256sum] = "1e35ae2536f6ed3b964d9897a0aa4cc5fbeaf74885b0746f16135d0713e8b9f8"

NPM_PKGNAME = "electron-to-chromium"

inherit npmhelper
inherit native
