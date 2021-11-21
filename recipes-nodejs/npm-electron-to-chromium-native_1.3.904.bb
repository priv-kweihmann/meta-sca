SUMMARY = "NPM: electron-to-chromium"
DESCRIPTION = "Provides a list of electron-to-chromium version mappings"
HOMEPAGE = "https://github.com/kilian/electron-to-chromium#readme"

DEFAULT_PREFERENCE = "-1"
LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c4bd4cd0c32203ba1496aa7686422491"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/electron-to-chromium/-/electron-to-chromium-1.3.904.tgz"
SRC_URI[md5sum] = "7a1e1fde1dd49b3fcdeb43c44eb0fd22"
SRC_URI[sha256sum] = "3639a87f743071a6318ac05db8e46ea44a6aed9665ac70c0469a11e818bb827a"

NPM_PKGNAME = "electron-to-chromium"

inherit npmhelper
inherit native
