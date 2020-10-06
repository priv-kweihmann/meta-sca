SUMMARY = "NPM: electron-to-chromium"
DESCRIPTION = "Provides a list of electron-to-chromium version mappings"
HOMEPAGE = "https://github.com/kilian/electron-to-chromium#readme"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c4bd4cd0c32203ba1496aa7686422491"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/electron-to-chromium/-/electron-to-chromium-1.3.577.tgz"
SRC_URI[md5sum] = "21d53152c2b10744f8f092311b371ce4"
SRC_URI[sha256sum] = "58b47082dcba57aa0d6d6765fac63b9948ed670fd8089e7772495036526fb5e6"

NPM_PKGNAME = "electron-to-chromium"

inherit npmhelper
inherit native
