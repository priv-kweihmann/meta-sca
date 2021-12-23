SUMMARY = "NPM: postcss-value-parser"
DESCRIPTION = "Transforms css values and at-rule params into the tree"
HOMEPAGE = "https://github.com/TrySound/postcss-value-parser"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=192f05d9cfe483ed2a4511ffd5af5895"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/postcss-value-parser/-/postcss-value-parser-4.2.0.tgz"
SRC_URI[md5sum] = "515274a1ced8ca09771520430664e36d"
SRC_URI[sha256sum] = "3de5372cf95b66a344b258a046b1b298b20ecaf187637f4d59f50017836a90a7"

NPM_PKGNAME = "postcss-value-parser"

inherit npmhelper
inherit native
