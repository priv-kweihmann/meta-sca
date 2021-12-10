SUMMARY = "NPM: electron-to-chromium"
DESCRIPTION = "Provides a list of electron-to-chromium version mappings"
HOMEPAGE = "https://github.com/kilian/electron-to-chromium#readme"
DEFAULT_PREFERENCE = "-1"
LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c4bd4cd0c32203ba1496aa7686422491"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/electron-to-chromium/-/electron-to-chromium-1.4.15.tgz"
SRC_URI[md5sum] = "58bec29da40e02620c190b5ccc70c510"
SRC_URI[sha256sum] = "c20c03b39c32bdfa09fb3bc1c221f6a7b59172b64d7950919ad2d0e1e78effdd"

NPM_PKGNAME = "electron-to-chromium"

inherit npmhelper
inherit native
