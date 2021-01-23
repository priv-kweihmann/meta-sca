SUMMARY = "NPM: electron-to-chromium"
DESCRIPTION = "Provides a list of electron-to-chromium version mappings"
HOMEPAGE = "https://github.com/kilian/electron-to-chromium#readme"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c4bd4cd0c32203ba1496aa7686422491"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/electron-to-chromium/-/electron-to-chromium-1.3.644.tgz"
SRC_URI[md5sum] = "139de1f57c7b83c36430f8925a4b219d"
SRC_URI[sha256sum] = "07d07d7092068e0fc75a28aa250e6b1abe53a2e20ca8628c9bd03b46a80a7647"

NPM_PKGNAME = "electron-to-chromium"

inherit npmhelper
inherit native
