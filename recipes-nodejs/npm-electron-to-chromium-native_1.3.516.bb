SUMMARY = "NPM: electron-to-chromium"
DESCRIPTION = "Provides a list of electron-to-chromium version mappings"
HOMEPAGE = "https://github.com/kilian/electron-to-chromium#readme"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c4bd4cd0c32203ba1496aa7686422491"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/electron-to-chromium/-/electron-to-chromium-1.3.516.tgz"
SRC_URI[md5sum] = "3dd7a6fb2717fb2feccab1dcef88049d"
SRC_URI[sha256sum] = "23b70d6e4e4e77ef278fc249b63552f752f994a9a600a54e043f0fe29e961f70"

NPM_PKGNAME = "electron-to-chromium"

inherit npmhelper
inherit native
