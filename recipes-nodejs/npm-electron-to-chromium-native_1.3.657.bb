SUMMARY = "NPM: electron-to-chromium"
DESCRIPTION = "Provides a list of electron-to-chromium version mappings"
HOMEPAGE = "https://github.com/kilian/electron-to-chromium#readme"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c4bd4cd0c32203ba1496aa7686422491"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/electron-to-chromium/-/electron-to-chromium-1.3.657.tgz"
SRC_URI[md5sum] = "0ec9fb772a5f6de065de07878424181d"
SRC_URI[sha256sum] = "2713a836ef67475416df099a72619f6d215db560217c2294a69f0dbe9df6af44"

NPM_PKGNAME = "electron-to-chromium"

inherit npmhelper
inherit native
