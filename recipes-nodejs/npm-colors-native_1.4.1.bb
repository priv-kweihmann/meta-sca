SUMMARY = "NPM: colors"
DESCRIPTION = "get colors in your node.js console"
HOMEPAGE = "https://github.com/Marak/colors.js"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=441ee46669f9365ff2492e9b555c8ee7"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/colors/-/colors-1.4.1.tgz"
SRC_URI[md5sum] = "12c1485cf077b847c0a8aed34d0da783"
SRC_URI[sha256sum] = "2b8a430222378a251194559d3376c8434485d6c165ba0704e570d11dea636023"

NPM_PKGNAME = "colors"

inherit npmhelper
inherit native
