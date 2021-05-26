SUMMARY = "NPM: electron-to-chromium"
DESCRIPTION = "Provides a list of electron-to-chromium version mappings"
HOMEPAGE = "https://github.com/kilian/electron-to-chromium#readme"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c4bd4cd0c32203ba1496aa7686422491"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/electron-to-chromium/-/electron-to-chromium-1.3.739.tgz"
SRC_URI[md5sum] = "03a6782382003b963742844f8951f1ca"
SRC_URI[sha256sum] = "83672b60bef837be028536376a6b0f62b22f9dab7713e645b7ac5b8f92f03df4"

NPM_PKGNAME = "electron-to-chromium"

inherit npmhelper
inherit native
