SUMMARY = "NPM: electron-to-chromium"
DESCRIPTION = "Provides a list of electron-to-chromium version mappings"
HOMEPAGE = "https://github.com/kilian/electron-to-chromium#readme"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c4bd4cd0c32203ba1496aa7686422491"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/electron-to-chromium/-/electron-to-chromium-1.3.641.tgz"
SRC_URI[md5sum] = "361587e1a6a0d237d7338a8582e6a283"
SRC_URI[sha256sum] = "751d03346ccf0870e4dfd9da933eda9e4c0204ebf696e7bca693c8d6d99cc81f"

NPM_PKGNAME = "electron-to-chromium"

inherit npmhelper
inherit native
