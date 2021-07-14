SUMMARY = "NPM: electron-to-chromium"
DESCRIPTION = "Provides a list of electron-to-chromium version mappings"
HOMEPAGE = "https://github.com/kilian/electron-to-chromium#readme"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c4bd4cd0c32203ba1496aa7686422491"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/electron-to-chromium/-/electron-to-chromium-1.3.775.tgz"
SRC_URI[md5sum] = "9be5d1d7637cd6ffcd332cf4c80f0bb5"
SRC_URI[sha256sum] = "cc63b89f65f78700eb67c5e4e67935c042b0688846bc4c40ef02fa818272e21a"

NPM_PKGNAME = "electron-to-chromium"

inherit npmhelper
inherit native
