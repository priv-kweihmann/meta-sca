SUMMARY = "NPM: electron-to-chromium"
DESCRIPTION = "Provides a list of electron-to-chromium version mappings"
HOMEPAGE = "https://github.com/kilian/electron-to-chromium#readme"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c4bd4cd0c32203ba1496aa7686422491"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/electron-to-chromium/-/electron-to-chromium-1.3.859.tgz"
SRC_URI[md5sum] = "fc5723b73cb6645e754508ba96a46c0f"
SRC_URI[sha256sum] = "ebfc69c2df64b17f211647273924f4c9da78da6758159d0d746cc34c6a8c896d"

NPM_PKGNAME = "electron-to-chromium"

inherit npmhelper
inherit native
