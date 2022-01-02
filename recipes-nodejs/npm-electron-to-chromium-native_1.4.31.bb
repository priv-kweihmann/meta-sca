SUMMARY = "NPM: electron-to-chromium"
DESCRIPTION = "Provides a list of electron-to-chromium version mappings"
HOMEPAGE = "https://github.com/kilian/electron-to-chromium#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c4bd4cd0c32203ba1496aa7686422491"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/electron-to-chromium/-/electron-to-chromium-1.4.31.tgz"
SRC_URI[md5sum] = "f89806c120ef1a9915625ec7d2e2492c"
SRC_URI[sha256sum] = "a5f5c8e41671285af6db9f08269e3c78b63982d1620574fc4cf0dce86a745767"

NPM_PKGNAME = "electron-to-chromium"

inherit npmhelper
inherit native
