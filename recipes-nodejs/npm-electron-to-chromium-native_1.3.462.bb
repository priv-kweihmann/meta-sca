SUMMARY = "NPM: electron-to-chromium"
DESCRIPTION = "Provides a list of electron-to-chromium version mappings"
HOMEPAGE = "https://github.com/kilian/electron-to-chromium#readme"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c4bd4cd0c32203ba1496aa7686422491"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/electron-to-chromium/-/electron-to-chromium-1.3.462.tgz"
SRC_URI[md5sum] = "cadbd2a693169d1015816dc29471ea25"
SRC_URI[sha256sum] = "4d538eb2e8c25962076d2708cdc340e08e467a509684fecd794d9fa07a058915"

NPM_PKGNAME = "electron-to-chromium"

inherit npmhelper
inherit native
