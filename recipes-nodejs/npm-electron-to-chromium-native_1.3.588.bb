SUMMARY = "NPM: electron-to-chromium"
DESCRIPTION = "Provides a list of electron-to-chromium version mappings"
HOMEPAGE = "https://github.com/kilian/electron-to-chromium#readme"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c4bd4cd0c32203ba1496aa7686422491"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/electron-to-chromium/-/electron-to-chromium-1.3.588.tgz"
SRC_URI[md5sum] = "0d2b526025a81162074971ae4317092f"
SRC_URI[sha256sum] = "31bd42b2205d1f49578374eb6da856f074361684972f83520f170914e7ad5db8"

NPM_PKGNAME = "electron-to-chromium"

inherit npmhelper
inherit native
