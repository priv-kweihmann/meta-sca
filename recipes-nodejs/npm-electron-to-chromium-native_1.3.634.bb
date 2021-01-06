SUMMARY = "NPM: electron-to-chromium"
DESCRIPTION = "Provides a list of electron-to-chromium version mappings"
HOMEPAGE = "https://github.com/kilian/electron-to-chromium#readme"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c4bd4cd0c32203ba1496aa7686422491"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/electron-to-chromium/-/electron-to-chromium-1.3.634.tgz"
SRC_URI[md5sum] = "9893a19128f6f5e4b61f3894ef413b1f"
SRC_URI[sha256sum] = "d56d2b1eeda420e4cbb0f381e9d06ac6498bfa19ba1b3aad29cad1e78b851aa8"

NPM_PKGNAME = "electron-to-chromium"

inherit npmhelper
inherit native
