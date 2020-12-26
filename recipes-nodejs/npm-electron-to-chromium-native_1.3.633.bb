SUMMARY = "NPM: electron-to-chromium"
DESCRIPTION = "Provides a list of electron-to-chromium version mappings"
HOMEPAGE = "https://github.com/kilian/electron-to-chromium#readme"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c4bd4cd0c32203ba1496aa7686422491"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/electron-to-chromium/-/electron-to-chromium-1.3.633.tgz"
SRC_URI[md5sum] = "9baa04c9d477ed051c61e79b5ab48d30"
SRC_URI[sha256sum] = "974a1c927bc794ca386aa629de49308ce0fb29d2a3197690c215bdfe9fb876b5"

NPM_PKGNAME = "electron-to-chromium"

inherit npmhelper
inherit native
