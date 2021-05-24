SUMMARY = "NPM: micromark-extension-gfm-tagfilter"
DESCRIPTION = "micromark extension to support GFM tagfilter"
HOMEPAGE = "https://github.com/micromark/micromark-extension-gfm-tagfilter#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=6a9c614ad8a32fcd51b47e458d620e48"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/micromark-extension-gfm-tagfilter/-/micromark-extension-gfm-tagfilter-0.3.0.tgz"
SRC_URI[md5sum] = "68e5c52aa90e0103833880410bb9e703"
SRC_URI[sha256sum] = "606597f93113ba8a4ba78b016ba01b8e0f0b3a417692f6c74ebed5182882b529"

NPM_PKGNAME = "micromark-extension-gfm-tagfilter"

inherit npmhelper
inherit native
