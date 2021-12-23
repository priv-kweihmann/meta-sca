SUMMARY = "NPM: colors"
DESCRIPTION = "get colors in your node.js console"
HOMEPAGE = "https://github.com/Marak/colors.js"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=441ee46669f9365ff2492e9b555c8ee7"

SRC_URI = "https://registry.npmjs.org/colors/-/colors-1.4.0.tgz"
SRC_URI[md5sum] = "bee8e804d306d321bce74d0a3bfe98b8"
SRC_URI[sha256sum] = "b50eb83eda7cc37519809e240338fded8e625169945bbfe6d4156445c6610498"

NPM_PKGNAME = "colors"

inherit npmhelper
inherit native
