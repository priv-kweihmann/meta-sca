SUMMARY = "NPM: electron-to-chromium"
DESCRIPTION = "Provides a list of electron-to-chromium version mappings"
HOMEPAGE = "https://github.com/kilian/electron-to-chromium#readme"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c4bd4cd0c32203ba1496aa7686422491"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/electron-to-chromium/-/electron-to-chromium-1.3.871.tgz"
SRC_URI[md5sum] = "2afd1acb0455085625de6f6f76ff9401"
SRC_URI[sha256sum] = "0470597b7d7012c5b9e0876baf35497dc8e6b5e9e34634c0182cd403601df0fa"

NPM_PKGNAME = "electron-to-chromium"

inherit npmhelper
inherit native
