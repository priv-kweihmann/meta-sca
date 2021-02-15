SUMMARY = "NPM: electron-to-chromium"
DESCRIPTION = "Provides a list of electron-to-chromium version mappings"
HOMEPAGE = "https://github.com/kilian/electron-to-chromium#readme"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c4bd4cd0c32203ba1496aa7686422491"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/electron-to-chromium/-/electron-to-chromium-1.3.664.tgz"
SRC_URI[md5sum] = "933d9f7bcd5fc1b9c1d627dcf5327fc2"
SRC_URI[sha256sum] = "cfb39f48791ff54b737b1ef23185fbf9c24d2cca4f281bb167571dc33754805a"

NPM_PKGNAME = "electron-to-chromium"

inherit npmhelper
inherit native
