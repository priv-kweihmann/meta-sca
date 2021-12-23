SUMMARY = "NPM: acorn-jsx"
DESCRIPTION = "Modern, fast React.js JSX parser"
HOMEPAGE = "https://github.com/acornjs/acorn-jsx"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d31df94bc162bf7b3c8f6cc547294075"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/acorn-jsx/-/acorn-jsx-5.3.2.tgz"
SRC_URI[md5sum] = "f3da43a75d174d2021262164aa77170a"
SRC_URI[sha256sum] = "d967b05e40c5396a56d70e0d3150477b969cb6cc1058d68bc2b95ab0159158cc"

NPM_PKGNAME = "acorn-jsx"

inherit npmhelper
inherit native
