SUMMARY = "NPM: electron-to-chromium"
DESCRIPTION = "Provides a list of electron-to-chromium version mappings"
HOMEPAGE = "https://github.com/kilian/electron-to-chromium#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c4bd4cd0c32203ba1496aa7686422491"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/electron-to-chromium/-/electron-to-chromium-1.4.29.tgz"
SRC_URI[md5sum] = "f4f2840a3e87dd9f2ff56c1c017f88d9"
SRC_URI[sha256sum] = "a281de27a5a0ddc9122dd8a7a77577923b01c221e818b9a4bed12e2600786cac"

NPM_PKGNAME = "electron-to-chromium"

inherit npmhelper
inherit native
