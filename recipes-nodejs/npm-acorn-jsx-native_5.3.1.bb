SUMMARY = "NPM: acorn-jsx"
DESCRIPTION = "Modern, fast React.js JSX parser"
HOMEPAGE = "https://github.com/acornjs/acorn-jsx"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d31df94bc162bf7b3c8f6cc547294075"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/acorn-jsx/-/acorn-jsx-5.3.1.tgz"
SRC_URI[md5sum] = "88e4219a414c44747e0cada380679f70"
SRC_URI[sha256sum] = "d8125f8e16bfeaa810a0b6dc1dc3c932024b6fd6473636edfc53d58bf87152dd"

NPM_PKGNAME = "acorn-jsx"

inherit npmhelper
inherit native
