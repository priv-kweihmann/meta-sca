SUMMARY = "NPM: electron-to-chromium"
DESCRIPTION = "Provides a list of electron-to-chromium version mappings"
HOMEPAGE = "https://github.com/kilian/electron-to-chromium#readme"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c4bd4cd0c32203ba1496aa7686422491"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/electron-to-chromium/-/electron-to-chromium-1.3.864.tgz"
SRC_URI[md5sum] = "4aa62071e1d39ca3677ff3ac045f58db"
SRC_URI[sha256sum] = "921900733f543effc1f442c90a2899dd613160954f9269d4e6487e0e666da9db"

NPM_PKGNAME = "electron-to-chromium"

inherit npmhelper
inherit native
