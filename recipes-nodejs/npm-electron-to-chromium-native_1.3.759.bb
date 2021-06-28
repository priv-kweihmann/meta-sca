SUMMARY = "NPM: electron-to-chromium"
DESCRIPTION = "Provides a list of electron-to-chromium version mappings"
HOMEPAGE = "https://github.com/kilian/electron-to-chromium#readme"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c4bd4cd0c32203ba1496aa7686422491"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/electron-to-chromium/-/electron-to-chromium-1.3.759.tgz"
SRC_URI[md5sum] = "42e1b8e3a8c165952f2a7f3cc2bbec93"
SRC_URI[sha256sum] = "401a18b322cd6ed5e7ed3a83d8840a877f2d78e6b470e687e9ce3975570e63e6"

NPM_PKGNAME = "electron-to-chromium"

inherit npmhelper
inherit native
