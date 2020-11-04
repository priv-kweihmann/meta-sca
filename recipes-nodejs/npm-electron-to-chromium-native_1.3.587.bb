SUMMARY = "NPM: electron-to-chromium"
DESCRIPTION = "Provides a list of electron-to-chromium version mappings"
HOMEPAGE = "https://github.com/kilian/electron-to-chromium#readme"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c4bd4cd0c32203ba1496aa7686422491"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/electron-to-chromium/-/electron-to-chromium-1.3.587.tgz"
SRC_URI[md5sum] = "03a73b18edebeceb82359dc048cb12c8"
SRC_URI[sha256sum] = "5ae901f86a5e0e729ecc8b314441042695b9f7f70c4fec3fb1c7afedf2e38fb9"

NPM_PKGNAME = "electron-to-chromium"

inherit npmhelper
inherit native
