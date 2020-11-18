SUMMARY = "NPM: electron-to-chromium"
DESCRIPTION = "Provides a list of electron-to-chromium version mappings"
HOMEPAGE = "https://github.com/kilian/electron-to-chromium#readme"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c4bd4cd0c32203ba1496aa7686422491"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/electron-to-chromium/-/electron-to-chromium-1.3.598.tgz"
SRC_URI[md5sum] = "7a0ef9d0c811949ba0b3aebe45c13cac"
SRC_URI[sha256sum] = "ae6d8f6a72205e4b6612d7ad1d6dff154769fbf48823a2e5a38de794daa8ed8b"

NPM_PKGNAME = "electron-to-chromium"

inherit npmhelper
inherit native
