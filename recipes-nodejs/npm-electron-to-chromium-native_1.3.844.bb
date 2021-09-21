SUMMARY = "NPM: electron-to-chromium"
DESCRIPTION = "Provides a list of electron-to-chromium version mappings"
HOMEPAGE = "https://github.com/kilian/electron-to-chromium#readme"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c4bd4cd0c32203ba1496aa7686422491"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/electron-to-chromium/-/electron-to-chromium-1.3.844.tgz"
SRC_URI[md5sum] = "ced00783d6d75dc0175ba1aa76a246d6"
SRC_URI[sha256sum] = "10731a4f965177cb0d274a74042c7c367bcc364e95b7b9decc0d0ca34d00d318"

NPM_PKGNAME = "electron-to-chromium"

inherit npmhelper
inherit native
