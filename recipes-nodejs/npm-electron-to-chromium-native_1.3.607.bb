SUMMARY = "NPM: electron-to-chromium"
DESCRIPTION = "Provides a list of electron-to-chromium version mappings"
HOMEPAGE = "https://github.com/kilian/electron-to-chromium#readme"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c4bd4cd0c32203ba1496aa7686422491"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/electron-to-chromium/-/electron-to-chromium-1.3.607.tgz"
SRC_URI[md5sum] = "4252774e1b8ce3c3a50aad9ba5379690"
SRC_URI[sha256sum] = "9eb0c1b722be87de882fc5c18e7af0b7fe79dec703595ef7e56fe158a4e829cf"

NPM_PKGNAME = "electron-to-chromium"

inherit npmhelper
inherit native
