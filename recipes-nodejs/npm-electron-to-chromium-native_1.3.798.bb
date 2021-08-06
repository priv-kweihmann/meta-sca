SUMMARY = "NPM: electron-to-chromium"
DESCRIPTION = "Provides a list of electron-to-chromium version mappings"
HOMEPAGE = "https://github.com/kilian/electron-to-chromium#readme"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c4bd4cd0c32203ba1496aa7686422491"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/electron-to-chromium/-/electron-to-chromium-1.3.798.tgz"
SRC_URI[md5sum] = "c6833b04fdae4eb07912c1231998644b"
SRC_URI[sha256sum] = "a8c4f197aa706ad40b0d73c57ba0720b9efa723fd52920d8567e611f7933598d"

NPM_PKGNAME = "electron-to-chromium"

inherit npmhelper
inherit native
